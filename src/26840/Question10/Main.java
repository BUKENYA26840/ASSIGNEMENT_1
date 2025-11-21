package Question10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");

        System.out.println("Online Shopping Demo");
        System.out.print("Store id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Store name: ");
        String store = sc.nextLine();
        System.out.print("Store address: ");
        String addr = sc.nextLine();
        System.out.print("Store email: ");
        String email = sc.nextLine();
        System.out.print("Category name: ");
        String cname = sc.nextLine();
        System.out.print("Category code (>=3): ");
        String ccode = sc.nextLine();
        System.out.print("Product name: ");
        String pname = sc.nextLine();
        System.out.print("Product code: ");
        String pcode = sc.nextLine();
        System.out.print("Price (>0): ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Customer name: ");
        String cnameCust = sc.nextLine();
        System.out.print("Contact number: ");
        String ccontact = sc.nextLine();
        System.out.print("Customer address: ");
        String caddr = sc.nextLine();
        System.out.print("Order date: ");
        String odate = sc.nextLine();
        System.out.print("Order id: ");
        String oid = sc.nextLine();
        System.out.print("Payment method: ");
        String pmethod = sc.nextLine();
        System.out.print("Payment status: ");
        String pstatus = sc.nextLine();
        System.out.print("Shipping address: ");
        String saddr = sc.nextLine();
        System.out.print("Shipping cost (>=0): ");
        double scost = Double.parseDouble(sc.nextLine());
        OrderRecord or = new OrderRecord(id, store, addr, email, cname, ccode, pname, pcode, price, cnameCust, ccontact, caddr, odate, oid, pmethod, pstatus, saddr, scost);
        System.out.println("Calculated total amount: " + or.calculateTotalAmount()); sc.close(); } }


