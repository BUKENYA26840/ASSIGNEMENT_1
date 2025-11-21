package Question6;

class Withdrawal extends Deposit {
    protected double withdrawalAmount;
    protected String withdrawalDate;

    public Withdrawal(int id, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double depositAmount, String depositDate,
                      double withdrawalAmount, String withdrawalDate){
        super(id, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate);
        setWithdrawalAmount(withdrawalAmount); this.withdrawalDate = withdrawalDate;
    }
    public void setWithdrawalAmount(double w){ if (w>0) this.withdrawalAmount = w; else this.withdrawalAmount = 0.01; }
}
