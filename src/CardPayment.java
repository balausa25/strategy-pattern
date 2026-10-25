public class CardPayment implements PaymentStrategy {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " KZT using Bank Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}
