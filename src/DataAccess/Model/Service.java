package DataAccess.Model;

public class Service {

    private Integer serviceID;
    private Integer jobID;
    private String description;
    private String name;

    public Service() {
    }

    public Service(Integer serviceID, Integer jobID, String description, String name) {
        this.serviceID = serviceID;
        this.jobID = jobID;
        this.description = description;
        this.name = name;
    }

    public Service(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
