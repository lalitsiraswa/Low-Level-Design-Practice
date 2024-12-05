package design_patterns.creational_patterns.builder.computer_builder;

public class Client {
    public static void main(String[] args) {
        ComputerBuilder desktopComputerBuilder = new DesktopComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(desktopComputerBuilder);
        Computer desktop = computerDirector.constructComputer();
        System.out.println(desktop);
    }
}
