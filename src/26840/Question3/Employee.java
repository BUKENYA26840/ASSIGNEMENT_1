package Question3;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, String companyName, String address, String phoneNumber, String email,
                    String deptName, String deptCode, String managerName, String managerEmail, String mphone,
                    String employeeName, int employeeId, String designation, String contactNumber) {
        super(id, companyName, address, phoneNumber, email, deptName, deptCode, managerName, managerEmail, mphone);
        this.employeeName = employeeName;
        this.employeeId = (employeeId > 0) ? employeeId : 1;
        this.designation = designation;
        this.contactNumber = (contactNumber.matches("\\d{10}")) ? contactNumber : "0000000000";
    }
}
