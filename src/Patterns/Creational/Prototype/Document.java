package Patterns.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Document implements Prototype<Document> {
    private String title;
    private Metadata metadata;
    private List<String> sections;

    public Document(String title, Metadata metadata, List<String> sections) {
        this.title = title;
        this.metadata = metadata;
        this.sections = sections;
    }

    // deep copy constructor
    private Document(Document document) {
        this.title = document.title;
        this.metadata = new Metadata(document.metadata);
        this.sections = new ArrayList<>(document.sections);
    }

    @Override
    public Document clone() {
        return new Document(this);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public void setSections(List<String> sections) {
        this.sections = sections;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public List<String> getSections() {
        return sections;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", metadata=" + metadata +
                ", sections=" + sections +
                '}';
    }
}
