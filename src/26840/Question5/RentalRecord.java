package Question5;

final class RentalRecord extends Invoice {
    public RentalRecord(int id, String companyName, String address, String phone, String branchName, String locCode,
                        String vehicleType, String regNum, double rate,
                        String customerName, String licenseNumber, String contactNumber,
                        String rentalDate, String returnDate, int rentalDays,
                        double rentalCharge, double penaltyCharge,
                        String paymentMode, String transactionId){
        super(id, companyName, address, phone, branchName, locCode, vehicleType, regNum, rate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);
    }

    public double calculateTotalCharge(){ return this.rentalCharge + this.penaltyCharge; }
}
