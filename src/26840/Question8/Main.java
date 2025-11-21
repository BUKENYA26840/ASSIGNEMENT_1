package Question8;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Done by:  26840 \n");
         System.out.print("-------------------------\n ");

         System.out.println("Library Demo");
         System.out.print("Library id: ");
         int id = Integer.parseInt(sc.nextLine());
         System.out.print("Library name: ");
         String lib = sc.nextLine();
         System.out.print("Location: ");
         String loc = sc.nextLine();
         System.out.print("Phone (10 digits): ");
         String phone = sc.nextLine();
         System.out.print("Section name: ");
         String section = sc.nextLine();
         System.out.print("Section code (>=3): ");
         String scode = sc.nextLine();
         System.out.print("Book title: ");
         String title = sc.nextLine();
         System.out.print("Author: ");
         String author = sc.nextLine();
         System.out.print("ISBN (>=10): ");
         String isbn = sc.nextLine();
         System.out.print("Member name: ");
         String mname = sc.nextLine();
         System.out.print("Member id (>0): ");
         int mid = Integer.parseInt(sc.nextLine());
         System.out.print("Contact number: ");
         String contact = sc.nextLine();
         System.out.print("Borrow date: ");
         String bdate = sc.nextLine();
         System.out.print("Return date: ");
         String rdate = sc.nextLine();
         System.out.print("Fine amount (>=0): ");
         double f = Double.parseDouble(sc.nextLine());
         System.out.print("Days late: ");
         int days = Integer.parseInt(sc.nextLine());
         System.out.print("Payment date: ");
         String pdate = sc.nextLine();
         System.out.print("Payment mode: ");
         String pmode = sc.nextLine();
         LibraryRecord lr = new LibraryRecord(id, lib, loc, phone, section, scode, title, author, isbn, mname, mid, contact, bdate, rdate, f, days, pdate, pmode); System.out.println("Calculated fine: " + lr.calculateFine()); sc.close(); } }


