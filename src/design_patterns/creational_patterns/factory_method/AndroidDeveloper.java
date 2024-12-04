package design_patterns.creational_patterns.factory_method;

public class AndroidDeveloper implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Getting Android Developer Salary");
        return 70000;
    }
}
