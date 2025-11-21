package Question5;

class Payment extends Charge {
    protected String paymentMode;
    protected String transactionId; // not empty

    public Payment(int id, String companyName, String address, String phone, String branchName, String locCode,
                    String vehicleType, String regNum, double rate,
                    String customerName, String licenseNumber, String contactNumber,
                    String rentalDate, String returnDate, int rentalDays,
                    double rentalCharge, double penaltyCharge,
                    String paymentMode, String transactionId){
        super(id, companyName, address, phone, branchName, locCode, vehicleType, regNum, rate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);
        this.paymentMode = paymentMode;
        setTransactionId(transactionId);
    }

    public void setTransactionId(String t){ if (t != null && !t.trim().isEmpty()) this.transactionId = t; else this.transactionId = "N/A"; }
}
