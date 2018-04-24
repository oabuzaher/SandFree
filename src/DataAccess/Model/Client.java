package DataAccess.Model;

public class Client {

    private Integer clientID;
    private String clientType;
    private String homePhone;
    private String workPhone;
    private String email;
    private String address;
    private String city;
    private String stateProvinceCode;
    private Integer postalCode;
    private String firstName;
    private String lastName;

    public Client() {
    }

    public Client(Integer clientID, String clientType, String homePhone, String workPhone, String email, String address, String city, String stateProvinceCode, Integer postalCode, String firstName, String lastName) {
        this.clientID = clientID;
        this.clientType = clientType;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.stateProvinceCode = stateProvinceCode;
        this.postalCode = postalCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Client(String clientType, String homePhone, String workPhone, String email, String address, String city, String stateProvinceCode, Integer postalCode, String firstName, String lastName) {
        this.clientType = clientType;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.stateProvinceCode = stateProvinceCode;
        this.postalCode = postalCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
