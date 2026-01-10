package Patterns.Creational.Builder;

public class CarSchema {
    private Long id;
    private String brand;
    private String model;
    private String color;
    private Long engine;
    private Long height;

    CarSchema(Long id, String brand, String model, String color, Long engine, Long height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.height = height;
    }
}
