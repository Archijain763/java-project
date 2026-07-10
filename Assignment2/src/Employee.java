
import java.util.Scanner;

class Employee {
    private String employeeName;
    private double salary;
    private int yearsOfService;

    // Setters
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Method to calculate and display bonus
    public void calculateBonus() {
        double bonus;

        if (yearsOfService >= 10)
            bonus = salary * 0.20;
        else if (yearsOfService >= 5)
            bonus = salary * 0.10;
        else
            bonus = salary * 0.05;

        double finalSalary = salary + bonus;

        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Original Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee Name: ");
        emp.setEmployeeName(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        System.out.print("Enter Years of Service: ");
        emp.setYearsOfService(sc.nextInt());

        emp.calculateBonus();
    }
}
