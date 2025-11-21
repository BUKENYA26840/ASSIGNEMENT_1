package Question3;

import java.util.Scanner;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String companyName, String address, String phone, String email,
                      String departmentName, String departmentCode) {
        super(id, companyName, address, phone, email);
        this.departmentName = departmentName;
        this.departmentCode = (departmentCode.matches("[a-zA-Z0-9]{3,}")) ? departmentCode : "DEF001";
    }

    public static Department inputDepartment() {
        Company c = Company.inputCompany();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department Code (≥3 chars): ");
        String code = sc.nextLine();
        return new Department(c.getId(), c.toString(), "", "", "", name, code);
    }

    public void display() {
        super.display();
        System.out.println("Department: " + departmentName + " (" + departmentCode + ")");
    }
}
