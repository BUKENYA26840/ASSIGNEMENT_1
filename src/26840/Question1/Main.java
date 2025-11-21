package Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");





        System.out.print("Enter Hospital Name: ");
        String hName = sc.nextLine();
        System.out.print("Enter Hospital Address: ");
        String hAddress = sc.nextLine();
        System.out.print("Enter Hospital Phone (10 digits): ");
        String hPhone = sc.nextLine();
        System.out.print("Enter Hospital Email: ");
        String hEmail = sc.nextLine();

        System.out.print("Enter Department Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Department Code: ");
        String dCode = sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String docName = sc.nextLine();
        System.out.print("Enter Specialization: ");
        String spec = sc.nextLine();
        System.out.print("Enter Doctor Email: ");
        String docEmail = sc.nextLine();
        System.out.print("Enter Doctor Phone: ");
        String docPhone = sc.nextLine();

        System.out.print("Enter Nurse Name: ");
        String nurseName = sc.nextLine();
        System.out.print("Enter Shift (Day/Night): ");
        String shift = sc.nextLine();
        System.out.print("Enter Years of Experience: ");
        int years = sc.nextInt(); sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String patientName = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Gender (Male/Female/Other): ");
        String gender = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        System.out.print("Enter Admission Date: ");
        String admDate = sc.nextLine();
        System.out.print("Enter Room Number: ");
        int roomNum = sc.nextInt();
        System.out.print("Enter Room Charges: ");
        double roomCharges = sc.nextDouble(); sc.nextLine();

        System.out.print("Enter Diagnosis: ");
        String diag = sc.nextLine();
        System.out.print("Enter Treatment Given: ");
        String treat = sc.nextLine();
        System.out.print("Enter Treatment Cost: ");
        double treatCost = sc.nextDouble();

        System.out.print("Enter Doctor Fee: ");
        double docFee = sc.nextDouble();
        System.out.print("Enter Medicine Cost: ");
        double medCost = sc.nextDouble();




        HospitalRecord record = new HospitalRecord(
                1, "2025-11-13", "2025-11-13", hName, hAddress, hPhone, hEmail,
                dName, dCode, docName, spec, docEmail, docPhone,
                nurseName, shift, years, patientName, age, gender, contact,
                admDate, roomNum, roomCharges, diag, treat, treatCost, docFee, medCost);

        record.generateBill();



        sc.close();
    }
}