package Question6;

class Customer extends Account {
    protected String customerName;
    protected String email;
    protected String phoneNumber;

    public Customer(int id, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber){
        super(id, bankName, branchCode, address, accountNumber, accountType, balance);
        this.customerName = customerName; setEmail(email); this.phoneNumber = phoneNumber;
    }

    public void setEmail(String e){ if (e!=null && e.matches("^.+@.+\\..+$")) this.email = e; else this.email = "unknown@domain.com"; }
}
