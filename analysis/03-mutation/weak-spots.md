# Punti Deboli Identificati - Mutation Testing

## Riepilogo Vulnerabilità

L'analisi PITest ha identificato **3 mutazioni sopravvissute** e **5 mutazioni senza copertura**, che rappresentano potenziali punti deboli nella test suite.

---

## 🔴 Mutazioni Sopravvissute (SURVIVED)

### 1. Visit.getDescription() - Bassa priorità test assertion

**File**: `Visit.java:62`  
**Mutatore**: EmptyObjectReturnValsMutator  
**Impatto**: ⚠️ Medio

```java
// Il test non verifica che getDescription() restituisca il valore corretto
// La mutazione che restituisce "" non viene rilevata
```

**Root Cause**: I test usano `getDescription()` solo per verificare che non sia null, non per validare il contenuto.

**Fix Suggerito**:
```java
@Test
void visitShouldReturnCorrectDescription() {
    Visit visit = new Visit();
    String expected = "Rabies shot";
    visit.setDescription(expected);
    
    assertThat(visit.getDescription())
        .isEqualTo(expected)
        .isNotEmpty();
}
```

---

### 2. PetValidator.supports() - Boundary condition non testata

**File**: `PetValidator.java:61`  
**Mutatore**: BooleanTrueReturnValsMutator  
**Impatto**: ⚠️ Medio

```java
// Se supports() ritorna sempre true, il validatore accetterebbe classi non-Pet
// I test non verificano questo scenario negativo
```

**Root Cause**: Mancanza di test per il caso negativo (classe non supportata).

**Fix Suggerito**:
```java
@Test
void validatorShouldNotSupportNonPetClasses() {
    PetValidator validator = new PetValidator();
    
    assertThat(validator.supports(Pet.class)).isTrue();
    assertThat(validator.supports(Owner.class)).isFalse();
    assertThat(validator.supports(Object.class)).isFalse();
    assertThat(validator.supports(null)).isFalse();
}
```

---

### 3. Condizione negata non rilevata

**Mutatore**: NegateConditionalsMutator  
**Impatto**: ⚠️ Basso

Una condizione booleana invertita non è stata rilevata. Richiede analisi del report HTML per identificare la posizione esatta.

---

## 🟡 Mutazioni Senza Copertura (NO_COVERAGE)

### Pattern Identificato

5 mutazioni di tipo `NullReturnValsMutator` non sono coperte da alcun test. Queste si trovano probabilmente in:

1. **Getter di entità** usati solo in contesti di serializzazione
2. **Metodi helper** chiamati indirettamente
3. **Codice di fallback** mai eseguito nei test

### Analisi per Classe

| Sospetta Classe | Metodi Probabili | Priorità |
|-----------------|------------------|----------|
| Owner | toString(), getName() | Bassa |
| Pet | getType(), getVisits() | Media |
| Visit | getId(), getPet() | Bassa |

---

## Matrice Rischio-Impatto

```
                    IMPATTO
                    Basso    Alto
           ┌────────────────────────┐
    Alto   │  #3      │  (nessuno) │
           ├────────────────────────┤
PROBABILITÀ│  #1, #2  │  (nessuno) │
    Basso  │  5 NO_COV│            │
           └────────────────────────┘
```

---

## Piano di Remediation

### Fase 1 - Quick Wins (1 giorno)
- [ ] Aggiungere test per `Visit.getDescription()` value assertion
- [ ] Aggiungere test per `PetValidator.supports()` negative case

### Fase 2 - Coverage Gap (2 giorni)
- [ ] Analizzare report HTML per identificare le 5 mutazioni senza copertura
- [ ] Valutare se sono getter critici o codice non raggiungibile

### Fase 3 - Continuous Improvement
- [ ] Integrare PITest nella CI/CD pipeline
- [ ] Impostare threshold di mutation coverage al 85%
- [ ] Review periodica delle mutazioni survived

---

## Metriche Target

| Metrica | Attuale | Target | Gap |
|---------|---------|--------|-----|
| Mutation Coverage | 85% | 90% | 5% |
| Test Strength | 94% | 95% | 1% |
| Survived Mutations | 3 | 0 | -3 |
| No Coverage | 5 | 2 | -3 |

---

## Riferimenti

- Report completo: `target/pit-reports/index.html`
- Dettagli mutazioni: `target/pit-reports/mutations.xml`
- Documentazione PITest: https://pitest.org/

---

*Analisi generata il 28 Novembre 2025*
