package design_patterns.creational_patterns.abstract_factory;

public class WebDeveloper implements Employee {
    @Override
    public String getEmpType() {
        System.out.println("I Am A Web Developer!");
        return "WEB DEVELOPER";
    }

    @Override
    public int getSalary() {
        return 80000;
    }
}
