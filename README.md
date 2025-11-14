# 🚗 UberApp – Proiect Java

Acesta este un proiect Java care simulează un sistem Uber cu rideri, șoferi, diferite tipuri de curse, sisteme de plăți și module de statistici. Proiectul include implementarea pattern-urilor **Observer**, **Strategy**, **Visitor**, precum și un sistem de rating **RateUp**.

---

## 📁 Structura proiectului (cu link-uri către fișiere)

### 1. [`src/Entitati`](src/Entitati)
- [`Account.java`](src/Entitati/Account.java)
- [`Driver.java`](src/Entitati/Driver.java)
- [`Rider.java`](src/Entitati/Rider.java)

---

### 2. [`src/Exceptions`](src/Exceptions)
- [`CashException.java`](src/Exceptions/CashException.java)
- [`CreditCardException.java`](src/Exceptions/CreditCardException.java)
- [`RevolutException.java`](src/Exceptions/RevolutException.java)
- [`VoucherException.java`](src/Exceptions/VoucherException.java)
- [`RiderException.java`](src/Exceptions/RiderException.java)

---

### 3. [`src/Observer`](src/Observer)
- [`RidesObserver.java`](src/Observer/RidesObserver.java)
- [`Subject.java`](src/Observer/Subject.java)

---

### 4. [`src/PaymentStrategy`](src/PaymentStrategy)
- [`PaymentStrategy.java`](src/PaymentStrategy/PaymentStrategy.java)
- [`Cash.java`](src/PaymentStrategy/Cash.java)
- [`CreditCard.java`](src/PaymentStrategy/CreditCard.java)
- [`Revolut.java`](src/PaymentStrategy/Revolut.java)
- [`Voucher.java`](src/PaymentStrategy/Voucher.java)

---

### 5. [`src/RateUpSystem`](src/RateUpSystem)
- [`RateUpSystem.java`](src/RateUpSystem/RateUpSystem.java)

---

### 6. [`src/Rides`](src/Rides)
- [`Economic.java`](src/Rides/Economic.java)
- [`Comfort.java`](src/Rides/Comfort.java)
- [`Regular.java`](src/Rides/Regular.java)
- [`Rides.java`](src/Rides/Rides.java)

---

### 7. [`src/UberApp`](src/UberApp)
- [`Main.java`](src/UberApp/Main.java)
- [`MainJson.java`](src/UberApp/MainJson.java)
- [`Uber.java`](src/UberApp/Uber.java)
- [`Constants.java`](src/UberApp/Constants.java)
- [`JUnitTests.java`](src/UberApp/JUnitTests.java)
- [`Json.json`](src/UberApp/Json.json)

---

### 8. [`src/Visitor`](src/Visitor)
- [`Visitor.java`](src/Visitor/Visitor.java)
- [`Visitable.java`](src/Visitor/Visitable.java)
- [`StatisticsVisitor.java`](src/Visitor/StatisticsVisitor.java)
- [`FinancialStatsVisitor.java`](src/Visitor/FinancialStatsVisitor.java)
- [`NotificationVisitor.java`](src/Visitor/NotificationVisitor.java)

---

## 📝 Descriere generală

- **Observer** – notificări în timp real pentru rideri și șoferi
- **Strategy** – selectarea metodei de plată în timpul rulării
- **Visitor** – generare de statistici fără modificarea entităților
- **RateUpSystem** – sistem de rating și recompense
- **MainJson** – rulare pe baza datelor JSON

---