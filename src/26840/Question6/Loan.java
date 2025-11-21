package Question6;

class Loan extends Withdrawal {
    protected double loanAmount;
    protected double interestRate;
    protected int duration; // in years

    public Loan(int id, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, int duration){
        super(id, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate);
        setLoanAmount(loanAmount); setInterestRate(interestRate); setDuration(duration);
    }
    public void setLoanAmount(double l){ this.loanAmount = Math.max(0.01, l); }
    public void setInterestRate(double r){ this.interestRate = Math.max(0.0, r); }
    public void setDuration(int d){ this.duration = Math.max(1, d); }
}
