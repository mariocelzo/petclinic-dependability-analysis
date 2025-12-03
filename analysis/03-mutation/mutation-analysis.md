# Analisi Mutation Testing - PITest

## Panoramica

Il **Mutation Testing** è una tecnica avanzata per valutare la qualità dei test software. A differenza della semplice copertura di codice (che misura quali linee vengono eseguite), il mutation testing verifica se i test sono in grado di **rilevare modifiche (mutazioni)** introdotte deliberatamente nel codice sorgente.

### Principio di Funzionamento

1. **Generazione Mutanti**: PITest crea copie del codice con piccole modifiche (es. `>` diventa `>=`)
2. **Esecuzione Test**: I test vengono eseguiti contro ogni mutante
3. **Valutazione**:
   - **KILLED**: Il test ha rilevato la mutazione (desiderato)
   - **SURVIVED**: Il test NON ha rilevato la mutazione (problema!)
   - **NO_COVERAGE**: Nessun test copre quel codice

---

## Risultati dell'Analisi

**Data Analisi**: 28 Novembre 2025  
**Versione PITest**: 1.17.1  
**Tempo Esecuzione**: 27 secondi

### Metriche Principali

| Metrica                | Valore | Target | Stato   |
| ---------------------- | ------ | ------ | ------- |
| **Mutazioni Generate** | 55     | -      | ✅      |
| **Mutazioni Killed**   | 47     | >80%   | ✅ 85%  |
| **Mutazioni Survived** | 3      | <10%   | ✅ 5.5% |
| **No Coverage**        | 5      | <10%   | ✅ 9%   |
| **Test Strength**      | 94%    | >90%   | ✅      |
| **Line Coverage**      | 98%    | >95%   | ✅      |

### Breakdown per Package

| Package           | Classi | Line Coverage | Mutation Coverage | Test Strength |
| ----------------- | ------ | ------------- | ----------------- | ------------- |
| `petclinic.owner` | 8      | 98% (211/216) | 84% (41/49)       | 93% (41/44)   |
| `petclinic.vet`   | 3      | 100% (33/33)  | 100% (6/6)        | 100% (6/6)    |
| **TOTALE**        | 11     | 98% (244/249) | 85% (47/55)       | 94% (47/50)   |

---

## Analisi per Tipo di Mutatore

### 1. EmptyObjectReturnValsMutator

- **Descrizione**: Sostituisce i valori di ritorno con collezioni vuote o stringhe vuote
- **Generati**: 28
- **Killed**: 27 (96%)
- **Survived**: 1
- **Valutazione**: ✅ Eccellente

### 2. NullReturnValsMutator

- **Descrizione**: Sostituisce i valori di ritorno con `null`
- **Generati**: 15
- **Killed**: 10 (67%)
- **Survived**: 0
- **No Coverage**: 5
- **Valutazione**: ⚠️ Buono, ma 5 mutanti non coperti

### 3. NegateConditionalsMutator

- **Descrizione**: Inverte le condizioni booleane (es. `==` → `!=`)
- **Generati**: 10
- **Killed**: 9 (90%)
- **Survived**: 1
- **Valutazione**: ✅ Buono

### 4. BooleanFalseReturnValsMutator

- **Descrizione**: Sostituisce `return true` con `return false`
- **Generati**: 1
- **Killed**: 1 (100%)
- **Valutazione**: ✅ Eccellente

### 5. BooleanTrueReturnValsMutator

- **Descrizione**: Sostituisce `return false` con `return true`
- **Generati**: 1
- **Killed**: 0 (0%)
- **Survived**: 1
- **Valutazione**: ❌ Problema identificato

---

## Mutazioni Sopravvissute (SURVIVED) - Analisi Dettagliata

### 1. `Visit.getDescription()` - EmptyObjectReturnValsMutator

**File**: `src/main/java/org/springframework/samples/petclinic/owner/Visit.java`  
**Linea**: 62

```java
// Codice originale
public String getDescription() {
    return this.description;
}

// Mutazione: restituisce "" invece del valore reale
```

**Problema**: I test non verificano che la descrizione restituita sia quella effettivamente impostata.

**Soluzione Proposta**:

```java
@Test
void shouldReturnCorrectDescription() {
    Visit visit = new Visit();
    visit.setDescription("Annual checkup");
    assertThat(visit.getDescription()).isEqualTo("Annual checkup");
}
```

### 2. `PetValidator.supports()` - BooleanTrueReturnValsMutator

**File**: `src/main/java/org/springframework/samples/petclinic/owner/PetValidator.java`  
**Linea**: 61

```java
// Codice originale
@Override
public boolean supports(Class<?> clazz) {
    return Pet.class.isAssignableFrom(clazz);
}

// Mutazione: restituisce sempre true
```

**Problema**: I test non verificano che il validatore rifiuti classi non-Pet.

**Soluzione Proposta**:

```java
@Test
void shouldNotSupportNonPetClasses() {
    PetValidator validator = new PetValidator();
    assertThat(validator.supports(Owner.class)).isFalse();
    assertThat(validator.supports(String.class)).isFalse();
}
```

### 3. Condizione in codice owner - NegateConditionalsMutator

**Problema**: Una condizione negata non è stata rilevata dai test.

**Analisi**: Richiede ispezione del report HTML dettagliato.

---

## Mutazioni Non Coperte (NO_COVERAGE)

Sono state identificate **5 mutazioni** in codice non raggiunto dai test:

| Classe          | Metodo         | Tipo                  |
| --------------- | -------------- | --------------------- |
| Owner/Pet/Visit | getter methods | NullReturnValsMutator |

**Raccomandazione**: Questi metodi sono probabilmente getter semplici usati solo in contesti specifici. Valutare se aggiungere test unitari o se la copertura tramite test di integrazione è sufficiente.

---

## Confronto con Copertura Tradizionale

| Metrica           | JaCoCo | PITest | Interpretazione                    |
| ----------------- | ------ | ------ | ---------------------------------- |
| Line Coverage     | 91.9%  | 98%    | PITest analizza solo classi target |
| Branch Coverage   | 73.3%  | -      | Non confrontabile                  |
| Mutation Coverage | -      | 85%    | Qualità effettiva dei test         |
| Test Strength     | -      | 94%    | Capacità di rilevare bug           |

### Insight

La **line coverage del 91.9%** con JaCoCo è alta, ma il **mutation coverage dell'85%** rivela che circa il 15% delle modifiche al codice non verrebbe rilevato dai test. Questo evidenzia il valore aggiunto del mutation testing.

---

## Tempi di Esecuzione

| Fase                          | Durata      |
| ----------------------------- | ----------- |
| Pre-scan mutazioni            | < 1 secondo |
| Scan classpath                | < 1 secondo |
| Coverage e analisi dipendenze | 5 secondi   |
| Build mutation tests          | < 1 secondo |
| Esecuzione mutation analysis  | 21 secondi  |
| **TOTALE**                    | 27 secondi  |

**Note**: 80 test eseguiti, media 1.45 test per mutazione.

---

## Configurazione Utilizzata

### Mutatori Attivati

```xml
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
```

### Classi Target

- `org.springframework.samples.petclinic.owner.*`
- `org.springframework.samples.petclinic.vet.*`

### Esclusioni

- `PetClinicApplication` (main class)
- `system.*` (configurazione)
- `model.*` (entità base)
- `*IntegrationTest*`, `*IT` (test di integrazione)

---

## Raccomandazioni

### Priorità Alta

1. ✅ Aggiungere test per `Visit.getDescription()` che verifichi il valore restituito
2. ✅ Aggiungere test per `PetValidator.supports()` con classi non-Pet

### Priorità Media

3. ⚠️ Investigare le 5 mutazioni senza copertura
4. ⚠️ Considerare l'estensione a package `system.*` e `service.*`

### Priorità Bassa

5. 📋 Attivare mutatori aggiuntivi (EXPERIMENTAL\_\*) per analisi più approfondita
6. 📋 Integrare PITest nella CI/CD pipeline

---

## Report Generati

| File                                                              | Descrizione                    |
| ----------------------------------------------------------------- | ------------------------------ |
| `target/pit-reports/index.html`                                   | Report HTML interattivo        |
| `target/pit-reports/mutations.xml`                                | Report XML per integrazione CI |
| `target/pit-reports/org.springframework.samples.petclinic.owner/` | Dettagli package owner         |
| `target/pit-reports/org.springframework.samples.petclinic.vet/`   | Dettagli package vet           |

---

## Conclusioni

L'analisi di mutation testing ha prodotto risultati **molto positivi**:

- **85% mutation coverage** supera la soglia target dell'80%
- **94% test strength** indica test di alta qualità
- Solo **3 mutazioni survived** su 55 generate

Le mutazioni sopravvissute identificano punti specifici dove i test possono essere migliorati, fornendo indicazioni actionable per aumentare ulteriormente la qualità del testing.

---

_Report generato con PITest 1.17.1_  
_Progetto: Spring PetClinic Dependability Analysis_
