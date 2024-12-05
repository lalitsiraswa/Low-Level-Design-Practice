package design_patterns.creational_patterns.abstract_factory;

public class AndroidDeveloper implements Employee {
    @Override
    public String getEmpType() {
        System.out.println("I Am A Android Developer!");
        return "ANDROID DEVELOPER";
    }

    @Override
    public int getSalary() {
        return 60000;
    }
}
