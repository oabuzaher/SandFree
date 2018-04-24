package DataAccess.Model;

import java.util.Date;

public class EmployeeIncident {

    private Integer employeeIncidentID;
    private Integer employeeID;
    private Date date;
    private String description;

    public EmployeeIncident() {
    }

    public EmployeeIncident(Integer employeeIncidentID, Integer employeeID, Date date, String description) {
        this.employeeIncidentID = employeeIncidentID;
        this.employeeID = employeeID;
        this.date = date;
        this.description = description;
    }

    public EmployeeIncident(Date date, String description) {
        this.date = date;
        this.description = description;
    }

    public Integer getEmployeeIncidentID() {
        return employeeIncidentID;
    }

    public void setEmployeeIncidentID(Integer employeeIncidentID) {
        this.employeeIncidentID = employeeIncidentID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
