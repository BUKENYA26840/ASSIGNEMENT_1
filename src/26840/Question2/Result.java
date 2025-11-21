package Question2;

class Result extends Exam {
    private int obtainedMarks;
    private String remarks;

    public Result(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours,
                  String examName, int maxMarks, String examDate,
                  int obtainedMarks, String remarks) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours, examName, maxMarks, examDate);
        this.obtainedMarks = (obtainedMarks >= 0) ? obtainedMarks : 0;
        this.remarks = (!remarks.isEmpty()) ? remarks : "No remarks";
    }

    public int getObtainedMarks() { return obtainedMarks; }
}