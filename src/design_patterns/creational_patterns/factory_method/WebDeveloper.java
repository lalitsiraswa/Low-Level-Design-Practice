package design_patterns.creational_patterns.factory_method;

public class WebDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Getting Web Developer Salary");
        return 80000;
    }
}
