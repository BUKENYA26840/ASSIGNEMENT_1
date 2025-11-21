package Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Done by:  26840 \n");
        System.out.print("-------------------------\n ");


        System.out.println(" ENTER STUDENT RECORD DETAILS");

        System.out.print("Entity ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Created Date: ");
        String createdDate = sc.nextLine();
        System.out.print("Updated Date: ");
        String updatedDate = sc.nextLine();

        System.out.print("School Name: ");
        String schoolName = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("School Phone: ");
        String schoolPhone = sc.nextLine();
        System.out.print("School Email: ");
        String schoolEmail = sc.nextLine();

        System.out.print("Department Name: ");
        String deptName = sc.nextLine();
        System.out.print("Department Code: ");
        String deptCode = sc.nextLine();

        System.out.print("Teacher Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        System.out.print("Teacher Email: ");
        String teacherEmail = sc.nextLine();
        System.out.print("Teacher Phone: ");
        String teacherPhone = sc.nextLine();

        System.out.print("Student Name: ");
        String studentName = sc.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt(); sc.nextLine();
        System.out.print("Grade: ");
        String grade = sc.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = sc.nextLine();

        System.out.print("Course Name: ");
        String courseName = sc.nextLine();
        System.out.print("Course Code: ");
        String courseCode = sc.nextLine();
        System.out.print("Credit Hours: ");
        int creditHours = sc.nextInt(); sc.nextLine();

        System.out.print("Exam Name: ");
        String examName = sc.nextLine();
        System.out.print("Max Marks: ");
        int maxMarks = sc.nextInt(); sc.nextLine();
        System.out.print("Exam Date: ");
        String examDate = sc.nextLine();

        System.out.print("Obtained Marks: ");
        int obtainedMarks = sc.nextInt(); sc.nextLine();
        System.out.print("Remarks: ");
        String remarks = sc.nextLine();

        System.out.print("Tuition Fee: ");
        double tuitionFee = sc.nextDouble();
        System.out.print("Exam Fee: ");
        double examFee = sc.nextDouble();

        StudentRecord record = new StudentRecord(
                id, createdDate, updatedDate,
                schoolName, address, schoolPhone, schoolEmail,
                deptName, deptCode,
                teacherName, subject, teacherEmail, teacherPhone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours,
                examName, maxMarks, examDate,
                obtainedMarks, remarks,
                tuitionFee, examFee
        );

        record.displayInfo();
        sc.close();
    }
}