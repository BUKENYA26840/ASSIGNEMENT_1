package Question3;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(int id, String cName, String addr, String phone, String email,
                      String deptName, String deptCode, String mName, String mEmail, String mPhone,
                      String eName, int eId, String desig, String contact,
                      int totalDays, int presentDays, int leaveDays) {
        super(id, cName, addr, phone, email, deptName, deptCode, mName, mEmail, mPhone, eName, eId, desig, contact);
        this.totalDays = (totalDays >= 0) ? totalDays : 0;
        this.presentDays = (presentDays <= totalDays) ? presentDays : totalDays;
        this.leaveDays = (leaveDays >= 0) ? leaveDays : 0;
    }
}
