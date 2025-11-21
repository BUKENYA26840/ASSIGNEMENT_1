package Question6;

class Bank extends Entity {
    protected String bankName;
    protected String branchCode; // >=3
    protected String address;

    public Bank(int id, String bankName, String branchCode, String address){ super(id); this.bankName = bankName; setBranchCode(branchCode); this.address = address; }
    public void setBranchCode(String c){ if (c!=null && c.length()>=3) this.branchCode = c; else this.branchCode = "N/A"; }
}