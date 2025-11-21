package Question5;

class Branch extends Company {
    protected String branchName;
    protected String locationCode; // >=3 chars

    public Branch(int id, String companyName, String address, String phone, String branchName, String locationCode){
        super(id, companyName, address, phone);
        this.branchName = branchName;
        setLocationCode(locationCode);
    }

    public void setLocationCode(String c){ if (c != null && c.length() >=3) this.locationCode = c; else this.locationCode = "N/A"; }
}
