package Question2;

class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);
        this.teacherName = teacherName;
        this.subject = (!subject.isEmpty()) ? subject : "Unknown";
        this.teacherEmail = (teacherEmail.contains("@")) ? teacherEmail : "noemail@school.com";
        this.phone = (phone.matches("\\d{10}")) ? phone : "0000000000";
    }
    public String getTeacherName() { return teacherName; }
    public String getSubject() { return subject; }
}