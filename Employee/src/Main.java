abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    protected String employeePhone;

    public Employee(int employeeId, String employeeName, String employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String employeeName, String employeePhone, double monthlySalary) {
        super(employeeId, employeeName, employeePhone);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, String employeeName, String employeePhone, double hourlyWage, int hoursWorked) {
        super(employeeId, employeeName, employeePhone);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Madison", "555-1234", 3000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Jamsmith", "555-5678", 30, 20);
        System.out.println("Full-Time Employee Salary: $" + fullTimeEmployee.calculateSalary());
        System.out.println("Part-Time Employee Salary: $" + partTimeEmployee.calculateSalary());
    }
}