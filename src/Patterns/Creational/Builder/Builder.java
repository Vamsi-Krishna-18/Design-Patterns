package Patterns.Creational.Builder;

public interface Builder {
    Builder id(Long id);
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    Builder engine(Long engine);
    Builder height(Long height);
}