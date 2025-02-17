package diamond_problem;

interface A {
    default void display() {
        System.out.println("A's display");
    }
}

interface B extends A {
    default void display() {
        System.out.println("B's display");
    }
}

interface C extends A {
    default void display() {
        System.out.println("C's display");
    }
}

class D implements B, C {
    @Override
    public void display() {
        System.out.println("D's own display");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}
