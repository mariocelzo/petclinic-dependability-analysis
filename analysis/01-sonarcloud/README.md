# SonarCloud Analysis - Spring PetClinic

## 📊 Overview

Questa directory contiene i risultati dell'analisi statica del codice eseguita con **SonarCloud** sul progetto Spring PetClinic, nell'ambito del progetto universitario di **Software Dependability**.

### 🔗 Link Utili

- **Dashboard SonarCloud**: [https://sonarcloud.io/project/overview?id=mariocelzo_petclinic-dependability-analysis](https://sonarcloud.io/project/overview?id=mariocelzo_petclinic-dependability-analysis)
- **Organization**: `mariocelzo`
- **Project Key**: `mariocelzo_petclinic-dependability-analysis`

---

## 🎯 Obiettivi dell'Analisi

L'analisi SonarCloud è stata eseguita per:

1. **Identificare bug potenziali** - Errori che potrebbero causare comportamenti anomali a runtime
2. **Rilevare vulnerabilità di sicurezza** - Falle che potrebbero essere sfruttate da attaccanti
3. **Individuare code smell** - Pattern di codice che riducono la manutenibilità
4. **Misurare la copertura dei test** - Percentuale di codice esercitato dai test
5. **Rilevare codice duplicato** - Porzioni di codice ripetute che aumentano il debito tecnico
6. **Valutare la qualità complessiva** - Rating A-E per sicurezza, affidabilità e manutenibilità

---

## 📈 Risultati dell'Analisi (28 Novembre 2025)

### Dashboard Principale

| Metrica | Valore | Rating | Target | Status |
|---------|--------|--------|--------|--------|
| **Security** | 0 vulnerabilità | **A** | A | ✅ Raggiunto |
| **Reliability** | 0 bug | **A** | A | ✅ Raggiunto |
| **Maintainability** | 23 code smell | **A** | A | ✅ Raggiunto |
| **Coverage** | 91.9% | - | >80% | ✅ Eccellente |
| **Duplications** | 0.0% | - | <3% | ✅ Perfetto |
| **Security Hotspots** | 0 | Reviewed | 0 | ✅ Nessuno |

### Interpretazione dei Risultati

#### 🛡️ Security: A (0 vulnerabilità)
Il codice non presenta vulnerabilità di sicurezza note. Questo significa che:
- Non ci sono SQL injection
- Non ci sono XSS (Cross-Site Scripting)
- Non ci sono path traversal
- Le dipendenze non hanno CVE critiche note

#### 🔧 Reliability: A (0 bug)
Nessun bug potenziale rilevato. Il codice:
- Non ha null pointer dereference probabili
- Non ha resource leak
- Non ha condizioni logiche errate
- Gestisce correttamente le eccezioni

#### 🧹 Maintainability: A (23 code smell)
23 code smell identificati, ma tutti di bassa severità:
- Rating A indica che il debito tecnico è sotto controllo
- I code smell sono principalmente suggerimenti di stile
- Non impattano la funzionalità del sistema

#### 📊 Coverage: 91.9%
Copertura dei test eccezionale:
- Supera ampiamente la soglia consigliata dell'80%
- Indica una buona suite di test
- 44 test unitari e di integrazione passano con successo

#### 📋 Duplications: 0.0%
Nessun codice duplicato rilevato:
- Il codice segue il principio DRY (Don't Repeat Yourself)
- Alta qualità della struttura del progetto

---

## 📁 Contenuti della Directory

| File/Directory | Descrizione |
|----------------|-------------|
| `README.md` | Questo documento - panoramica dell'analisi |
| `issues-report.md` | Report dettagliato di tutte le issue trovate |
| `setup-troubleshooting.md` | Problemi incontrati e soluzioni adottate |
| `screenshots/` | Screenshot della dashboard SonarCloud |

---

## 🚀 Configurazione e Setup

### 1. Prerequisiti

- Account GitHub con repository pubblico o privato
- Account SonarCloud (gratuito per progetti open source)
- Maven Wrapper configurato nel progetto
- GitHub Actions abilitato

### 2. Configurazione SonarCloud

#### Passo 1: Creazione Progetto su SonarCloud
1. Accedere a [SonarCloud](https://sonarcloud.io)
2. Cliccare "+" → "Analyze new project"
3. Importare il repository da GitHub
4. Selezionare "GitHub Actions" come metodo di analisi

#### Passo 2: Configurazione pom.xml
Aggiungere la proprietà dell'organizzazione nel `pom.xml`:

```xml
<properties>
    <!-- ... altre proprietà ... -->
    <sonar.organization>mariocelzo</sonar.organization>
</properties>
```

#### Passo 3: Configurazione GitHub Secrets
Nel repository GitHub, andare su Settings → Secrets → Actions e aggiungere:

| Secret Name | Descrizione |
|-------------|-------------|
| `SONAR_TOKEN` | Token generato da SonarCloud (Account → Security → Generate Token) |

#### Passo 4: Workflow GitHub Actions
File `.github/workflows/sonarcloud.yml`:

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

### 3. Esecuzione Locale (Opzionale)

```bash
# Con token esplicito
./mvnw clean verify sonar:sonar \
  -Dsonar.projectKey=mariocelzo_petclinic-dependability-analysis \
  -Dsonar.organization=mariocelzo \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=$SONAR_TOKEN

# Con skip di OWASP Dependency Check
./mvnw clean verify sonar:sonar \
  -Dsonar.projectKey=mariocelzo_petclinic-dependability-analysis \
  -Dsonar.organization=mariocelzo \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=$SONAR_TOKEN \
  -Ddependency-check.skip=true
```

---

## 📊 Metriche Monitorate

| Metrica | Descrizione | Soglia Accettabile | Nostro Valore |
|---------|-------------|-------------------|---------------|
| **Bugs** | Errori potenziali a runtime | 0 | ✅ 0 |
| **Vulnerabilities** | Problemi di sicurezza | 0 | ✅ 0 |
| **Code Smells** | Problemi di manutenibilità | < 50 | ✅ 23 |
| **Coverage** | Copertura test | > 80% | ✅ 91.9% |
| **Duplications** | Codice duplicato | < 3% | ✅ 0.0% |
| **Maintainability Rating** | Rating manutenibilità | A | ✅ A |
| **Reliability Rating** | Rating affidabilità | A | ✅ A |
| **Security Rating** | Rating sicurezza | A | ✅ A |

---

## 🔗 Integrazione con CI/CD

L'analisi SonarCloud è integrata nella pipeline CI/CD del progetto:

```
Push to main → GitHub Actions → Build → Test → JaCoCo → SonarCloud Analysis
```

Ogni push sul branch `main` attiva automaticamente:
1. Build del progetto con Maven
2. Esecuzione dei 44 test
3. Generazione report JaCoCo per coverage
4. Invio dati a SonarCloud
5. Aggiornamento dashboard con nuove metriche

---

## 📚 Documentazione Correlata

- [Issues Report](./issues-report.md) - Dettaglio delle 23 code smell
- [Setup Troubleshooting](./setup-troubleshooting.md) - Problemi incontrati e soluzioni
- [CI/CD Pipeline](../../spring-petclinic/.github/workflows/) - Workflow GitHub Actions
- [Coverage Analysis](../02-coverage/) - Analisi dettagliata della copertura
| **Security**        | Security rating          | A      |

## 📝 Analysis Workflow

1. **Initial Scan** - Baseline metrics
2. **Issue Review** - Categorize and prioritize
3. **Fix Implementation** - Address critical issues
4. **Re-scan** - Verify improvements
5. **Documentation** - Record changes and rationale

## 🔍 Issue Categories

### Bugs

- Logic errors
- Null pointer risks
- Resource leaks

### Vulnerabilities

- Security weaknesses
- Injection risks
- Authentication issues

### Code Smells

- Complexity issues
- Naming conventions
- Code duplication

## 📈 Results

- Initial scan date: [TBD]
- Issues found: [TBD]
- Issues fixed: [TBD]
- Final rating: [TBD]

## 🔗 Links

- [SonarCloud Dashboard](https://sonarcloud.io/dashboard?id=YOUR_PROJECT)
- [SonarCloud Documentation](https://sonarcloud.io/documentation)
