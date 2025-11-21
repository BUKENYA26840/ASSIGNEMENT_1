package Question2;

class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public Fee(int id, String createdDate, String updatedDate,
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
                obtainedMarks, remarks);
        this.tuitionFee = (tuitionFee > 0) ? tuitionFee : 0;
        this.examFee = (examFee > 0) ? examFee : 0;
        this.totalFee = this.tuitionFee + this.examFee;
    }

    public double getTotalFee() { return totalFee; }
}