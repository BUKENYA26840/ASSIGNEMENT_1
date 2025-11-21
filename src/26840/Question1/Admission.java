package Question1;

class Admission extends Patient {
    private String admissionDate;
    private int roomNumber;
    private double roomCharges;

    public Admission(int id, String createdDate, String updatedDate, String hospitalName, String address,
                     String phoneNumber, String email, String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     String admissionDate, int roomNumber, double roomCharges) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber);

        if (admissionDate == null || admissionDate.isEmpty()) {
            System.out.println("Warning: Admission date cannot be null or empty");
        }
        if (roomCharges <= 0) {
            System.out.println("Warning: Room charges must be > 0");
        }

        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public String getAdmissionDate() { return admissionDate; }
    public int getRoomNumber() { return roomNumber; }
    public double getRoomCharges() { return roomCharges; }
}