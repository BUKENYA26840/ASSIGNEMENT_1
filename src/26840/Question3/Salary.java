package Question3;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(int id, String cName, String addr, String phone, String email,
                  String deptName, String deptCode, String mName, String mEmail, String mPhone,
                  String eName, int eId, String desig, String contact,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction,
                  double basicSalary) {
        super(id, cName, addr, phone, email, deptName, deptCode, mName, mEmail, mPhone,
                eName, eId, desig, contact, totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        this.basicSalary = (basicSalary > 0) ? basicSalary : 0;
        this.grossSalary = basicSalary + getTotalAllowance();
        this.netSalary = grossSalary - getTotalDeduction();
    }

    public double getNetSalary() {
        return netSalary;
    }
}
