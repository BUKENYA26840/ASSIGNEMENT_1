package Question8;

class Section extends Library { protected String sectionName; protected String sectionCode; public Section(int id, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode){ super(id, libraryName, location, phoneNumber); this.sectionName = sectionName; setSectionCode(sectionCode);} public void setSectionCode(String c){ if (c!=null && c.length()>=3) this.sectionCode = c; else this.sectionCode = "N/A";} }
