package DataAccess.Model;

public class Link_Job_Employee {

    private Integer jobID;
    private Integer employeeID;

    public Link_Job_Employee() {
    }

    public Link_Job_Employee(Integer jobID, Integer employeeID) {
        this.jobID = jobID;
        this.employeeID = employeeID;
    }

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }
}
