package DataAccess.Model;

import java.math.BigDecimal;

public class Item {

    private Integer itemID;
    private Integer itemListID;
    private Integer serviceID;
    private Integer warehouseID;
    private String name;
    private Integer quantity;
    private BigDecimal price;
    private String description;

    public Item() {
    }

    public Item(Integer itemID, Integer itemListID, Integer serviceID, Integer warehouseID, String name, Integer quantity, BigDecimal price, String description) {
        this.itemID = itemID;
        this.itemListID = itemListID;
        this.serviceID = serviceID;
        this.warehouseID = warehouseID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public Item(String name, Integer quantity, BigDecimal price, String description) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Integer getItemListID() {
        return itemListID;
    }

    public void setItemListID(Integer itemListID) {
        this.itemListID = itemListID;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
