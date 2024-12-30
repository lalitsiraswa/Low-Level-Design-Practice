package solid_principles.open_closed_principle.problem;

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
}

// Data Access Object (DAO)
class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
//        Save into DB:
    }

    public void saveToFile(String filename) {
//        Save Invoice in the File with the given name:
    }
}

class invoicePrinter {
    Invoice invoice;

    public invoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
//        Print the invoice:
    }
}

public class OpenClosePrincipleProblem {
}
