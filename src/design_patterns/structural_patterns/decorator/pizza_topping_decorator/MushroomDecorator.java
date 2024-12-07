package design_patterns.structural_patterns.decorator.pizza_topping_decorator;

public class MushroomDecorator extends ToppingDecorator {
    BasePizza basePizza;

    public MushroomDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
