package Question9;

class Flight extends Airline { protected String flightNumber; protected String destination; protected String departureTime; public Flight(int id, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime){ super(id, airlineName, address, contactEmail); this.flightNumber = flightNumber; this.destination = destination; this.departureTime = (departureTime!=null)?departureTime:"";} }
