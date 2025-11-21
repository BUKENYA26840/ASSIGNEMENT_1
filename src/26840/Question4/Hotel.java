package Question4;

import java.util.Scanner;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, String hotelName, String address, String phoneNumber, String email) {
        super(id);
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber.matches("\\d{10}") ? phoneNumber : "0000000000";
        this.email = email.contains("@") ? email : "invalid@email.com";
    }

    public static Hotel inputHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hotel ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Hotel Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();
        System.out.print("Enter Phone (10 digits): ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        return new Hotel(id, name, addr, phone, email);
    }

    public void display() {
        System.out.println("\n--- HOTEL INFO ---");
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
