package Patterns.Structural.Adapter.ClassAdapter;

import Patterns.Structural.Adapter.LegacyPayment;
import Patterns.Structural.Adapter.PaymentProcessor;

public class PaymentAdapter extends LegacyPayment implements PaymentProcessor {
    @Override
    public void pay(int amount) {
        makePayment(amount);
    }
}
