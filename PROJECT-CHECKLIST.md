# Spring PetClinic Dependability Analysis - Evaluation Checklist

## Project Information

- **Project Name**: Spring PetClinic Dependability Analysis
- **Team Members**: Mario Celzo
- **Start Date**: 31 ottobre 2025
- **Last Update**: 28 novembre 2025
- **Repository**: https://github.com/mariocelzo/petclinic-dependability-analysis
- **SonarCloud**: https://sonarcloud.io/project/overview?id=mariocelzo_petclinic-dependability-analysis

## Evaluation Criteria Status

### ✅ 1. CI/CD & Build - COMPLETATO

- [x] Project buildable locally (`mvn clean install`)
- [x] GitHub Actions CI/CD configured
- [x] Build passes successfully
- [x] Tests run automatically (44 test, 100% pass)
- [x] **Deadline**: Week 1
- **Status**: � Completed
- **Notes**: Pipeline CI funzionante con Java 21, Maven wrapper, JaCoCo coverage

### ✅ 2. SonarCloud Analysis - COMPLETATO

- [x] SonarCloud account connected
- [x] Project imported and analyzed
- [x] Issues categorized (0 Bugs / 0 Vulnerabilities / 23 Code Smells)
- [x] Results documented with rationale
- [x] Metrics documented (91.9% coverage, Triple A rating)
- [x] **Deadline**: Week 2
- **Status**: � Completed
- **Notes**:
  - Security: A (0 vulnerabilità)
  - Reliability: A (0 bug)
  - Maintainability: A (23 code smell minori)
  - Coverage: 91.9%
  - Duplications: 0%
  - Troubleshooting OWASP dependency-check documentato

### ✅ 3. Docker Image on DockerHub - COMPLETATO

- [x] Dockerfile created/optimized (multi-stage build)
- [x] Docker image builds successfully
- [x] Image pushed to DockerHub automaticamente
- [x] Image is public and accessible
- [x] Documentation for image usage
- [x] **Deadline**: Week 1
- **Status**: � Completed
- **Notes**:
  - Multi-stage build con Eclipse Temurin 21
  - Tags: latest, main, SHA commit
  - Health checks configurati
  - User non-root per sicurezza

### ✅ 4. Docker Container Runnable - COMPLETATO

- [x] Container runs successfully
- [x] Web application accessible (localhost:8080)
- [x] Database connection works (H2 in-memory)
- [x] Docker-compose for orchestration
- [x] Instructions in README
- [x] **Deadline**: Week 1
- **Status**: ✅ Completed
- **Notes**: Testato localmente, funziona correttamente

### ✅ 5. Code Coverage (JaCoCo) - COMPLETATO

- [x] JaCoCo configured in pom.xml
- [x] Coverage report generated
- [x] Coverage analyzed (91.9% overall)
- [x] Critical paths identified
- [x] Analysis documented
- [x] **Deadline**: Week 2
- **Status**: ✅ Completed
- **Notes**:
  - Report integrato con SonarCloud
  - 44 test passano con successo
  - Supera target 80%

### ✅ 6. Mutation Testing (PITest) - COMPLETATO

- [x] PITest plugin configured (v1.17.1)
- [x] Mutation campaign executed
- [x] Mutation score calculated: 85% (47/55 killed)
- [x] Survived mutants analyzed: 3 mutazioni sopravvissute
- [x] Weak test spots identified (Visit.getDescription, PetValidator.supports)
- [x] Test improvements proposed
- [x] **Deadline**: Week 3
- **Status**: ✅ Completed
- **Notes**:
  - Test strength: 94%
  - Line coverage (mutated classes): 98%
  - Configurazione risolta per JUnit Platform 1.13.4 (Spring Boot 4.0.0-M3)
  - Mutatori: CONDITIONALS_BOUNDARY, NEGATE_CONDITIONALS, MATH, INCREMENTS, \*\_RETURNS
  - 5 mutazioni senza copertura identificate
  - Report HTML/XML in target/pit-reports/

### 🔴 7. Performance Tests (JMH)

- [ ] JMH dependency added
- [ ] Critical components identified
- [ ] Benchmarks written for 3+ components
- [ ] Benchmarks executed
- [ ] Results analyzed
- [ ] Bottlenecks documented
- [ ] **Deadline**: Week 4
- **Status**: 🔴 Not Started
- **Notes**: Prossimo step da implementare

### 🔴 8. Automated Test Generation

- [ ] Coverage gaps identified
- [ ] Tool selected (EvoSuite/Randoop)
- [ ] Tests generated
- [ ] Tests reviewed and improved
- [ ] Tests integrated in test suite
- [ ] Coverage improvement measured
- [ ] **Deadline**: Week 4
- **Status**: 🔴 Not Started
- **Notes**:

### 🟡 9. Security Analysis - PARZIALE

- [ ] OWASP FindSecBugs configured
- [x] OWASP Dependency-Check configured (skipped in CI per mancanza API key NVD)
- [ ] Security scans executed
- [x] SonarCloud security analysis: 0 vulnerabilità
- [ ] Security assessment documented
- [ ] Mitigation strategies proposed
- [ ] **Deadline**: Week 5
- **Status**: 🟡 Partial
- **Notes**: SonarCloud non rileva vulnerabilità. OWASP DC richiede NVD API key.

## Documentation & Reporting

### LaTeX Report

- [x] Report structure created
- [ ] Introduction section (in progress)
- [ ] Background & Methodology
- [ ] Analysis sections (all 9 criteria)
- [ ] Results & Discussion
- [ ] Improvements implemented
- [ ] Conclusions
- [ ] Bibliography
- [ ] Figures & Tables
- [ ] **Deadline**: Week 6
- **Status**: � In Progress

### Presentation

- [ ] Slide deck created
- [ ] Content covers all criteria
- [ ] Visuals & graphs included
- [ ] Practice presentation
- [ ] **Deadline**: Week 7
- **Status**: 🔴 Not Started

## GitHub Repository Requirements

- [x] All code committed
- [x] Meaningful commit history
- [x] Analysis reports included
- [x] README.md comprehensive
- [ ] LaTeX report PDF uploaded
- [ ] Presentation slides uploaded
- [x] Analysis artifacts included

## Final Checks

- [ ] All 9 criteria completed
- [ ] Report reviewed and finalized
- [ ] Presentation ready
- [x] Repository clean and organized
- [x] All documentation up to date

---

## Progress Summary

| Criterio             | Status | Completamento |
| -------------------- | ------ | ------------- |
| 1. CI/CD & Build     | 🟢     | 100%          |
| 2. SonarCloud        | 🟢     | 100%          |
| 3. Docker Image      | 🟢     | 100%          |
| 4. Docker Container  | 🟢     | 100%          |
| 5. Code Coverage     | 🟢     | 100%          |
| 6. Mutation Testing  | 🔴     | 0%            |
| 7. Performance (JMH) | 🔴     | 0%            |
| 8. Test Generation   | 🔴     | 0%            |
| 9. Security Analysis | 🟡     | 50%           |

**Progresso Totale**: 5.5/9 criteri (~61%)

---

## Notes & Progress Log

### Week 1 (31 ottobre - 6 novembre 2025):

- [x] Project structure created, workspace setup completed
- [x] Fork Spring PetClinic repository
- [x] Clone repository locally
- [x] Verify local build works (fixed Java 25→21)
- [x] Setup CI/CD pipeline (GitHub Actions)
- [x] Create and push Docker image

### Week 2 (7-13 novembre 2025):

- [x] Configure SonarCloud
- [x] Run initial analysis
- [x] Fix OWASP dependency-check issue (NVD API key required)
- [x] JaCoCo already configured, coverage: 91.9%

### Week 3 (14-20 novembre 2025):

- [x] Documentazione SonarCloud completata
- [x] Troubleshooting documentato
- [ ] Configure PITest (prossimo step)
- [ ] Execute mutation testing

### Week 4 (21-27 novembre 2025):

- [ ] Setup JMH benchmarks
- [ ] Generate automated tests
- [ ] Measure improvements

### Week 5 (28 novembre - 4 dicembre 2025):

- [x] Report SonarCloud/Coverage completati (28/11)
- [ ] Security analysis con OWASP tools
- [ ] Document vulnerabilities

### Week 6:

- [ ] Complete LaTeX report
- [ ] Review all documentation

### Week 7:

- [ ] Finalize presentation
- [ ] Final review and submission
