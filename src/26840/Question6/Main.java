package Question6;

import java.util.Scanner;

class main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");

        System.out.println(" Banking Demo ");
        System.out.print("Bank id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Bank name: ");
        String bankName = sc.nextLine();
        System.out.print("Branch code (>=3): ");
        String bCode = sc.nextLine();
        System.out.print("Address: ");
        String addr = sc.nextLine();
        System.out.print("Account number: ");
        String accNum = sc.nextLine();
        System.out.print("Account type: ");
        String accType = sc.nextLine();
        System.out.print("Balance (>=0): ");
        double bal = Double.parseDouble(sc.nextLine());
        System.out.print("Customer name: ");
        String cust = sc.nextLine();
        System.out.print("Customer email: ");
        String email = sc.nextLine();
        System.out.print("Customer phone: ");
        String phone = sc.nextLine();
        System.out.print("Transaction id: ");
        String tx = sc.nextLine();
        System.out.print("Transaction type: ");
        String txType = sc.nextLine();
        System.out.print("Amount (>0): ");
        double amt = Double.parseDouble(sc.nextLine());
        System.out.print("Deposit amount (>0): ");
        double dep = Double.parseDouble(sc.nextLine());
        System.out.print("Deposit date (YYYY-MM-DD): ");
        String ddate = sc.nextLine();
        System.out.print("Withdrawal amount (>0): ");
        double withdraw = Double.parseDouble(sc.nextLine());
        System.out.print("Withdrawal date (YYYY-MM-DD): ");
        String wdate = sc.nextLine();
        System.out.print("Loan amount (>0): ");
        double loan = Double.parseDouble(sc.nextLine());
        System.out.print("Interest rate (percent): ");
        double rate = Double.parseDouble(sc.nextLine());
        System.out.print("Duration (years): ");
        int duration = Integer.parseInt(sc.nextLine());
        System.out.print("Payment amount (>0): ");
        double pay = Double.parseDouble(sc.nextLine());
        System.out.print("Payment date (YYYY-MM-DD): ");
        String payDate = sc.nextLine();

        AccountRecord ar = new AccountRecord(id, bankName, bCode, addr, accNum, accType, bal, cust, email, phone, tx, txType, amt, dep, ddate, withdraw, wdate, loan, rate, duration, pay, payDate);
        System.out.println("Calculated interest: " + ar.calculateInterest());
        sc.close();
    }
}
