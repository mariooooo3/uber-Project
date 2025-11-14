# 🚗 UberApp – Proiect Java

Acesta este un proiect Java care simulează un sistem Uber cu rideri, șoferi, diverse tipuri de curse și vizitatori
pentru statistici și notificări. Proiectul include implementarea unui sistem de plăți, RateUp și Observer pentru
notificări în timp real.

---

## 📁 Structura proiectului

### 1. [`src/Entitati`](src/Entitati) – Clase principale

- [`Account.java`](src/Entitati/Account.java) – Clasa de bază pentru conturi (rideri și șoferi)
- [`Driver.java`](src/Entitati/Driver.java) – Reprezintă un șofer cu calități, experiență și disponibilitate
- [`Rider.java`](src/Entitati/Rider.java) – Reprezintă un rider cu preferințe și buget

---

### 2. [`src/Exceptions`](src/Exceptions) – Gestionarea excepțiilor

- [`CashException.java`](src/Exceptions/CashException.java) – Aruncată în caz de probleme la plata cash
- [`CreditCardException.java`](src/Exceptions/CreditCardException.java) – Aruncată pentru erori legate de plata cu card
- [`RevolutException.java`](src/Exceptions/RevolutException.java) – Aruncată pentru erori la procesarea plăților prin Revolut
- [`VoucherException.java`](src/Exceptions/VoucherException.java) – Aruncată dacă voucherul nu este valid
- [`RiderException.java`](src/Exceptions/RiderException.java) – Pentru validarea datelor riderilor

---

### 3. [`src/Observer`](src/Observer) – Pattern Observer

- [`RidesObserver.java`](src/Observer/RidesObserver.java) – Interfață pentru observer
- [`Subject.java`](src/Observer/Subject.java) – Interfață pentru subiect (Uber)

---

### 4. [`src/PaymentStrategy`](src/PaymentStrategy) – Strategii de plată

- [`Cash.java`](src/PaymentStrategy/Cash.java) – Implementare plată cash
- [`CreditCard.java`](src/PaymentStrategy/CreditCard.java) – Implementare plată cu card
- [`Revolut.java`](src/PaymentStrategy/Revolut.java) – Implementare plată prin Revolut
- [`Voucher.java`](src/PaymentStrategy/Voucher.java) – Implementare plată cu voucher
- [`PaymentStrategy.java`](src/PaymentStrategy/PaymentStrategy.java) – Interfață pentru strategia de plată

---

### 5. [`src/RateUpSystem`](src/RateUpSystem) – Sistem RateUp

- [`RateUpSystem.java`](src/RateUpSystem/RateUpSystem.java) – Sistem de recompense și evaluare

---

### 6. [`src/Rides`](src/Rides) – Tipuri de curse

- [`Comfort.java`](src/Rides/Comfort.java) – Cursa de tip confort
- [`Economic.java`](src/Rides/Economic.java) – Cursa economică
- [`Regular.java`](src/Rides/Regular.java) – Cursa standard
- [`Rides.java`](src/Rides/Rides.java) – Clasa principală care gestionează cursele

---

### 7. [`src/UberApp`](src/UberApp) – Aplicația principală

- [`Main.java`](src/UberApp/Main.java) – Punctul de intrare principal în aplicație
- [`MainJson.java`](src/UberApp/MainJson.java) – Citirea riderilor și șoferilor din JSON și rularea curselelor
- [`Uber.java`](src/UberApp/Uber.java) – Clasa Uber, implementează Observer pentru notificări
- [`Constants.java`](src/UberApp/Constants.java) – Fișier cu constantele folosite în clase *(nou)*
- [`JUnitTests.java`](src/UberApp/JUnitTests.java) – Teste unitare pentru funcționalitățile aplicației *(nou)*
- [`Json.json`](src/UberApp/Json.json) – Fișier JSON cu datele riderilor și șoferilor

---

### 8. [`src/Visitor`](src/Visitor) – Pattern Visitor

- [`FinancialStatsVisitor.java`](src/Visitor/FinancialStatsVisitor.java) – Vizitator pentru statistici financiare
- [`NotificationVisitor.java`](src/Visitor/NotificationVisitor.java) – Vizitator pentru notificări
- [`StatisticsVisitor.java`](src/Visitor/StatisticsVisitor.java) – Vizitator pentru statistici generale
- [`Visitable.java`](src/Visitor/Visitable.java) – Interfață pentru obiectele vizitabile
- [`Visitor.java`](src/Visitor/Visitor.java) – Interfață pentru vizitator

---

## 📝 Descriere scurtă

- Proiectul folosește **pattern-ul Observer** pentru notificări în timp real către rideri și șoferi.
- **Pattern-ul Visitor** este folosit pentru generarea de statistici și notificări fără a modifica clasele entităților.
- Sistemul permite **alegerea tipului de cursă** și **strategia de plată** pentru fiecare rider.
- Include un **RateUpSystem** pentru gestionarea rating-urilor și recompenselor.
- `MainJson.java` permite rularea aplicației folosind datele din fișierul `Json.json`.

---
