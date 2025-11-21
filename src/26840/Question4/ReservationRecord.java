package Question4;

import java.util.Scanner;

public final class ReservationRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");


        System.out.print("Enter Hotel Name: ");
        String hName = sc.nextLine();
        System.out.print("Enter Address: ");
        String addr = sc.nextLine();
        System.out.print("Enter Phone (10 digits): ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Room Type: ");
        String roomType = sc.nextLine();
        System.out.print("Enter Price per Night: ");
        double price = sc.nextDouble(); sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String cname = sc.nextLine();
        System.out.print("Enter Customer Email: ");
        String cemail = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        System.out.print("Enter Booking Date: ");
        String bDate = sc.nextLine();
        System.out.print("Enter Check-In Date: ");
        String inDate = sc.nextLine();
        System.out.print("Enter Check-Out Date: ");
        String outDate = sc.nextLine();

        System.out.print("Enter Service Name: ");
        String sName = sc.nextLine();
        System.out.print("Enter Service Cost: ");
        double sCost = sc.nextDouble(); sc.nextLine();

        System.out.print("Enter Payment Method: ");
        String pMethod = sc.nextLine();
        System.out.print("Enter Payment Date: ");
        String pDate = sc.nextLine();

        System.out.print("Enter Room Charge: ");
        double rCharge = sc.nextDouble();
        System.out.print("Enter Service Charge: ");
        double servCharge = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Rating (1–5): ");
        int rating = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Comments: ");
        String comment = sc.nextLine();

        Feedback reservation = new Feedback(1, hName, addr, phone, email,
                roomNo, roomType, price, cname, cemail, contact,
                bDate, inDate, outDate, sName, sCost, pMethod, pDate,
                rCharge, servCharge, rating, comment);

        System.out.println("\n========== RESERVATION SUMMARY ==========");
        System.out.println("Hotel: " + hName);
        System.out.println("Customer: " + cname);
        System.out.println("Room: " + roomType + " (#" + roomNo + ")");
        System.out.println("Room Charge: " + rCharge);
        System.out.println("Service Charge: " + servCharge);
        System.out.println("Total Bill: " + (rCharge + servCharge));
        System.out.println("Rating: " + rating + "★");
        System.out.println("Comments: " + comment);
        System.out.println("=================END!!!=====================");
    }
}
