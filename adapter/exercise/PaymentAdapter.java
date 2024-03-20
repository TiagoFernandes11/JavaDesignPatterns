package adapter.exercise;

public class PaymentAdapter {
    public int pay(int reais){
        PaymentApp paymentApp = new PaymentApp();
        return paymentApp.pay(reais / 5);
    }
}
