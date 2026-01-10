package Patterns.Creational.Builder;

public class CarBuilder implements Builder{
    private Long id;
    private String brand;
    private String model;
    private String color;
    private Long engine;
    private Long height;

    @Override
    public CarBuilder id(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder engine(Long engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder height(Long height) {
        this.height = height;
        return this;
    }

    public Car build() {
        return new Car(id, brand, model, color, engine, height);
    }

}