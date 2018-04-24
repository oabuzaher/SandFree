package DataAccess.Model;

public class DepartmentType {
    private Integer departmentTypeID;
    private String type;

    public DepartmentType() {
    }

    public DepartmentType(Integer departmentTypeID, String type) {
        this.departmentTypeID = departmentTypeID;
        this.type = type;
    }

    public DepartmentType(String type) {
        this.type = type;
    }

    public Integer getDepartmentTypeID() {
        return departmentTypeID;
    }

    public void setDepartmentTypeID(Integer departmentTypeID) {
        this.departmentTypeID = departmentTypeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
