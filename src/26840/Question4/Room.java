package Question4;

public class Room extends Hotel {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String hotelName, String address, String phone, String email,
                int roomNumber, String roomType, double pricePerNight) {
        super(id, hotelName, address, phone, email);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = (pricePerNight > 0) ? pricePerNight : 0;
    }

    public double getPricePerNight() { return pricePerNight; }
}
