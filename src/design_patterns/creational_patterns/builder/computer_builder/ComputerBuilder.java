package design_patterns.creational_patterns.builder.computer_builder;

public interface ComputerBuilder {
    ComputerBuilder buildProcessor(String processor);

    ComputerBuilder buildMemory(int memory);

    ComputerBuilder buildStorage(int storage);

    ComputerBuilder buildGraphicsCard(String graphicsCard);

    Computer build();
}
