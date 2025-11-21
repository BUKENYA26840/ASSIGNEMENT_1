package Question1;

import java.util.regex.Pattern;

class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, String createdDate, String updatedDate, String hospitalName, String address,
            String phoneNumber, String email, String departmentName, String departmentCode,
            String doctorName, String specialization, String doctorEmail, String phone) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);

        if (specialization == null || specialization.isEmpty()) {
            System.out.println("Warning: Specialization cannot be empty");
        }
        if (!Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", doctorEmail)) {
            System.out.println("Warning: Invalid doctor email");
        }
        if (!phone.matches("\\d{10}")) {
            System.out.println("Warning: Doctor phone must be 10 digits");
        }

        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() { return doctorName; }
    public String getSpecialization() { return specialization; }
    public String getDoctorEmail() { return doctorEmail; }
    public String getPhone() { return phone; }
}
