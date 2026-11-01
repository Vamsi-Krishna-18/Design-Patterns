package Patterns.Structural.Adapter.ObjectAdapter.RealScenario;

public class PaypalAdapter implements PaymentGateway{

    private final PaypalClient paypalClient;

    public PaypalAdapter(PaypalClient paypalClient) {
        this.paypalClient = paypalClient;
    }

    @Override
    public void processPayment(double amount) {
        paypalClient.createPayment(amount);
    }
}
