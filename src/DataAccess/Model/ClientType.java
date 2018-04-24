package DataAccess.Model;

public class ClientType {

    private Integer clientTypeID;
    private String type;

    public ClientType() {
    }

    public ClientType(Integer clientTypeID, String type) {
        this.clientTypeID = clientTypeID;
        this.type = type;
    }

    public ClientType(String type) {
        this.type = type;
    }

    public Integer getClientTypeID() {
        return clientTypeID;
    }

    public void setClientTypeID(Integer clientTypeID) {
        this.clientTypeID = clientTypeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
