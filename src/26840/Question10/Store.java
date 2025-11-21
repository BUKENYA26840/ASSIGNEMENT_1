package Question10;

class Store extends Entity { protected String storeName; protected String address; protected String email; public Store(int id, String storeName, String address, String email){ super(id); this.storeName = storeName; this.address = address; setEmail(email);} public void setEmail(String e){ if (e!=null && e.matches("^.+@.+\\..+$")) this.email = e; else this.email = "unknown@domain.com";} }
