package Patterns.Creational.Builder;

public class CarSchemaBuilder implements Builder{

    private Long id;
    private String brand;
    private String model;
    private String color;
    private Long engine;
    private Long height;

    @Override
    public CarSchemaBuilder id(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public CarSchemaBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarSchemaBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarSchemaBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarSchemaBuilder engine(Long engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarSchemaBuilder height(Long height) {
        this.height = height;
        return this;
    }

    public CarSchema build() {
        return new CarSchema(id, brand, model, color, engine, height);
    }
}
