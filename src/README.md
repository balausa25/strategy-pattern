# Assignment #5 — Strategy Pattern (Payment System)

## About the Project
This project implements the **Strategy Behavioral Design Pattern** in Java (JDK 17) as part of the Software Design Patterns course at Astana IT University[cite: 1].

The chosen domain is an e-commerce **Payment System**, where different payment methods (Credit Card, Kaspi QR, and Cash) act as interchangeable strategies managed dynamically by a shopping cart context.

##  Structure
- `PaymentStrategy.java` — Strategy interface defining the common `pay()` method.
- `CardPayment.java`, `KaspiQrPayment.java`, `CashPayment.java` — Concrete strategies implementing specific payment algorithms[cite: 10].
- `ShoppingCart.java` — Context class that maintains a reference to a strategy and delegates execution without conditional branching[cite: 10].
- `Main.java` — Client class demonstrating runtime strategy switching[cite: 1].

##  How to Run
1. Open the project in **IntelliJ IDEA** (JDK 17 required)[cite: 1].
2. Run the `Main.java` file.