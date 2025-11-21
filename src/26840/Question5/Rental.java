package Question5;

class Rental extends Customer {
    protected String rentalDate; // as String
    protected String returnDate;
    protected int rentalDays; // >0

    public Rental(int id, String companyName, String address, String phone, String branchName, String locCode,
                  String vehicleType, String regNum, double rate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays){
        super(id, companyName, address, phone, branchName, locCode, vehicleType, regNum, rate, customerName, licenseNumber, contactNumber);
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        setRentalDays(rentalDays);
    }

    public void setRentalDays(int d){ if (d > 0) this.rentalDays = d; else this.rentalDays = 1; }
}
