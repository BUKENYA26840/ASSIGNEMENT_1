package Question6;

class Account extends Bank {
    protected String accountNumber;
    protected String accountType;
    protected double balance; // >=0

    public Account(int id, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance){
        super(id, bankName, branchCode, address);
        this.accountNumber = accountNumber; this.accountType = accountType; setBalance(balance);
    }
    public void setBalance(double b){ this.balance = Math.max(0, b); }
}
