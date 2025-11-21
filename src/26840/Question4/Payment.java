package Question4;

public class Payment extends Service {
    private String paymentMethod;
    private String paymentDate;

    public Payment(int id, String hName, String addr, String phone, String email,
                   int roomNo, String roomType, double pricePerNight,
                   String cName, String cEmail, String contact,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod, String paymentDate) {
        super(id, hName, addr, phone, email, roomNo, roomType, pricePerNight,
                cName, cEmail, contact, bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost);
        this.paymentMethod = paymentMethod;
        this.paymentDate = (paymentDate.isEmpty()) ? "Unknown" : paymentDate;
    }
}
