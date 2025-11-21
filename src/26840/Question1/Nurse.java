package Question1;

class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse(int id, String createdDate, String updatedDate, String hospitalName, String address,
                 String phoneNumber, String email, String departmentName, String departmentCode,
                 String doctorName, String specialization, String doctorEmail, String phone,
                 String nurseName, String shift, int yearsOfExperience) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, phone);

        if (!(shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night"))) {
            System.out.println("Warning: Shift must be Day or Night");
        }
        if (yearsOfExperience < 0) {
            System.out.println("Warning: Years of experience must be ≥ 0");
        }

        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNurseName() { return nurseName; }
    public String getShift() { return shift; }
    public int getYearsOfExperience() { return yearsOfExperience; }
}