package Patterns.Creational.Builder;

public class Director {

    public void buildBugatti(Builder builder) {
        builder.brand("bugatti")
                .engine(10L)
                .height(115L);
    }

    public void buildFerrari(Builder builder) {
        builder.brand("Ferrari")
                .engine(12L)
                .height(120L);
    }
}
