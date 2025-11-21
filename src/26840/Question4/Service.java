package Question4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, String hName, String addr, String phone, String email,
                   int roomNo, String roomType, double pricePerNight,
                   String cName, String cEmail, String contact,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost) {
        super(id, hName, addr, phone, email, roomNo, roomType, pricePerNight,
                cName, cEmail, contact, bookingDate, checkInDate, checkOutDate);
        this.serviceName = serviceName;
        this.serviceCost = (serviceCost > 0) ? serviceCost : 0;
    }

    public double getServiceCost() { return serviceCost; }
}
