package design_patterns.creational_patterns.builder.pizza_builder;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Ham And Pineapple");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
