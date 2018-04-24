package DataAccess.Model;

public class Link_ServiceList_ItemList {

    private Integer serviceListID;
    private Integer itemListID;

    public Link_ServiceList_ItemList() {
    }

    public Link_ServiceList_ItemList(Integer serviceListID, Integer itemListID) {
        this.serviceListID = serviceListID;
        this.itemListID = itemListID;
    }

    public Integer getServiceListID() {
        return serviceListID;
    }

    public void setServiceListID(Integer serviceListID) {
        this.serviceListID = serviceListID;
    }

    public Integer getItemListID() {
        return itemListID;
    }

    public void setItemListID(Integer itemListID) {
        this.itemListID = itemListID;
    }
}
