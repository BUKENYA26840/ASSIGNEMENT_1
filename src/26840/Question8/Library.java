package Question8;

class Library extends Entity { protected String libraryName; protected String location; protected String phoneNumber; public Library(int id, String libraryName, String location, String phoneNumber){ super(id); this.libraryName = libraryName; this.location = location; setPhoneNumber(phoneNumber);} public void setPhoneNumber(String p){ if (p!=null && p.matches("\\d{10}")) this.phoneNumber = p; else this.phoneNumber = "0000000000";} }
