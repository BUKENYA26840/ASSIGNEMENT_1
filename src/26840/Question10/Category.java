package Question10;

class Category extends Store { protected String categoryName; protected String categoryCode; public Category(int id, String storeName, String address, String email, String categoryName, String categoryCode){ super(id, storeName, address, email); this.categoryName = categoryName; setCategoryCode(categoryCode);} public void setCategoryCode(String c){ if (c!=null && c.length()>=3) this.categoryCode = c; else this.categoryCode = "N/A";} }
