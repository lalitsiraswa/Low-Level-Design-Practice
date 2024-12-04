package design_patterns.creational_patterns.factory_method;

public class EmployeeFactory {
    public static Employee getEmployee(String empType) {
        empType = empType.trim();
        if (empType.equalsIgnoreCase("android developer")) {
            return new AndroidDeveloper();
        } else if (empType.equalsIgnoreCase("web developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
