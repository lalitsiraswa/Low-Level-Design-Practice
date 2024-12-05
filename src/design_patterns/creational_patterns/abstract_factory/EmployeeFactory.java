package design_patterns.creational_patterns.abstract_factory;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}
