package solid_principles.single_responsibility_principle.problem;

class Marker {
    String name;
    String color;
    int year;
    int price;
}

class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        int price = marker.price * this.quantity;
        return price;
    }

    public void printInvoice() {
//        Print the Invoice:
    }

    public void saveToDB() {
//        Save the data into DB:
    }
}

public class SingleResponsibilityProblem {
}
