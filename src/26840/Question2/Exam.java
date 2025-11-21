package Question2;

class Exam extends Course {
    private String examName;
    private int maxMarks;
    private String examDate;

    public Exam(int id, String createdDate, String updatedDate,
                String schoolName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String teacherName, String subject, String teacherEmail, String phone,
                String studentName, int rollNumber, String grade, String contactNumber,
                String courseName, String courseCode, int creditHours,
                String examName, int maxMarks, String examDate) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours);
        this.examName = examName;
        this.maxMarks = (maxMarks > 0) ? maxMarks : 100;
        this.examDate = (!examDate.isEmpty()) ? examDate : "N/A";
    }

    public int getMaxMarks() { return maxMarks; }
    public String getExamName() { return examName; }
}