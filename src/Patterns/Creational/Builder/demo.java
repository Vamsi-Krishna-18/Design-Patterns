package Patterns.Creational.Builder;

public class demo {

    public void test() {
        CarBuilder builder = new CarBuilder();
        Car rollsRoyceCar = builder.id(1L)
                .brand("Rolls Royce")
                .color("black")
                .model("2025")
                .engine(12L)
                .height(125L)
                .build();

        CarSchemaBuilder builder1 = new CarSchemaBuilder();
        CarSchema mercedesSchema = builder1.id(1L)
                .brand("mercedes")
                .color("blue")
                .model("2026")
                .engine(15L)
                .height(100L)
                .build();

        // Director

        Director director = new Director();
        CarBuilder builder2 = new CarBuilder();

        //
        director.buildBugatti(builder2);

        Car bugatti = builder2.build();

    }
}
