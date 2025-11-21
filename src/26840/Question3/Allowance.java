package Question3;

public class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;

    public Allowance(int id, String cName, String addr, String phone, String email,
                     String deptName, String deptCode, String mName, String mEmail, String mPhone,
                     String eName, int eId, String desig, String contact,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance) {
        super(id, cName, addr, phone, email, deptName, deptCode, mName, mEmail, mPhone,
                eName, eId, desig, contact, totalDays, presentDays, leaveDays);
        this.housingAllowance = (housingAllowance >= 0) ? housingAllowance : 0;
        this.transportAllowance = (transportAllowance >= 0) ? transportAllowance : 0;
    }

    public double getTotalAllowance() {
        return housingAllowance + transportAllowance;
    }
}
