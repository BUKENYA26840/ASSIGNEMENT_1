package Question9;

class Seat extends Passenger { protected String seatNumber; protected String seatType; // Economy/Business
    public Seat(int id, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType){ super(id, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality); this.seatNumber = seatNumber; setSeatType(seatType);} public void setSeatType(String s){ if (s!=null && (s.equalsIgnoreCase("Economy")||s.equalsIgnoreCase("Business"))) this.seatType = s; else this.seatType = "Economy"; } }
