package Question5;

class Customer extends Vehicle {
    protected String customerName;
    protected String licenseNumber;
    protected String contactNumber; // license not empty

    public Customer(int id, String companyName, String address, String phone, String branchName, String locCode,
                     String vehicleType, String regNum, double rate,
                     String customerName, String licenseNumber, String contactNumber){
        super(id, companyName, address, phone, branchName, locCode, vehicleType, regNum, rate);
        this.customerName = customerName;
        setLicenseNumber(licenseNumber);
        this.contactNumber = contactNumber;
    }

    public void setLicenseNumber(String l){ if (l != null && !l.trim().isEmpty()) this.licenseNumber = l; else this.licenseNumber = "UNKNOWN"; }
}
