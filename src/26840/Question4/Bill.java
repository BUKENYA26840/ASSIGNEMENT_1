package Question4;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, String hName, String addr, String phone, String email,
                int roomNo, String roomType, double pricePerNight,
                String cName, String cEmail, String contact,
                String bookingDate, String checkInDate, String checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, String paymentDate,
                double roomCharge, double serviceCharge) {
        super(id, hName, addr, phone, email, roomNo, roomType, pricePerNight,
                cName, cEmail, contact, bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost, paymentMethod, paymentDate);
        this.roomCharge = (roomCharge > 0) ? roomCharge : 0;
        this.serviceCharge = (serviceCharge > 0) ? serviceCharge : 0;
        this.totalBill = this.roomCharge + this.serviceCharge;
    }

    public double getTotalBill() { return totalBill; }
}
