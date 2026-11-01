package Patterns.Structural.Adapter.ObjectAdapter.RealScenario;

public class RazorpayAdapter implements PaymentGateway{

    private final RazorpayClient razorpayClient;

    public RazorpayAdapter(RazorpayClient razorpayClient) {
        this.razorpayClient = razorpayClient;
    }

    @Override
    public void processPayment(double amount) {
        razorpayClient.createPayment(amount);
    }
}
