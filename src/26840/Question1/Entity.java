package Question1;

class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) {
            System.out.println("Warning: ID must be greater than 0");
        }
        if (createdDate == null || createdDate.isEmpty() || updatedDate == null || updatedDate.isEmpty()) {
            System.out.println("Warning: Dates cannot be null or empty");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}