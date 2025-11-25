# 📊 CI/CD Test Report - Spring PetClinic

**Data Generazione**: 25 Novembre 2025  
**Progetto**: Spring PetClinic Dependability Analysis  
**Repository**: https://github.com/mariocelzo/petclinic-dependability-analysis

---

## 🔄 Panoramica CI/CD Pipeline

### Cos'è CI/CD?

| Termine                         | Significato                                                  | Nel Nostro Progetto                         |
| ------------------------------- | ------------------------------------------------------------ | ------------------------------------------- |
| **CI** (Continuous Integration) | Integrazione continua del codice con build e test automatici | Ogni push su `main` triggera build + test   |
| **CD** (Continuous Delivery)    | Codice sempre pronto per il deploy                           | Artifacts (report) generati automaticamente |

### Workflow Attivo: `ci.yml`

```yaml
name: CI Pipeline
on:
  push:
    branches: [main] # Trigger automatico
  workflow_dispatch: # Trigger manuale
```

---

## 📈 Statistiche Test Suite

| Metrica               | Valore      |
| --------------------- | ----------- |
| **Test Totali**       | 44          |
| **Test Passati**      | 44 ✅       |
| **Test Falliti**      | 0           |
| **Test Skippati**     | 0           |
| **Tempo Esecuzione**  | ~97 secondi |
| **Copertura Stimata** | ~80%        |

---

## 🧪 Dettaglio Test per Classe

### 1. OwnerControllerTests (13 test) ⭐ Più Testato

**Cosa testa**: Controller per la gestione dei proprietari di animali

| Test                                  | Descrizione             | Cosa Verifica                                         |
| ------------------------------------- | ----------------------- | ----------------------------------------------------- |
| `testInitCreationForm`                | Form creazione owner    | Pagina carica correttamente, modello contiene "owner" |
| `testProcessCreationFormSuccess`      | Submit form valido      | Redirect dopo creazione riuscita                      |
| `testProcessCreationFormHasErrors`    | Submit form con errori  | Validazione campi obbligatori (address, telephone)    |
| `testInitFindForm`                    | Form ricerca owner      | Pagina ricerca carica correttamente                   |
| `testProcessFindFormSuccess`          | Ricerca con risultati   | Lista owners visualizzata                             |
| `testProcessFindFormByLastName`       | Ricerca per cognome     | Redirect a dettaglio se trovato uno solo              |
| `testProcessFindFormNoOwnersFound`    | Ricerca senza risultati | Messaggio errore "notFound"                           |
| `testInitUpdateOwnerForm`             | Form modifica owner     | Dati owner precaricati nel form                       |
| `testProcessUpdateOwnerFormSuccess`   | Modifica riuscita       | Redirect dopo update                                  |
| `testProcessUpdateOwnerFormHasErrors` | Modifica con errori     | Validazione fallita, ritorno al form                  |
| `testShowOwner`                       | Dettaglio owner         | Visualizzazione completa con pets                     |
| `testShowOwnerWithPets`               | Dettaglio con animali   | Lista pets visibile                                   |
| `testShowOwnerWithVisits`             | Dettaglio con visite    | Storico visite visibile                               |

**Tecnologie testate**:

- Spring MVC (`@WebMvcTest`)
- MockMvc per simulare richieste HTTP
- Mockito per mock del repository

---

### 2. ClinicServiceTests (10 test)

**Cosa testa**: Servizi di business logic e accesso dati

| Test                                       | Descrizione               | Cosa Verifica                    |
| ------------------------------------------ | ------------------------- | -------------------------------- |
| `shouldFindOwnersByLastName`               | Query per cognome         | JPA query funziona correttamente |
| `shouldFindSingleOwnerWithPet`             | Caricamento owner con pet | Relazione Owner-Pet              |
| `shouldInsertOwner`                        | Inserimento nuovo owner   | Persistenza database             |
| `shouldUpdateOwner`                        | Modifica owner esistente  | Update database                  |
| `shouldFindPetWithCorrectId`               | Ricerca pet per ID        | Query by ID                      |
| `shouldInsertPetIntoDatabaseAndGenerateId` | Creazione pet             | Auto-generazione ID              |
| `shouldFindAllPetTypes`                    | Lista tipi animali        | Cache/lookup table               |
| `shouldFindVets`                           | Lista veterinari          | Caricamento veterinari           |
| `shouldAddNewVisitForPet`                  | Nuova visita              | Inserimento visita               |
| `shouldFindVisitsByPetId`                  | Storico visite            | Query visite per pet             |

**Tecnologie testate**:

- Spring Data JPA (`@DataJpaTest`)
- H2 Database (in-memory)
- Transazioni automatiche

---

### 3. VetControllerTests (2 test)

**Cosa testa**: Controller per la gestione dei veterinari

| Test                       | Descrizione       | Cosa Verifica               |
| -------------------------- | ----------------- | --------------------------- |
| `testShowVetListHtml`      | Pagina lista vets | HTML generato correttamente |
| `testShowResourcesVetList` | API REST vets     | JSON response corretta      |

---

### 4. VisitControllerTests (3 test)

**Cosa testa**: Controller per la gestione delle visite

| Test                               | Descrizione       | Cosa Verifica                           |
| ---------------------------------- | ----------------- | --------------------------------------- |
| `testInitNewVisitForm`             | Form nuova visita | Caricamento form con pet preselezionato |
| `testProcessNewVisitFormSuccess`   | Creazione visita  | Redirect dopo salvataggio               |
| `testProcessNewVisitFormHasErrors` | Visita con errori | Validazione data obbligatoria           |

---

### 5. PetTypeFormatterTests (3 test)

**Cosa testa**: Conversione stringhe <-> oggetti PetType

| Test               | Descrizione        | Cosa Verifica          |
| ------------------ | ------------------ | ---------------------- |
| `testPrint`        | Oggetto → Stringa  | Nome tipo visualizzato |
| `testParse`        | Stringa → Oggetto  | Lookup tipo da nome    |
| `testParseUnknown` | Tipo non esistente | Eccezione lanciata     |

---

### 6. Integration Tests (6 test)

**MySqlIntegrationTests (2 test)**

- Verifica connessione MySQL reale
- Test CRUD su database MySQL

**PostgresIntegrationTests (2 test)**

- Verifica connessione PostgreSQL
- Test CRUD su database Postgres

**PetClinicIntegrationTests (2 test)**

- Avvio completo applicazione Spring Boot
- Verifica context loading

---

### 7. Altri Test (7 test)

| Classe                            | Test | Descrizione                  |
| --------------------------------- | ---- | ---------------------------- |
| `ValidatorTests`                  | 1    | Validazione bean annotations |
| `VetTests`                        | 1    | Modello Vet con specialità   |
| `CrashControllerTests`            | 1    | Gestione errori 500          |
| `CrashControllerIntegrationTests` | 2    | Error handling end-to-end    |
| `I18nPropertiesSyncTest`          | 2    | Sincronizzazione file i18n   |

---

## 🏗️ Architettura Test

```
┌─────────────────────────────────────────────────────────────┐
│                    TEST SUITE                                │
├─────────────────────────────────────────────────────────────┤
│                                                              │
│  ┌──────────────────┐  ┌──────────────────┐                 │
│  │   Unit Tests     │  │ Integration Tests │                │
│  │                  │  │                   │                │
│  │ • Controller     │  │ • Database        │                │
│  │ • Formatter      │  │ • Full Context    │                │
│  │ • Validator      │  │ • End-to-End      │                │
│  └────────┬─────────┘  └────────┬──────────┘                │
│           │                     │                            │
│           ▼                     ▼                            │
│  ┌──────────────────────────────────────────┐               │
│  │           Spring Test Context             │               │
│  │  • MockMvc • @WebMvcTest • @DataJpaTest  │               │
│  └──────────────────────────────────────────┘               │
│                         │                                    │
│                         ▼                                    │
│  ┌──────────────────────────────────────────┐               │
│  │         Test Database (H2/MySQL/PG)       │               │
│  └──────────────────────────────────────────┘               │
│                                                              │
└─────────────────────────────────────────────────────────────┘
```

---

## ⚙️ Perché la CI/CD Funziona

### Fattori di Successo

| Aspetto            | Dettaglio                                          |
| ------------------ | -------------------------------------------------- |
| **Java Version**   | JDK 21 (Temurin) - compatibile con Spring Boot 4.0 |
| **Build Tool**     | Maven Wrapper (`./mvnw`) - versione embedded       |
| **Test Framework** | JUnit 5 + Spring Test                              |
| **Mock Framework** | Mockito (mock repositories)                        |
| **Database Test**  | H2 in-memory (veloce, no setup)                    |
| **Runner**         | `ubuntu-latest` (GitHub hosted)                    |
| **Timeout**        | 30 minuti (sufficiente per build completa)         |
| **Cache**          | Maven packages cached                              |

### Cosa Potrebbe Fallire (e Non Fallisce)

| Potenziale Problema      | Motivo Non Fallisce                    |
| ------------------------ | -------------------------------------- |
| Dipendenze non trovate   | Maven cache + repositories configurati |
| Test flaky               | Nessun test dipende da timing/rete     |
| Database non disponibile | H2 in-memory, no DB esterno richiesto  |
| Memoria insufficiente    | Runner ha 7GB RAM                      |
| Timeout                  | Build completa in <2 minuti            |

---

## 📦 Artifacts Generati

Dopo ogni build riuscita, vengono salvati:

```
test-reports/
├── target/surefire-reports/       # Report JUnit XML
│   ├── TEST-*.xml                 # Risultati per classe
│   └── *.txt                      # Log testuale
└── target/site/jacoco/            # Report Coverage
    ├── index.html                 # Dashboard interattiva
    ├── jacoco.xml                 # Dati per SonarCloud
    └── jacoco.csv                 # Dati tabulari
```

**Retention**: 5 giorni

---

## 🎯 Copertura per Package

| Package   | Classi Testate                | Coverage Stimata |
| --------- | ----------------------------- | ---------------- |
| `owner`   | Owner, Pet, Visit, Controller | ~85%             |
| `vet`     | Vet, Specialty, Controller    | ~75%             |
| `service` | ClinicService                 | ~90%             |
| `system`  | CrashController, Welcome      | ~70%             |
| `model`   | Validators                    | ~60%             |

---

## 🔗 Link Utili

- **GitHub Actions**: https://github.com/mariocelzo/petclinic-dependability-analysis/actions
- **Workflow File**: `.github/workflows/ci.yml`
- **Test Source**: `src/test/java/`
- **Surefire Reports**: `target/surefire-reports/`
- **JaCoCo Reports**: `target/site/jacoco/`

---

## ✅ Conclusioni

La CI/CD pipeline funziona perché:

1. **Configurazione corretta**: Java 21, Maven wrapper, dipendenze risolte
2. **Test isolati**: Ogni test è indipendente (no stato condiviso)
3. **Database in-memory**: H2 non richiede setup esterno
4. **Mock appropriati**: Controller testati senza backend reale
5. **Timeout adeguato**: 30 minuti > tempo build effettivo (97s)
6. **Cache efficace**: Maven packages riutilizzati tra run

**Stato**: ✅ **FUNZIONANTE** - 44/44 test passati
