package design_patterns.creational_patterns.builder.pizza_builder;

public class SpicyPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public SpicyPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Pan Backed");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Pepperoni And Jalapeno");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
