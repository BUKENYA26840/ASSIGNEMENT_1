package Question5;

import java.util.Scanner;

class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");

        System.out.println(" Vehicle Rental Demo ");
        System.out.print("Company id (int): "); int id = Integer.parseInt(sc.nextLine());
        System.out.print("Company name: "); String cName = sc.nextLine();
        System.out.print("Company address: "); String addr = sc.nextLine();
        System.out.print("Company phone (10 digits): "); String phone = sc.nextLine();
        System.out.print("Branch name: "); String bName = sc.nextLine();
        System.out.print("Branch code (>=3 chars): "); String bCode = sc.nextLine();
        System.out.print("Vehicle type: "); String vType = sc.nextLine();
        System.out.print("Reg number: "); String reg = sc.nextLine();
        System.out.print("Daily rate (>0): "); double rate = Double.parseDouble(sc.nextLine());
        System.out.print("Customer name: "); String cust = sc.nextLine();
        System.out.print("License number: "); String lic = sc.nextLine();
        System.out.print("Contact number: "); String cont = sc.nextLine();
        System.out.print("Rental date (YYYY-MM-DD): "); String rdate = sc.nextLine();
        System.out.print("Return date (YYYY-MM-DD): "); String ret = sc.nextLine();
        System.out.print("Rental days (>0): "); int days = Integer.parseInt(sc.nextLine());
        double rentalCharge = rate * days; System.out.println("Calculated rentalCharge = " + rentalCharge);
        System.out.print("Penalty charge (>=0): "); double pen = Double.parseDouble(sc.nextLine());
        System.out.print("Payment mode: "); String pMode = sc.nextLine();
        System.out.print("Transaction id: "); String tx = sc.nextLine();

        RentalRecord rec = new RentalRecord(id, cName, addr, phone, bName, bCode, vType, reg, rate, cust, lic, cont, rdate, ret, days, rentalCharge, pen, pMode, tx);
        System.out.println("Total charge (calculateTotalCharge): " + rec.calculateTotalCharge());
        sc.close();
    }
}
