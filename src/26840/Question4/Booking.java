package Question4;

public class Booking extends Customer {
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    public Booking(int id, String hName, String addr, String phone, String email,
                   int roomNo, String roomType, double pricePerNight,
                   String cName, String cEmail, String contact,
                   String bookingDate, String checkInDate, String checkOutDate) {
        super(id, hName, addr, phone, email, roomNo, roomType, pricePerNight, cName, cEmail, contact);
        this.bookingDate = (bookingDate.isEmpty()) ? "N/A" : bookingDate;
        this.checkInDate = (checkInDate.isEmpty()) ? "N/A" : checkInDate;
        this.checkOutDate = (checkOutDate.isEmpty()) ? "N/A" : checkOutDate;
    }
}
