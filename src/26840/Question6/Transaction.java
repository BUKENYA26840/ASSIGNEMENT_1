package Question6;

class Transaction extends Customer {
    protected String transactionId;
    protected String transactionType;
    protected double amount; // >0

    public Transaction(int id, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount){
        super(id, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber);
        this.transactionId = transactionId; this.transactionType = transactionType; setAmount(amount);
    }

    public void setAmount(double a){ if (a>0) this.amount = a; else this.amount = 0.01; }
}
