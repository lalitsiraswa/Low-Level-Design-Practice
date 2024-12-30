package solid_principles.interface_segregation_principle.problem;

//  Interface should be such that, Client should not implement unnecessary functions they do not need.

interface RestaurantEmployee {
    void washDishes();

    void serveCustomers();

    void cookFood();
}

class waiter implements RestaurantEmployee {

    @Override
    public void washDishes() {
//        Not my job:
    }

    @Override
    public void serveCustomers() {
//        Yes and here is my implementation:
        System.out.println("Serving the customers");
    }

    @Override
    public void cookFood() {
//        Not my job:
    }
}

public class InterfaceSegregationPrincipleProblem {
}
