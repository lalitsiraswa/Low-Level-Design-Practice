package design_patterns.creational_patterns.builder.computer_builder;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructComputer() {
        return computerBuilder
                .buildProcessor("Intel i7")
                .buildMemory(16)
                .buildStorage(512)
                .buildGraphicsCard("NVIDEA GTX 1660")
                .build();
    }
}
