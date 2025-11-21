package Question10;

class Customer extends Product { protected String customerName; protected String contactNumber; protected String addressCust; public Customer(int id, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String addressCust){ super(id, storeName, address, email, categoryName, categoryCode, productName, productCode, price); this.customerName = customerName; this.contactNumber = contactNumber; this.addressCust = addressCust; } }
