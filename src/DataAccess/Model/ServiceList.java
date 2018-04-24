package DataAccess.Model;

import java.math.BigDecimal;

public class ServiceList {

    private Integer serviceListID;
    private String name;
    private BigDecimal price;
    private String description;

    public ServiceList() {
    }

    public ServiceList(Integer serviceListID, String name, BigDecimal price, String description) {
        this.serviceListID = serviceListID;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public ServiceList(String name, BigDecimal price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Integer getServiceListID() {
        return serviceListID;
    }

    public void setServiceListID(Integer serviceListID) {
        this.serviceListID = serviceListID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
