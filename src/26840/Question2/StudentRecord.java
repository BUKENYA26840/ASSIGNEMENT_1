package Question2;

final class StudentRecord extends Fee {
    public StudentRecord(int id, String createdDate, String updatedDate,
                         String schoolName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String teacherName, String subject, String teacherEmail, String phone,
                         String studentName, int rollNumber, String grade, String contactNumber,
                         String courseName, String courseCode, int creditHours,
                         String examName, int maxMarks, String examDate,
                         int obtainedMarks, String remarks,
                         double tuitionFee, double examFee) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours, examName, maxMarks, examDate,
                obtainedMarks, remarks, tuitionFee, examFee);
    }

    public double calculateAverageMarks() {
        return ((double) getObtainedMarks() / getMaxMarks()) * 100;
    }

    public void displayInfo() {
        System.out.println("\n===== STUDENT RECORD =====");
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Course: " + getCourseName());
        System.out.println("Exam: " + getExamName());
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Average Marks: " + String.format("%.2f%%", calculateAverageMarks()));
    }
}