package Question1;

final class HospitalRecord extends Bill {
    public HospitalRecord(int id, String createdDate, String updatedDate, String hospitalName, String address,
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
                diagnosis, treatmentGiven, treatmentCost, doctorFee, medicineCost);
    }

    public void generateBill() {
        double total = getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
        setTotalBill(total);
        System.out.println("\n----- Final Bill Summary -----");
        System.out.println("Patient: " + getPatientName());
        System.out.println("Room Charges: " + getRoomCharges());
        System.out.println("Treatment Cost: " + getTreatmentCost());
        System.out.println("Doctor Fee: " + getDoctorFee());
        System.out.println("Medicine Cost: " + getMedicineCost());
        System.out.println("TOTAL BILL: " + total);
    }
}
