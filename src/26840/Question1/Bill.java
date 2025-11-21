package Question1;

class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;
    private double totalBill;

    public Bill(int id, String createdDate, String updatedDate, String hospitalName, String address,
                String phoneNumber, String email, String departmentName, String departmentCode,
                String doctorName, String specialization, String doctorEmail, String phone,
                String nurseName, String shift, int yearsOfExperience,
                String patientName, int age, String gender, String contactNumber,
                String admissionDate, int roomNumber, double roomCharges,
                String diagnosis, String treatmentGiven, double treatmentCost,
                double doctorFee, double medicineCost) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost);

        if (doctorFee <= 0 || medicineCost <= 0) {
            System.out.println("Warning: Doctor fee and medicine cost must be > 0");
        }

        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
        this.totalBill = 0;
    }

    public double getDoctorFee() { return doctorFee; }
    public double getMedicineCost() { return medicineCost; }
    public double getTotalBill() { return totalBill; }

    protected void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}