package design_patterns.structural_patterns.decorator.pizza_topping_decorator;

public class ExtraCheeseDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public ExtraCheeseDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 25;
    }
}
