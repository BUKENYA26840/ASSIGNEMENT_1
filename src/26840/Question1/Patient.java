package Question1;

class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;

    public Patient(int id, String createdDate, String updatedDate, String hospitalName, String address,
                   String phoneNumber, String email, String departmentName, String departmentCode,
                   String doctorName, String specialization, String doctorEmail, String phone,
                   String nurseName, String shift, int yearsOfExperience,
                   String patientName, int age, String gender, String contactNumber) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience);

        if (age <= 0) {
            System.out.println("Warning: Age must be greater than 0");
        }
        if (!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other"))) {
            System.out.println("Warning: Invalid gender");
        }
        if (!contactNumber.matches("\\d{10}")) {
            System.out.println("Warning: Contact number must be 10 digits");
        }

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContactNumber() { return contactNumber; }
}