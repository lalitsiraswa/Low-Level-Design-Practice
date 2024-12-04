package design_patterns.creational_patterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// It uses the volatile keyword to ensure that changes to the instance variable are immediately visible to other threads.
class TVSet {
    // The single instance, initially null, marked as volatile
    private static volatile TVSet tvSetInstance = null;

    // Private constructor to prevent instantiation
    private TVSet() {
        System.out.println("TV Set Instantiated!");
    }

    // Public method to get the instance
    public static TVSet getTvSetInstance() {
        System.out.println(Thread.currentThread());
        // First check (not synchronized)
        if (tvSetInstance == null) { // Optimisation
            System.out.println(Thread.currentThread());
            // Synchronize on the class object
            synchronized (TVSet.class) {
                // Second check (synchronized)
                if (tvSetInstance == null) { // Double Checking
                    System.out.println(Thread.currentThread());
                    tvSetInstance = new TVSet();
                }
            }
        }
        // Return the instance (either newly created or existing)
        return tvSetInstance;
    }
}

public class SingletonDesign {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Started");
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            executorService.execute(TVSet::getTvSetInstance);
            executorService.execute(TVSet::getTvSetInstance);
            executorService.execute(TVSet::getTvSetInstance);
            executorService.execute(TVSet::getTvSetInstance);
            executorService.execute(TVSet::getTvSetInstance);
            executorService.execute(TVSet::getTvSetInstance);
        }
        System.out.println(Thread.currentThread().getName() + " Exiting");
    }
}
