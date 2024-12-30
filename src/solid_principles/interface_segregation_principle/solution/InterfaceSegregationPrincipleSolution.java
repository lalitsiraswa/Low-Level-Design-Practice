package solid_principles.interface_segregation_principle.solution;

//  Interface should be such that, Client should not implement unnecessary functions they do not need.

interface WaiterInterface {
    void serveCustomers();

    void takeOrder();
}

interface ChefInterface {
    void cookFood();

    void decideMenu();
}

interface HelperInterface {
    void washDishes();
}

class Waiter implements WaiterInterface {

    @Override
    public void serveCustomers() {
        System.out.println("Serving the customers!");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking orders!");
    }
}

class Chef implements ChefInterface {

    @Override
    public void cookFood() {
        System.out.println("Cooking Food!");
    }

    @Override
    public void decideMenu() {
        System.out.println("Decide Menu!");
    }
}

public class InterfaceSegregationPrincipleSolution {
}
