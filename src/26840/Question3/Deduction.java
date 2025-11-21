package Question3;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction(int id, String cName, String addr, String phone, String email,
                     String deptName, String deptCode, String mName, String mEmail, String mPhone,
                     String eName, int eId, String desig, String contact,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance,
                     double taxDeduction, double loanDeduction) {
        super(id, cName, addr, phone, email, deptName, deptCode, mName, mEmail, mPhone,
                eName, eId, desig, contact, totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance);
        this.taxDeduction = (taxDeduction >= 0) ? taxDeduction : 0;
        this.loanDeduction = (loanDeduction >= 0) ? loanDeduction : 0;
    }

    public double getTotalDeduction() {
        return taxDeduction + loanDeduction;
    }
}
