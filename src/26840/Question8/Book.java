package Question8;

class Book extends Section { protected String title; protected String author; protected String ISBN; public Book(int id, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN){ super(id, libraryName, location, phoneNumber, sectionName, sectionCode); this.title = title; this.author = author; setISBN(ISBN);} public void setISBN(String s){ if (s!=null && s.length()>=10) this.ISBN = s; else this.ISBN = "0000000000";} }
