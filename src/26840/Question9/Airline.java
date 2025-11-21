package Question9;

class Airline extends Entity { protected String airlineName; protected String address; protected String contactEmail; public Airline(int id, String airlineName, String address, String contactEmail){ super(id); this.airlineName = airlineName; this.address = address; setContactEmail(contactEmail);} public void setContactEmail(String e){ if (e!=null && e.matches("^.+@.+\\..+$")) this.contactEmail = e; else this.contactEmail = "unknown@domain.com";} }
