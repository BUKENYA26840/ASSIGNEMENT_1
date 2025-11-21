package Question3;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, String companyName, String address, String phoneNumber, String email,
                   String deptName, String deptCode, String managerName, String managerEmail, String phone) {
        super(id, companyName, address, phoneNumber, email, deptName, deptCode);
        this.managerName = managerName;
        this.managerEmail = (managerEmail.contains("@")) ? managerEmail : "invalid@email.com";
        this.phone = (phone.matches("\\d{10}")) ? phone : "0000000000";
    }
}
