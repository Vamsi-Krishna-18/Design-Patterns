package Patterns.Structural.Adapter;

// Existing third-party class
public class LegacyPayment {

    public void makePayment(int amount) {
        System.out.println("payment done for " + amount);
    }
}
