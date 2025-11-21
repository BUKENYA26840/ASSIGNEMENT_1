package Question6;

class Deposit extends Transaction {
    protected double depositAmount; // >0
    protected String depositDate;

    public Deposit(int id, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate){
        super(id, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount);
        setDepositAmount(depositAmount); this.depositDate = depositDate;
    }
    public void setDepositAmount(double d){ if (d>0) this.depositAmount = d; else this.depositAmount = 0.01; }
}