package design_patterns.creational_patterns.abstract_factory;

public class Client {
    public static void main(String[] args) {
        Employee androidDeveloper = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(androidDeveloper.getEmpType());
        System.out.println(androidDeveloper.getSalary());
        Employee webDeveloper = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(webDeveloper.getEmpType());
        System.out.println(webDeveloper.getSalary());
        Employee manager = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(manager.getEmpType());
        System.out.println(manager.getSalary());
    }
}
