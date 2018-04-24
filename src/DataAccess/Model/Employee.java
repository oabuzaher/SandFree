package DataAccess.Model;

public class Employee {

    private Integer employeeID;
    private Integer departmentTypeID;
    private Boolean isAdmin;
    private String password;
    private String firstName;
    private String lastName;
    private String homePhone;
    private String email;
    private String address;
    private String city;
    private String stateProvinceCode;
    private Integer postalCode;
    private Boolean isEnabled;

    public Employee() {
    }

    public Employee(Integer employeeID, Integer departmentTypeID, Boolean isAdmin, String password, String firstName, String lastName, String homePhone, String email, String address, String city, String stateProvinceCode, Integer postalCode, Boolean isEnabled) {
        this.employeeID = employeeID;
        this.departmentTypeID = departmentTypeID;
        this.isAdmin = isAdmin;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.stateProvinceCode = stateProvinceCode;
        this.postalCode = postalCode;
        this.isEnabled = isEnabled;
    }

    public Employee(Boolean isAdmin, String password, String firstName, String lastName, String homePhone, String email, String address, String city, String stateProvinceCode, Integer postalCode, Boolean isEnabled) {
        this.isAdmin = isAdmin;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.stateProvinceCode = stateProvinceCode;
        this.postalCode = postalCode;
        this.isEnabled = isEnabled;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Integer getDepartmentTypeID() {
        return departmentTypeID;
    }

    public void setDepartmentTypeID(Integer departmentTypeID) {
        this.departmentTypeID = departmentTypeID;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
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

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }
}
