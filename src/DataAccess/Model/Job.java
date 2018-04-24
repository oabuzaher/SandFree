package DataAccess.Model;

import java.util.Date;

public class Job {
    private Integer jobID;
    private Integer clientID;
    private Date creationDate;
    private Date completionDate;
    private Integer laborHours;
    private Boolean complete;
    private String description;

    public Job() {
    }

    public Job(Integer jobID, Integer clientID, Date creationDate, Date completionDate, Integer laborHours, Boolean complete, String description) {
        this.jobID = jobID;
        this.clientID = clientID;
        this.creationDate = creationDate;
        this.completionDate = completionDate;
        this.laborHours = laborHours;
        this.complete = complete;
        this.description = description;
    }

    public Job(Date creationDate, Date completionDate, Integer laborHours, Boolean complete, String description) {
        this.creationDate = creationDate;
        this.completionDate = completionDate;
        this.laborHours = laborHours;
        this.complete = complete;
        this.description = description;
    }

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Integer getLaborHours() {
        return laborHours;
    }

    public void setLaborHours(Integer laborHours) {
        this.laborHours = laborHours;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

