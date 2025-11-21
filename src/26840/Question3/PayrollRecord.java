package Question3;

import java.util.Scanner;

public final class PayrollRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");


        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter Housing Allowance: ");
        double house = sc.nextDouble();
        System.out.print("Enter Transport Allowance: ");
        double trans = sc.nextDouble();
        System.out.print("Enter Tax Deduction: ");
        double tax = sc.nextDouble();
        System.out.print("Enter Loan Deduction: ");
        double loan = sc.nextDouble();

        Salary salary = new Salary(1, "TechCorp", "Kigali", "0788888888", "hr@techcorp.com",
                "IT", "IT01", "Alice", "alice@techcorp.com", "0788888888",
                "Bob", 101, "Developer", "0799999999",
                30, 28, 2, house, trans, tax, loan, basic);

        System.out.println("\n--- Payroll Record ---");
        System.out.println("Basic Salary: " + basic);
        System.out.println("Allowances: " + (house + trans));
        System.out.println("Deductions: " + (tax + loan));
        System.out.println("Net Salary: " + salary.getNetSalary());
    }
}
