package Question9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");

        System.out.println("Airline Ticketing Demo");
        System.out.print("Airline id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Airline name: ");
        String airline = sc.nextLine();
        System.out.print("Address: ");
        String addr = sc.nextLine();
        System.out.print("Contact email: ");
        String email = sc.nextLine();
        System.out.print("Flight number: ");
        String fnum = sc.nextLine();
        System.out.print("Destination: ");
        String dest = sc.nextLine();
        System.out.print("Departure time: ");
        String dtime = sc.nextLine();
        System.out.print("Passenger name: ");
        String pname = sc.nextLine();
        System.out.print("Passport number: ");
        String passport = sc.nextLine();
        System.out.print("Nationality: ");
        String nat = sc.nextLine();
        System.out.print("Seat number: ");
        String seat = sc.nextLine();
        System.out.print("Seat type (Economy/Business): ");
        String stype = sc.nextLine();
        System.out.print("Ticket number: ");
        String tnum = sc.nextLine();
        System.out.print("Ticket price (>0): ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Baggage weight: ");
        double bw = Double.parseDouble(sc.nextLine());
        System.out.print("Baggage fee: ");
        double bf = Double.parseDouble(sc.nextLine());
        System.out.print("Payment date: ");
        String pdate = sc.nextLine();
        System.out.print("Payment mode: ");
        String pmode = sc.nextLine();
        TicketRecord tr = new TicketRecord(id, airline, addr, email, fnum, dest, dtime, pname, passport, nat, seat, stype, tnum, price, bw, bf, pdate, pmode);
        System.out.println("Generated invoice (price + baggageFee): " + tr.generateInvoice()); sc.close(); } }


