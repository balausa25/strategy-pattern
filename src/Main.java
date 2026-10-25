public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Покупка 1: Оплата картой
        cart.setPaymentStrategy(new CardPayment("4400123456789012"));
        cart.checkout(15000.0);

        System.out.println("--- Runtime Strategy Switching ---");

        // Покупка 2: Меняем стратегию на Kaspi QR
        cart.setPaymentStrategy(new KaspiQrPayment("+77771234567"));
        cart.checkout(15000.0);

        // Покупка 3: Оплата наличными
        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(8500.0);
    }
}