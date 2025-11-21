package Question4;

public class Feedback extends Bill {
    private int rating;
    private String comments;

    public Feedback(int id, String hName, String addr, String phone, String email,
                    int roomNo, String roomType, double pricePerNight,
                    String cName, String cEmail, String contact,
                    String bookingDate, String checkInDate, String checkOutDate,
                    String serviceName, double serviceCost,
                    String paymentMethod, String paymentDate,
                    double roomCharge, double serviceCharge,
                    int rating, String comments) {
        super(id, hName, addr, phone, email, roomNo, roomType, pricePerNight,
                cName, cEmail, contact, bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost, paymentMethod, paymentDate,
                roomCharge, serviceCharge);
        this.rating = (rating >= 1 && rating <= 5) ? rating : 3;
        this.comments = comments;
    }
}
