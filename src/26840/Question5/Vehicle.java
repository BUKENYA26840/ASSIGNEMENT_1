package Question5;

class Vehicle extends Branch {
    protected String vehicleType;
    protected String registrationNumber;
    protected double dailyRate; // >0

    public Vehicle(int id, String companyName, String address, String phone, String branchName, String locCode,
                   String vehicleType, String registrationNumber, double dailyRate){
        super(id, companyName, address, phone, branchName, locCode);
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        setDailyRate(dailyRate);
    }

    public void setDailyRate(double r){ if (r > 0) this.dailyRate = r; else this.dailyRate = 1.0; }
}
