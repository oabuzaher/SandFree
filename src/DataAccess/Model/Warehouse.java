package DataAccess.Model;

public class Warehouse {

    private Integer warehouseID;
    private String name;
    private String address;
    private String city;
    private String stateProvinceCode;
    private Integer postalCode;
    private Boolean isActive;

    public Warehouse() {
    }

    public Warehouse(Integer warehouseID, String name, String address, String city, String stateProvinceCode, Integer postalCode, Boolean isActive) {
        this.warehouseID = warehouseID;
        this.name = name;
        this.address = address;
        this.city = city;
        this.stateProvinceCode = stateProvinceCode;
        this.postalCode = postalCode;
        this.isActive = isActive;
    }

    public Warehouse(String name, String address, String city, String stateProvinceCode, Integer postalCode, Boolean isActive) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.stateProvinceCode = stateProvinceCode;
        this.postalCode = postalCode;
        this.isActive = isActive;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
