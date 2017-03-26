package landmarketmavenproto.model;

import org.springframework.data.annotation.Id;


public class Land {
    @Id
    private String id;

    private String area;
    private String assignment;

    public Land() {
    }

    public Land(String area, String assignment) {
        this.area = area;
        this.assignment = assignment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }
}
