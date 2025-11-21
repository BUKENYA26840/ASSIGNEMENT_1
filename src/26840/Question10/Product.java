package Question10;

class Product extends Category { protected String productName; protected String productCode; protected double price; public Product(int id, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price){ super(id, storeName, address, email, categoryName, categoryCode); this.productName = productName; this.productCode = productCode; setPrice(price);} public void setPrice(double p){ this.price = Math.max(0.01, p);} }
