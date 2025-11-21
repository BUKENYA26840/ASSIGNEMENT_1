package Question7;

class Seller extends Property { protected String sellerName; protected String contactNumber; public Seller(int id, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber){ super(id, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price); this.sellerName = sellerName; this.contactNumber = contactNumber;} }
