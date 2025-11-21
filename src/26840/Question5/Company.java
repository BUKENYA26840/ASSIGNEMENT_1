package Question5;

class Company extends Entity {
    protected String companyName;
    protected String address;
    protected String phoneNumber; // 10 digits

    public Company(int id, String companyName, String address, String phoneNumber){
        super(id);
        this.companyName = companyName;
        this.address = address;
        setPhoneNumber(phoneNumber);
    }

    public void setPhoneNumber(String p){ if (p != null && p.matches("\\d{10}")) this.phoneNumber = p; else this.phoneNumber = "0000000000"; }
}
