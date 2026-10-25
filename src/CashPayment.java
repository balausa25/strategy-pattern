public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " KZT in Cash to the courier upon delivery.");
    }
}
