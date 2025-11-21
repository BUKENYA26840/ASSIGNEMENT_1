package Question1;

import java.util.regex.Pattern;

class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, String createdDate, String updatedDate, String hospitalName,
                    String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            System.out.println("Warning: Phone number must be 10 digits");
        }
        if (email == null || !Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email)) {
            System.out.println("Warning: Invalid email format");
        }

        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() { return hospitalName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}