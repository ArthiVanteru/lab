public class Employee {
    private static int empIdCounter = 1000; 
    private int empId;
    private String empName;
    private static String companyName = "XYZ Corp"; 

    // Constructor to initialize employee ID and name
    public Employee(String empName) {
        this.empId = empIdCounter++;
        this.empName = empName;
    }

    // Static method to display employee details
    public static void displayEmployeeDetails(Employee emp) {
        System.out.println("Employee ID: " + emp.empId);
        System.out.println("Employee Name: " + emp.empName);
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe");
        Employee emp2 = new Employee("Jane Smith");

        // Display details of both employees
        System.out.println("Employee 1 details:");
        displayEmployeeDetails(emp1);
        System.out.println();

        System.out.println("Employee 2 details:");
        displayEmployeeDetails(emp2);
    }
}
