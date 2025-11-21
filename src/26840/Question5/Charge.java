package Question5;

class Charge extends Rental {
    protected double rentalCharge; // >=0
    protected double penaltyCharge; // >=0

    public Charge(int id, String companyName, String address, String phone, String branchName, String locCode,
                  String vehicleType, String regNum, double rate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge){
        super(id, companyName, address, phone, branchName, locCode, vehicleType, regNum, rate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays);
        setRentalCharge(rentalCharge);
        setPenaltyCharge(penaltyCharge);
    }

    public void setRentalCharge(double c){ this.rentalCharge = Math.max(0, c); }
    public void setPenaltyCharge(double c){ this.penaltyCharge = Math.max(0, c); }
}