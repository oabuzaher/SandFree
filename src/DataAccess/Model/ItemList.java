package DataAccess.Model;

import java.math.BigDecimal;

public class ItemList {

    private Integer itemListID;
    private String name;
    private BigDecimal price;
    private String description;

    public ItemList() {
    }

    public ItemList(Integer itemListID, String name, BigDecimal price, String description) {
        this.itemListID = itemListID;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public ItemList(String name, BigDecimal price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Integer getItemListID() {
        return itemListID;
    }

    public void setItemListID(Integer itemListID) {
        this.itemListID = itemListID;
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
