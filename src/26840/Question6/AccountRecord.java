package Question6;

final class AccountRecord extends Payment {
    public AccountRecord(int id, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance,
                         String customerName, String email, String phoneNumber,
                         String transactionId, String transactionType, double amount,
                         double depositAmount, String depositDate,
                         double withdrawalAmount, String withdrawalDate,
                         double loanAmount, double interestRate, int duration,
                         double paymentAmount, String paymentDate){
        super(id, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }

    public double calculateInterest(){
        return (this.loanAmount * this.interestRate * this.duration) / 100.0;
    }
}
