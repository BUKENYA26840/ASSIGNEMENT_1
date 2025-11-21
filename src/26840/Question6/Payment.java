package Question6;

class Payment extends Loan {
    protected double paymentAmount;
    protected String paymentDate;

    public Payment(int id, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate,
                   double withdrawalAmount, String withdrawalDate,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount, String paymentDate){
        super(id, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        setPaymentAmount(paymentAmount); this.paymentDate = paymentDate;
    }
    public void setPaymentAmount(double p){ this.paymentAmount = Math.max(0.01, p); }
}
