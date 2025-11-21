package Question7;

import java.util.Scanner;

class RealEstateDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");

        System.out.println("Real Estate Demo");
        System.out.print("Agency id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Agency name: ");
        String agency = sc.nextLine();
        System.out.print("Location: ");
        String loc = sc.nextLine();
        System.out.print("Phone (10 digits): ");
        String phone = sc.nextLine();
        System.out.print("Agent name: ");
        String agent = sc.nextLine();
        System.out.print("Agent email: ");
        String aemail = sc.nextLine();
        System.out.print("Agent license: ");
        String lic = sc.nextLine();
        System.out.print("Property code: ");
        String pcode = sc.nextLine();
        System.out.print("Property type: ");
        String ptype = sc.nextLine();
        System.out.print("Price (>0): ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Seller name: ");
        String seller = sc.nextLine();
        System.out.print("Seller contact: ");
        String scont = sc.nextLine();
        System.out.print("Buyer name: ");
        String buyer = sc.nextLine();
        System.out.print("Buyer email: ");
        String bemail = sc.nextLine();
        System.out.print("Agreement date: ");
        String adate = sc.nextLine();
        System.out.print("Agreement terms: ");
        String terms = sc.nextLine();
        System.out.print("Payment amount (>0): ");
        double pay = Double.parseDouble(sc.nextLine());
        System.out.print("Payment date: ");
        String pdate = sc.nextLine();
        System.out.print("Commission rate (percent): ");
        double crate = Double.parseDouble(sc.nextLine());
        RealEstateRecord r = new RealEstateRecord(id, agency, loc, phone, agent, aemail, lic, pcode, ptype, price, seller, scont, buyer, bemail, adate, terms, pay, pdate, crate);
        System.out.println("Commission calculated: " + r.calculateCommission());
        sc.close(); } }
