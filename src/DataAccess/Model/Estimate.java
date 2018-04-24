package DataAccess.Model;

import java.math.BigDecimal;
import java.util.Date;

public class Estimate {

    private Integer estimateID;
    private Integer jobID;
    private BigDecimal price;
    private Boolean approved;
    private Integer hoursRequired;
    private Date date;
    private String preparedBy;
    private String description;
    private Date validUntil;

    public Estimate() {
    }

    public Estimate(Integer estimateID, Integer jobID, BigDecimal price, Boolean approved, Integer hoursRequired, Date date, String preparedBy, String description, Date validUntil) {
        this.estimateID = estimateID;
        this.jobID = jobID;
        this.price = price;
        this.approved = approved;
        this.hoursRequired = hoursRequired;
        this.date = date;
        this.preparedBy = preparedBy;
        this.description = description;
        this.validUntil = validUntil;
    }

    public Estimate(BigDecimal price, Boolean approved, Integer hoursRequired, Date date, String preparedBy, String description, Date validUntil) {
        this.price = price;
        this.approved = approved;
        this.hoursRequired = hoursRequired;
        this.date = date;
        this.preparedBy = preparedBy;
        this.description = description;
        this.validUntil = validUntil;
    }

    public Integer getEstimateID() {
        return estimateID;
    }

    public void setEstimateID(Integer estimateID) {
        this.estimateID = estimateID;
    }

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Integer getHoursRequired() {
        return hoursRequired;
    }

    public void setHoursRequired(Integer hoursRequired) {
        this.hoursRequired = hoursRequired;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }
}
