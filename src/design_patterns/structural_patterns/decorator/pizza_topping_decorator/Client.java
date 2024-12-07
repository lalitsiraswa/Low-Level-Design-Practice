package design_patterns.structural_patterns.decorator.pizza_topping_decorator;

public class Client {
    public static void main(String[] args) {
        // Margherita + ExtraCheese
        Margherita margheritaBasePizza = new Margherita();
        BasePizza extraCheesePizza = new ExtraCheeseDecorator(margheritaBasePizza);
        System.out.println(extraCheesePizza.cost());

        // Veggies Delight + ExtraCheese + Mushroom
        VeggiesDelight veggiesDelightBasePizza = new VeggiesDelight();
        BasePizza extraCheeseBasePizza = new ExtraCheeseDecorator(veggiesDelightBasePizza);
        BasePizza mushroomExtraCheeseBasePizza = new MushroomDecorator(extraCheeseBasePizza);
        System.out.println(mushroomExtraCheeseBasePizza.cost());
    }
}
