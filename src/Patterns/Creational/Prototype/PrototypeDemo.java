package Patterns.Creational.Prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

        // getting a cloned document object from Document Registry
        Document doc1 = DocumentRegistry.getDocument("report");

        // getting another cloned document object from Document Registry
        Document doc2 = DocumentRegistry.getDocument("report");

        doc2.setTitle("Custom Report");
        doc2.getMetadata().setAuthor("Vamsi");
    }
}
