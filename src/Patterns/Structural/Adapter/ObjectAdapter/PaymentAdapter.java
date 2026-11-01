package Patterns.Structural.Adapter.ObjectAdapter;

import Patterns.Structural.Adapter.LegacyPayment;
import Patterns.Structural.Adapter.PaymentProcessor;

public class PaymentAdapter implements PaymentProcessor {
    private final LegacyPayment legacyPayment;

    public PaymentAdapter(LegacyPayment legacyPayment) {
        this.legacyPayment = legacyPayment;
    }

    @Override
    public void pay(int amount) {
        legacyPayment.makePayment(amount);
    }
}
