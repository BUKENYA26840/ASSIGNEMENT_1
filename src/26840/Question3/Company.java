package Question3;

import java.util.Scanner;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, String companyName, String address, String phoneNumber, String email) {
        super(id);
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = (phoneNumber.matches("\\d{10}")) ? phoneNumber : "0000000000";
        this.email = (email.contains("@")) ? email : "invalid@email.com";
    }

    public static Company inputCompany() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Company Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();
        System.out.print("Enter Phone (10 digits): ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        return new Company(id, name, addr, phone, email);
    }

    public void display() {
        System.out.println("\n--- Company Info ---");
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
