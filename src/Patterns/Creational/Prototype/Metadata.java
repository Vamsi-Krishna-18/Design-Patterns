package Patterns.Creational.Prototype;

public class Metadata {
    private String author;
    private long createdAt;

    public Metadata(String author, long createdAt) {
        this.author = author;
        this.createdAt = createdAt;
    }

    public Metadata(Metadata metadata) {
        this.author = metadata.author;
        this.createdAt = metadata.createdAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "author='" + author + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
