package Question2;

class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id > 0) this.id = id;
        else {
            System.out.println("Invalid ID, set to 1");
            this.id = 1;
        }

        this.createdDate = (createdDate != null && !createdDate.isEmpty()) ? createdDate : "N/A";
        this.updatedDate = (updatedDate != null && !updatedDate.isEmpty()) ? updatedDate : "N/A";
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}

// School
class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);
        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber.matches("\\d{10}") ? phoneNumber : "0000000000";
        this.email = (email.contains("@")) ? email : "invalid@email.com";
    }

    public String getSchoolName() { return schoolName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
