package design_patterns.creational_patterns.abstract_factory;

public class WebDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
