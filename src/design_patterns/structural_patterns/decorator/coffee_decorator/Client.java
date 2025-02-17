package design_patterns.structural_patterns.decorator.coffee_decorator;

public class Client {
    public static void main(String[] args) {
        // Order a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost : " + coffee.getCost() + "; Description : " + coffee.getDescription());

        // Decorate it with milk
        coffee = new Milk(coffee);
        System.out.println("Cost : " + coffee.getCost() + "; Description : " + coffee.getDescription());

        // Decorate it with sugar
        coffee = new Sugar(coffee);
        System.out.println("Cost : " + coffee.getCost() + "; Description : " + coffee.getDescription());
    }
}
