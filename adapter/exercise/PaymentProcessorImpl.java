package adapter.exercise;

public class PaymentProcessorImpl implements PaymentProcessor{
    @Override
    public void pay(int dollars) {
        System.out.println("Paid: " + dollars + "$");
    }

    public static void main(String[] args) {
        PaymentAdapter adapter = new PaymentAdapter();
        PaymentProcessorImpl paymentProcessor = new PaymentProcessorImpl();
        paymentProcessor.pay(adapter.pay(200));
    }
}
