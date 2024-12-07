package design_patterns.structural_patterns.decorator.coffee_decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
