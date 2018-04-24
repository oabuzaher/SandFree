package DataAccess.Model;

public class Inventory {

    private Integer warehouseID;
    private Integer itemListID;
    private Integer quantity;
    private String units;

    public Inventory() {
    }

    public Inventory(Integer warehouseID, Integer itemListID, Integer quantity, String units) {
        this.warehouseID = warehouseID;
        this.itemListID = itemListID;
        this.quantity = quantity;
        this.units = units;
    }

    public Inventory(Integer quantity, String units) {
        this.quantity = quantity;
        this.units = units;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }

    public Integer getItemListID() {
        return itemListID;
    }

    public void setItemListID(Integer itemListID) {
        this.itemListID = itemListID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
