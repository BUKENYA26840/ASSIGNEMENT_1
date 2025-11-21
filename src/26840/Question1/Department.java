package Question1;

class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate, String hospitalName, String address,
                      String phoneNumber, String email, String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);

        if (departmentCode == null || departmentCode.length() < 3 || !departmentCode.matches("[A-Za-z0-9]+")) {
            System.out.println("Warning: Department code must be alphanumeric and at least 3 characters");
        }

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}