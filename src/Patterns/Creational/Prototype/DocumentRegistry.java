package Patterns.Creational.Prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentRegistry {
    private static final Map<String, Document> registry = new HashMap<>();

    static {
        registry.put(
                "report",
                new Document(
                        "Monthly Report",
                        new Metadata("System", System.currentTimeMillis()),
                        List.of("Induction", "Analysis", "Conclusion"))
        );

        registry.put(
                "invoice",
                new Document(
                        "Invoice",
                        new Metadata("Billing Service",System.currentTimeMillis()),
                        List.of("Customer Info", "Charges", "Total")
                )
        );
    }

    public static Document getDocument(String type) {
        return registry.get(type).clone();
    }
}
