package solid_principles.open_closed_principle.solution;

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
interface InvoiceDao {
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
//        Save to DB:
    }
}

class FileInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice) {
//        Save to File:
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

public class OpenClosePrincipleSolution {
}
