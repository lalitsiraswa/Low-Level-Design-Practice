package design_patterns.creational_patterns.builder.pizza_builder;

public class Client {
    public static void main(String[] args) {
        WaiterDirector waiterDirector = new WaiterDirector();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        PizzaBuilder hawaiiPizzaBuilder = new HawaiianPizzaBuilder();

        waiterDirector.setPizzaBuilder(spicyPizzaBuilder);
        waiterDirector.constructPizza();
        Pizza spicyPizza = waiterDirector.getPizza();
        System.out.println(spicyPizza);

        waiterDirector.setPizzaBuilder(hawaiiPizzaBuilder);
        waiterDirector.constructPizza();
        Pizza hawaiianPizza = waiterDirector.getPizza();
        System.out.println(hawaiianPizza);
    }
}
