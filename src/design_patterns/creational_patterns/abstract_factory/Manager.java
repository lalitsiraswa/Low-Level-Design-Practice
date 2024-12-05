package design_patterns.creational_patterns.abstract_factory;

public class Manager implements Employee {
    @Override
    public String getEmpType() {
        System.out.println("I Am A Manager!");
        return "MANAGER";
    }

    @Override
    public int getSalary() {
        return 100000;
    }
}
