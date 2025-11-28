# Mutation Testing con PITest - Guida e Setup

## Introduzione

Il **Mutation Testing** è una tecnica di testing del software che valuta la qualità di una test suite introducendo piccole modifiche (mutazioni) nel codice sorgente e verificando se i test rilevano queste modifiche.

### Perché PITest?

PITest è il mutation testing tool più utilizzato per Java perché:
- ⚡ **Veloce**: Usa bytecode mutation invece di source code mutation
- 🎯 **Preciso**: Identifica esattamente quali test rilevano quali mutazioni
- 🔌 **Integrato**: Supporto nativo per Maven, Gradle, JUnit 5

---

## Setup nel Progetto

### Configurazione Maven (pom.xml)

```xml
<plugin>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-maven</artifactId>
    <version>1.17.1</version>
    <dependencies>
        <dependency>
            <groupId>org.pitest</groupId>
            <artifactId>pitest-junit5-plugin</artifactId>
            <version>1.2.1</version>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.platform</groupId>
                    <artifactId>*</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <!-- Versioni allineate a Spring Boot 4.0.0-M3 -->
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-launcher</artifactId>
            <version>1.13.4</version>
        </dependency>
        <dependency>
            <groupId>org.junit.platform</groupId>
            <artifactId>junit-platform-engine</artifactId>
            <version>1.13.4</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.13.4</version>
        </dependency>
    </dependencies>
    <configuration>
        <targetClasses>
            <param>org.springframework.samples.petclinic.owner.*</param>
            <param>org.springframework.samples.petclinic.vet.*</param>
        </targetClasses>
        <targetTests>
            <param>org.springframework.samples.petclinic.*Test</param>
            <param>org.springframework.samples.petclinic.*Tests</param>
        </targetTests>
        <mutators>
            <mutator>CONDITIONALS_BOUNDARY</mutator>
            <mutator>NEGATE_CONDITIONALS</mutator>
            <mutator>MATH</mutator>
            <mutator>INCREMENTS</mutator>
            <mutator>EMPTY_RETURNS</mutator>
            <mutator>FALSE_RETURNS</mutator>
            <mutator>TRUE_RETURNS</mutator>
            <mutator>NULL_RETURNS</mutator>
            <mutator>PRIMITIVE_RETURNS</mutator>
        </mutators>
        <outputFormats>
            <outputFormat>XML</outputFormat>
            <outputFormat>HTML</outputFormat>
        </outputFormats>
        <timestampedReports>false</timestampedReports>
        <threads>2</threads>
        <timeoutConstant>10000</timeoutConstant>
        <verbose>true</verbose>
    </configuration>
</plugin>
```

---

## Problemi Incontrati e Soluzioni

### Problema 1: Java 21 Compatibility

**Errore**:
```
Coverage generator Minion exited abnormally due to UNKNOWN_ERROR
```

**Causa**: PITest richiede accesso a moduli Java interni.

**Soluzione**: Aggiungere JVM args:
```xml
<jvmArgs>
    <jvmArg>--add-opens=java.base/java.lang=ALL-UNNAMED</jvmArg>
    <jvmArg>--add-opens=java.base/java.util=ALL-UNNAMED</jvmArg>
    <jvmArg>--add-opens=java.base/java.lang.reflect=ALL-UNNAMED</jvmArg>
</jvmArgs>
```

### Problema 2: JUnit Platform Version Mismatch

**Errore**:
```
JUnitException: OutputDirectoryProvider not available; probably due to 
unaligned versions of junit-platform-engine and junit-platform-launcher
```

**Causa**: Spring Boot 4.0.0-M3 usa JUnit Platform 1.13.4, ma pitest-junit5-plugin include versioni precedenti.

**Soluzione**: Escludere le dipendenze transitive e specificare le versioni corrette:
```xml
<dependency>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-junit5-plugin</artifactId>
    <version>1.2.1</version>
    <exclusions>
        <exclusion>
            <groupId>org.junit.platform</groupId>
            <artifactId>*</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-launcher</artifactId>
    <version>1.13.4</version>
</dependency>
```

### Problema 3: Mutator Names Changed

**Errore**:
```
Mutator or group RETURN_VALS is unknown
```

**Causa**: Nelle versioni recenti di PITest, `RETURN_VALS` è stato sostituito da mutatori specifici.

**Soluzione**: Usare i nuovi nomi:
```xml
<mutators>
    <mutator>EMPTY_RETURNS</mutator>
    <mutator>FALSE_RETURNS</mutator>
    <mutator>TRUE_RETURNS</mutator>
    <mutator>NULL_RETURNS</mutator>
    <mutator>PRIMITIVE_RETURNS</mutator>
</mutators>
```

---

## Esecuzione

### Comando Base
```bash
./mvnw org.pitest:pitest-maven:mutationCoverage
```

### Con Skip Test Compile (se già compilato)
```bash
./mvnw org.pitest:pitest-maven:mutationCoverage -DskipTests=false
```

### Solo su Package Specifico
```bash
./mvnw org.pitest:pitest-maven:mutationCoverage \
    -DtargetClasses="org.springframework.samples.petclinic.owner.*"
```

---

## Interpretazione Risultati

### Stati delle Mutazioni

| Stato | Significato | Azione |
|-------|-------------|--------|
| **KILLED** | Test ha rilevato la mutazione | ✅ Desiderato |
| **SURVIVED** | Test NON ha rilevato la mutazione | ⚠️ Migliorare test |
| **NO_COVERAGE** | Nessun test esegue quel codice | ⚠️ Aggiungere test |
| **TIMED_OUT** | Mutazione causa loop infinito | ✅ Rilevata indirettamente |
| **NON_VIABLE** | Mutazione non compilabile | ℹ️ Ignorare |

### Metriche Chiave

1. **Mutation Coverage** = Killed / (Total - NonViable)
   - Target: >80%

2. **Test Strength** = Killed / (Killed + Survived)
   - Target: >90%

---

## Mutatori Disponibili

### Gruppo DEFAULT
- `CONDITIONALS_BOUNDARY`: `<` → `<=`
- `NEGATE_CONDITIONALS`: `==` → `!=`
- `MATH`: `+` → `-`
- `INCREMENTS`: `i++` → `i--`

### Gruppo RETURNS
- `EMPTY_RETURNS`: Ritorna collezioni vuote
- `FALSE_RETURNS`: `true` → `false`
- `TRUE_RETURNS`: `false` → `true`
- `NULL_RETURNS`: Ritorna `null`
- `PRIMITIVE_RETURNS`: `1` → `0`

### Gruppo EXPERIMENTAL
- `EXPERIMENTAL_ARGUMENT_PROPAGATION`
- `EXPERIMENTAL_BIG_DECIMAL`
- `EXPERIMENTAL_MEMBER_VARIABLE`
- `EXPERIMENTAL_NAKED_RECEIVER`
- `EXPERIMENTAL_SWITCH`

---

## Report Generati

```
target/pit-reports/
├── index.html          # Report principale
├── mutations.xml       # Per CI/CD integration
├── style.css           # Styling
└── org.springframework.samples.petclinic.owner/
    └── index.html      # Dettagli per package
```

### Aprire il Report
```bash
open target/pit-reports/index.html
```

---

## Integrazione CI/CD

### GitHub Actions
```yaml
- name: Run PITest Mutation Testing
  run: ./mvnw org.pitest:pitest-maven:mutationCoverage

- name: Upload PITest Report
  uses: actions/upload-artifact@v4
  with:
    name: pitest-report
    path: target/pit-reports/
```

### Threshold Check
```xml
<configuration>
    <mutationThreshold>80</mutationThreshold>
    <coverageThreshold>80</coverageThreshold>
</configuration>
```

---

## Risorse

- [PITest Documentation](https://pitest.org/)
- [PITest Maven Plugin](https://pitest.org/quickstart/maven/)
- [Mutators Reference](https://pitest.org/quickstart/mutators/)

---

*Configurazione testata con Spring Boot 4.0.0-M3, Java 21, PITest 1.17.1*
