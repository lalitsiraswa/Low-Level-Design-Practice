import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner inputScanner = new Scanner(System.in);
        String str = inputScanner.nextLine();
        System.out.println("You Entered String : " + str);

        int x = inputScanner.nextInt();
        System.out.println("You Entered Integer " + x);

        float y = inputScanner.nextFloat();
        System.out.println("You Entered Float : " + y);
    }
}
