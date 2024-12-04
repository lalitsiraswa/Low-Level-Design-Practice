package design_patterns.creational_patterns.factory_method;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee androidDeveloper = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(androidDeveloper);
        System.out.println(androidDeveloper.getSalary());
        Employee webDeveloper = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(webDeveloper);
        System.out.println(webDeveloper.getSalary());
    }
}
