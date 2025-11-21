package Question2;

class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        this.departmentName = departmentName;
        this.departmentCode = (departmentCode.length() >= 3) ? departmentCode : "DEF123";
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}