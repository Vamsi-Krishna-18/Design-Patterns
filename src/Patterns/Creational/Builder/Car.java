package Patterns.Creational.Builder;

public class Car {
     private Long id;
     private String brand;
     private String model;
     private String color;
     private Long engine;
     private Long height;

     Car(Long id, String brand, String model, String color, Long engine, Long height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.height = height;
    }
}