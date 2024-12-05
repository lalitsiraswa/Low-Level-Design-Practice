package design_patterns.creational_patterns.abstract_factory;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
