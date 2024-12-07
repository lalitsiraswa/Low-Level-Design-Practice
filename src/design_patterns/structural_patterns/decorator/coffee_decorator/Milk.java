package design_patterns.structural_patterns.decorator.coffee_decorator;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
