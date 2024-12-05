package design_patterns.creational_patterns.builder.pizza_builder;

public interface PizzaBuilder {
    void buildDough();

    void buildSauce();

    void buildTopping();

    Pizza getPizza();
}
