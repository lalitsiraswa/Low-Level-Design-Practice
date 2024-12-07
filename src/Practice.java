abstract class Parent {
    public String name;
}

class Child extends Parent {
    // Initialization Block
    {
        name = "Lalit Siraswa";
    }

    void fun() {
        System.out.println(name);
    }
}

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Child obj = new Child();
        System.out.println(obj.name);
        obj.fun();
    }
}
