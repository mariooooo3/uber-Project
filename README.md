# 🚗 UberApp – Proiect Java

Acesta este un proiect Java care simulează un sistem Uber cu rideri, șoferi, diferite tipuri de curse, sisteme de plăți și module de statistici. Proiectul include implementarea a trei pattern-uri importante: **Observer**, **Strategy** și **Visitor**, precum și un sistem de rating numit **RateUp**.

---

## 📁 Structura proiectului

### 1. `src/Entitati` – Clase principale
- `Account.java` – Clasa de bază pentru conturi (rideri și șoferi)
- `Driver.java` – Reprezintă un șofer (calități, experiență, disponibilitate)
- `Rider.java` – Reprezintă un rider (preferințe, buget)

---

### 2. `src/Exceptions` – Gestionarea excepțiilor
- `CashException.java` – Eroare la plata cash
- `CreditCardException.java` – Eroare la plata cu card
- `RevolutException.java` – Eroare la plata prin Revolut
- `VoucherException.java` – Voucher invalid
- `RiderException.java` – Validarea datelor riderilor

---

### 3. `src/Observer` – Design Pattern Observer
- `RidesObserver.java` – Interfață pentru observer
- `Subject.java` – Interfață pentru subiect (Uber)

---

### 4. `src/PaymentStrategy` – Strategii de plată
- `PaymentStrategy.java` – Interfața strategiei de plată
- `Cash.java` – Plată cash
- `CreditCard.java` – Plată cu cardul
- `Revolut.java` – Plată prin Revolut
- `Voucher.java` – Plată cu voucher

---

### 5. `src/RateUpSystem`
- `RateUpSystem.java` – Sistem pentru evaluări și recompense

---

### 6. `src/Rides` – Tipuri de curse
- `Economic.java` – Cursa economică
- `Comfort.java` – Cursa de tip confort
- `Regular.java` – Cursa standard
- `Rides.java` – Managementul curselor

---

### 7. `src/UberApp` – Aplicatia principală
- `Main.java` – Punctul principal de intrare în aplicație
- `MainJson.java` – Citește datele din JSON și rulează aplicația
- `Uber.java` – Clasa Uber (implementează Subject din Observer)
- `Constants.java` – Constante globale folosite în proiect
- `JUnitTests.java` – Teste unitare pentru funcționalități
- `Json.json` – Fișier JSON cu date pentru rideri și șoferi

---

### 8. `src/Visitor` – Design Pattern Visitor
- `Visitor.java` – Interfața vizitatorului
- `Visitable.java` – Interfață pentru elementele vizitabile
- `StatisticsVisitor.java` – Statistici generale
- `FinancialStatsVisitor.java` – Statistici financiare
- `NotificationVisitor.java` – Notificări

---

## 📝 Descriere generală

- Proiectul folosește **Observer** pentru notificări în timp real pentru rideri și șoferi.
- Folosește **Strategy** pentru metodele de plată, selectate dinamic.
- Folosește **Visitor** pentru statistici și rapoarte fără a modifica entitățile.
- Include un sistem **RateUp** pentru evaluări și recompense.
- `MainJson.java` permite rularea aplicației folosind date din fișierul `Json.json`.

---
