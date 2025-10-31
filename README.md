# Uber-like Project - Java OOP

Acest proiect este un exemplu de aplicație de tip Uber, construită folosind concepte de Programare Orientată pe Obiecte (OOP) în Java. Proiectul include entități, strategii de plată, tipuri de curse, sistem de rating și pattern-ul Visitor.

## Structura proiectului

### 1. Entități (`src/Entitati`)
Clase care definesc actorii principali ai aplicației:

- [Account.java](src/Entitati/Account.java) - Clasa de bază pentru conturi.
- [Driver.java](src/Entitati/Driver.java) - Reprezintă șoferii.
- [Main.java](src/Entitati/Main.java) - Punctul de intrare pentru testarea entităților.
- [Rider.java](src/Entitati/Rider.java) - Reprezintă utilizatorii care comanda curse.

### 2. Strategii de plată (`src/PaymentStrategy`)
Implementarea pattern-ului Strategy pentru diferite metode de plată:

- [Cash.java](src/PaymentStrategy/Cash.java)
- [CreditCard.java](src/PaymentStrategy/CreditCard.java)
- [PaymentStrategy.java](src/PaymentStrategy/PaymentStrategy.java)
- [Revolut.java](src/PaymentStrategy/Revolut.java)
- [Voucher.java](src/PaymentStrategy/Voucher.java)

### 3. Sistem de rating (`src/RateUpSystem`)
Clasă pentru gestionarea rating-urilor:

- [RateUpSystem.java](src/RateUpSystem/RateUpSystem.java)

### 4. Tipuri de curse (`src/Rides`)
Clase care definesc diferite tipuri de curse:

- [Comfort.java](src/Rides/Comfort.java)
- [Economic.java](src/Rides/Economic.java)
- [Main.java](src/Rides/Main.java) - Exemplu de rulare pentru curse.
- [Regular.java](src/Rides/Regular.java)
- [Rides.java](src/Rides/Rides.java)

### 5. Pattern Visitor (`src/Visitor`)
Implementarea pattern-ului Visitor pentru statistici și notificări:

- [FinancialStatsVisitor.java](src/Visitor/FinancialStatsVisitor.java)
- [NotificationVisitor.java](src/Visitor/NotificationVisitor.java)
- [StatisticsVisitor.java](src/Visitor/StatisticsVisitor.java)
- [Visitable.java](src/Visitor/Visitable.java)
- [Visitor.java](src/Visitor/Visitor.java)

### 6. Resurse
- [uber-Project.png](src/uber-Project.png) - Diagrama proiectului / reprezentare vizuală.

---

## Descriere

Acest proiect ilustrează:

- Concepte OOP: încapsulare, moștenire, polimorfism, abstracție.
- Pattern-uri de design: Strategy și Visitor.
- Gestionarea plăților multiple și a tipurilor de curse.
- Implementarea unui sistem de rating simplificat.

---

## Cum să rulezi proiectul

1. Deschide proiectul într-un IDE compatibil Java (IntelliJ, Eclipse).
2. Rulează `Main.java` din `src/Entitati` sau `src/Rides` pentru a testa funcționalitatea principală.
3. Explorează diferitele clase și strategii pentru a vedea cum interacționează componentele.

---

![Uber Project Diagram](src/uber-Project.png)
