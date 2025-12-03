# Security Analysis - Spring PetClinic

## Overview

Questa directory contiene l'analisi di sicurezza completa del progetto Spring PetClinic, condotta utilizzando strumenti industry-standard per identificare vulnerabilità nel codice e nelle dipendenze.

## Strumenti Utilizzati

| Strumento              | Versione         | Scopo                                   |
| ---------------------- | ---------------- | --------------------------------------- |
| SonarCloud             | Cloud            | Static Analysis Security Testing (SAST) |
| OWASP Dependency-Check | 10.0.3           | Software Composition Analysis (SCA)     |
| SpotBugs + FindSecBugs | 4.8.6.4 + 1.13.0 | Security Bug Pattern Detection          |

## Struttura Directory

```
05-security/
├── README.md                    # Questo file
├── security-assessment.md       # Valutazione sicurezza completa
├── cve-report.md               # Report vulnerabilità CVE
├── spotbugs-findings.md        # Bug di sicurezza trovati
└── reports/                    # Report generati dagli strumenti
    ├── dependency-check-report.html
    ├── dependency-check-report.xml
    └── spotbugsXml.xml
```

## Risultati Sintesi

### SonarCloud (già completato)

- **Vulnerabilità**: 0
- **Security Hotspots**: 0
- **Rating**: A

### OWASP Dependency-Check

- Analisi in corso...

### SpotBugs + FindSecBugs

- **Bug trovati**: 18 (tutti Low severity)
- **Tipo principale**: SPRING_ENDPOINT (informational)
- **Bug critici**: 0

## Come Eseguire le Analisi

### SpotBugs

```bash
./mvnw spotbugs:check -DskipTests
./mvnw spotbugs:gui  # Per visualizzare i risultati in GUI
```

### OWASP Dependency-Check

```bash
./mvnw dependency-check:check -DskipTests
# Report generato in: target/dependency-check/dependency-check-report.html
```

## Riferimenti

- [OWASP Top 10](https://owasp.org/www-project-top-ten/)
- [OWASP Dependency-Check](https://owasp.org/www-project-dependency-check/)
- [SpotBugs](https://spotbugs.github.io/)
- [FindSecBugs](https://find-sec-bugs.github.io/)

---

_Analisi effettuata il 2 Dicembre 2025_
