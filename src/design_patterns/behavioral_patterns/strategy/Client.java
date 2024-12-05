package design_patterns.behavioral_patterns.strategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("Abhishek Sharma", "7485768374657687", "786", "12/30"));
        cart.checkout(10000);

        cart.setPaymentStrategy(new PayPalPayment("abhishek@gmail.com", "8573847587"));
        cart.checkout(4000);

        cart.setPaymentStrategy(new BitcoinPayment("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2"));
        cart.checkout(18000);
    }
}
