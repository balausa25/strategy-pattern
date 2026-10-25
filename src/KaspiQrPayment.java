public class KaspiQrPayment implements PaymentStrategy {
    private String phoneNumber;

    public KaspiQrPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " KZT via Kaspi QR linked to phone " + phoneNumber);
    }
}
