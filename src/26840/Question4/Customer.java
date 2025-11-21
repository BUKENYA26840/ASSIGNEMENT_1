package Question4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String hName, String addr, String phone, String email,
                    int roomNo, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber) {
        super(id, hName, addr, phone, email, roomNo, roomType, pricePerNight);
        this.customerName = customerName;
        this.customerEmail = (customerEmail.contains("@")) ? customerEmail : "invalid@email.com";
        this.contactNumber = (contactNumber.matches("\\d{10}")) ? contactNumber : "0000000000";
    }
}
