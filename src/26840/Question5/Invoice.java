package Question5;

class Invoice extends Payment {
    protected double totalCharge; // >0

    public Invoice(int id, String companyName, String address, String phone, String branchName, String locCode,
                    String vehicleType, String regNum, double rate,
                    String customerName, String licenseNumber, String contactNumber,
                    String rentalDate, String returnDate, int rentalDays,
                    double rentalCharge, double penaltyCharge,
                    String paymentMode, String transactionId){
        super(id, companyName, address, phone, branchName, locCode, vehicleType, regNum, rate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);
        setTotalCharge(rentalCharge + penaltyCharge);
    }

    public void setTotalCharge(double t){ if (t > 0) this.totalCharge = t; else this.totalCharge = 0.01; }
}
