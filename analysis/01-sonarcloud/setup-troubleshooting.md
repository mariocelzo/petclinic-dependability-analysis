# SonarCloud Setup - Troubleshooting e Soluzioni

**Progetto**: Spring PetClinic Dependability Analysis  
**Data**: 28 Novembre 2025  
**Autore**: Mario Celzo

---

## 📋 Indice

1. [Panoramica del Processo](#panoramica-del-processo)
2. [Problema #1: Workflow Non Esistente](#problema-1-workflow-non-esistente)
3. [Problema #2: Versione Java Errata](#problema-2-versione-java-errata)
4. [Problema #3: OWASP Dependency-Check Fallito](#problema-3-owasp-dependency-check-fallito)
5. [Problema #4: Configurazione Organization](#problema-4-configurazione-organization)
6. [Configurazione Finale Funzionante](#configurazione-finale-funzionante)
7. [Lezioni Apprese](#lezioni-apprese)

---

## Panoramica del Processo

L'integrazione di SonarCloud con il progetto Spring PetClinic ha richiesto diversi tentativi prima di raggiungere una configurazione funzionante. Questo documento descrive dettagliatamente ogni problema incontrato e la soluzione adottata.

### Timeline degli Interventi

| Data | Problema | Tempo Risoluzione |
|------|----------|-------------------|
| 28/11/2025 | Workflow mancante | 10 min |
| 28/11/2025 | Java version mismatch | 15 min |
| 28/11/2025 | OWASP Dependency-Check fail | 45 min |
| 28/11/2025 | Organization non configurata | 10 min |

---

## Problema #1: Workflow Non Esistente

### Descrizione
Il workflow SonarCloud non esisteva nel repository. Era necessario creare da zero il file di configurazione per GitHub Actions.

### Sintomi
- Nessuna analisi visibile su SonarCloud
- GitHub Actions non mostrava alcun workflow per SonarCloud

### Causa
Il progetto Spring PetClinic originale non include un workflow pre-configurato per SonarCloud.

### Soluzione
Creazione del file `.github/workflows/sonarcloud.yml`:

```yaml
name: SonarQube

on:
  push:
    branches: [main]
  pull_request:
    types: [opened, synchronize, reopened]
  workflow_dispatch:

jobs:
  build:
    name: Build and analyze
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
        with:
          fetch-depth: 0
      # ... (configurazione completa sotto)
```

### Risultato
✅ Workflow creato e visibile in GitHub Actions

---

## Problema #2: Versione Java Errata

### Descrizione
Il workflow iniziale utilizzava Java 17, ma il progetto Spring PetClinic richiede Java 21.

### Sintomi
```
Error: Java 17 is not compatible with the project
[ERROR] Failed to execute goal on project spring-petclinic: 
Could not resolve dependencies
```

### Causa
Il template SonarCloud default utilizza Java 17, mentre `pom.xml` specifica:
```xml
<java.version>21</java.version>
```

### Soluzione
Modificare il workflow per usare Java 21:

```yaml
# PRIMA (Errato)
- name: Set up JDK 17
  uses: actions/setup-java@v4
  with:
    java-version: "17"
    distribution: "temurin"

# DOPO (Corretto)
- name: Set up JDK 21
  uses: actions/setup-java@v4
  with:
    java-version: "21"
    distribution: "temurin"
```

### Risultato
✅ Build Maven completata con successo

---

## Problema #3: OWASP Dependency-Check Fallito

### Descrizione
**Questo è stato il problema più complesso da diagnosticare.** Il workflow falliva nello step "Build and analyze" senza un messaggio di errore chiaro nei log di GitHub Actions.

### Sintomi
```
❌ Build and analyze: FAILED
Error: Process completed with exit code 1.
```

I log troncati di GitHub Actions non mostravano la causa reale.

### Diagnosi
Per identificare il problema, è stato necessario eseguire il build localmente:

```bash
./mvnw -B verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
  -Dsonar.projectKey=mariocelzo_petclinic-dependability-analysis \
  -Dsonar.host.url=https://sonarcloud.io
```

### Errore Reale Identificato

```
[ERROR] Failed to execute goal org.owasp:dependency-check-maven:8.4.0:check

Caused by: org.owasp.dependencycheck.utils.DownloadFailedException: 
Unable to download meta file: 
https://nvd.nist.gov/feeds/json/cve/1.1/nvdcve-1.1-modified.meta; 
received response code 403

TLS validation is enabled but the connection failed - 
unable to download file https://nvd.nist.gov/feeds/json/cve/1.1/...
```

### Causa Root

A partire da **dicembre 2023**, il database NVD (National Vulnerability Database) del NIST ha implementato rate limiting e ora **richiede una API Key** per l'accesso.

Il plugin OWASP Dependency-Check, configurato nel `pom.xml` di Spring PetClinic, tentava di scaricare il database CVE senza API key, ricevendo un errore **403 Forbidden**.

### Opzioni di Soluzione

| Opzione | Pro | Contro |
|---------|-----|--------|
| Registrare API Key NVD | Analisi vulnerabilità completa | Richiede registrazione, configurazione secrets |
| Skip Dependency-Check | Veloce, risolve immediatamente | Perde analisi dipendenze |
| Database locale | Nessuna dipendenza da NVD | Complesso da configurare |

### Soluzione Adottata

Skip del plugin OWASP Dependency-Check durante l'analisi SonarCloud, dato che:
1. SonarCloud ha il proprio sistema di analisi delle vulnerabilità
2. L'analisi delle dipendenze può essere fatta separatamente
3. Era prioritario avere SonarCloud funzionante

```yaml
- name: Build and analyze
  env:
    SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
  run: ./mvnw -B verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
    -Dsonar.projectKey=mariocelzo_petclinic-dependability-analysis \
    -Dsonar.host.url=https://sonarcloud.io \
    -Ddependency-check.skip=true  # <-- FIX
```

### Risultato
✅ Build completata senza errori OWASP

### Note per il Futuro

Per abilitare OWASP Dependency-Check in futuro:

1. Registrarsi su [NVD](https://nvd.nist.gov/developers/request-an-api-key)
2. Ottenere API Key
3. Aggiungere secret `NVD_API_KEY` in GitHub
4. Modificare il comando:

```yaml
run: ./mvnw -B verify ... -Dnvd.api.key=${{ secrets.NVD_API_KEY }}
```

---

## Problema #4: Configurazione Organization

### Descrizione
SonarCloud richiede che l'organizzazione sia specificata sia nel `pom.xml` che nel comando di analisi.

### Sintomi
```
ERROR: You're not authorized to run analysis. 
Please check the project configuration.
```

### Causa
Mancava la proprietà `sonar.organization` nel `pom.xml`.

### Soluzione
Aggiunta della proprietà nel `pom.xml`:

```xml
<properties>
    <!-- ... altre proprietà ... -->
    <sonar.organization>mariocelzo</sonar.organization>
</properties>
```

### Risultato
✅ Autorizzazione corretta per l'analisi

---

## Configurazione Finale Funzionante

### File: `.github/workflows/sonarcloud.yml`

```yaml
name: SonarQube

on:
  push:
    branches: [main]
  pull_request:
    types: [opened, synchronize, reopened]
  workflow_dispatch:

jobs:
  build:
    name: Build and analyze
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v4
        with:
          fetch-depth: 0  # Importante per blame info

      - name: Set up JDK 21
        uses: actions/setup-java@v4
        with:
          java-version: "21"
          distribution: "temurin"

      - name: Cache SonarQube packages
        uses: actions/cache@v4
        with:
          path: ~/.sonar/cache
          key: ${{ runner.os }}-sonar
          restore-keys: ${{ runner.os }}-sonar

      - name: Cache Maven packages
        uses: actions/cache@v4
        with:
          path: ~/.m2
          key: ${{ runner.os }}-m2-${{ hashFiles('**/pom.xml') }}
          restore-keys: ${{ runner.os }}-m2

      - name: Build and analyze
        env:
          SONAR_TOKEN: ${{ secrets.SONAR_TOKEN }}
        run: ./mvnw -B verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar \
          -Dsonar.projectKey=mariocelzo_petclinic-dependability-analysis \
          -Dsonar.host.url=https://sonarcloud.io \
          -Ddependency-check.skip=true
```

### Modifiche al `pom.xml`

```xml
<properties>
    <java.version>21</java.version>
    <sonar.organization>mariocelzo</sonar.organization>
    <!-- ... -->
</properties>
```

### GitHub Secrets Richiesti

| Secret | Descrizione | Come Ottenerlo |
|--------|-------------|----------------|
| `SONAR_TOKEN` | Token di autenticazione SonarCloud | SonarCloud → Account → Security → Generate Token |

---

## Lezioni Apprese

### 1. Debug Locale è Essenziale

> **Problema**: I log di GitHub Actions sono spesso troncati e non mostrano l'errore reale.
>
> **Lezione**: Quando un workflow fallisce senza motivo apparente, eseguire lo stesso comando localmente per vedere l'output completo.

### 2. Dipendenze Esterne Possono Cambiare

> **Problema**: Il database NVD ha iniziato a richiedere autenticazione senza preavviso.
>
> **Lezione**: Le dipendenze da servizi esterni possono smettere di funzionare. Prevedere sempre un fallback o skip option.

### 3. Versioni Java Devono Corrispondere

> **Problema**: Java 17 nel workflow vs Java 21 richiesto dal progetto.
>
> **Lezione**: Verificare sempre la versione Java richiesta nel `pom.xml` e configurare il workflow di conseguenza.

### 4. Documentare Tutto

> **Problema**: Senza documentazione, debug di problemi simili richiederebbe lo stesso tempo.
>
> **Lezione**: Creare questo tipo di documento per ogni integrazione complessa.

---

## Checklist per Nuovi Progetti

Per evitare questi problemi in futuro, seguire questa checklist:

- [ ] Verificare versione Java in `pom.xml`
- [ ] Configurare `sonar.organization` in `pom.xml`
- [ ] Creare secret `SONAR_TOKEN` in GitHub
- [ ] Testare build localmente prima del push
- [ ] Verificare se ci sono plugin che dipendono da servizi esterni
- [ ] Aggiungere flag di skip per plugin problematici se necessario
- [ ] Eseguire `workflow_dispatch` per test manuale
- [ ] Verificare i risultati su SonarCloud dashboard

---

## Risorse Utili

- [SonarCloud Documentation](https://docs.sonarcloud.io/)
- [GitHub Actions for SonarCloud](https://github.com/SonarSource/sonarcloud-github-action)
- [NVD API Key Registration](https://nvd.nist.gov/developers/request-an-api-key)
- [OWASP Dependency-Check Documentation](https://jeremylong.github.io/DependencyCheck/)
- [Maven Sonar Plugin](https://docs.sonarcloud.io/advanced-setup/ci-based-analysis/sonarscanner-for-maven/)

---

## Contatti e Supporto

Per problemi simili o domande su questa configurazione:

- **Repository**: [GitHub - petclinic-dependability-analysis](https://github.com/mariocelzo/petclinic-dependability-analysis)
- **SonarCloud Project**: [Dashboard](https://sonarcloud.io/project/overview?id=mariocelzo_petclinic-dependability-analysis)
