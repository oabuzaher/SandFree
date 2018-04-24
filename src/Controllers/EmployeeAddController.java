package Controllers;

import DataAccess.ConnectionFactory;
import DataAccess.Model.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeAddController {
    private Scene EmployeeScreen;
    private Main main;


    // Setters

    public void setMain(Main main){
        this.main = main;
    }

    public void setEmployeeScreen(Scene EmployeeScreen){
        this.EmployeeScreen = EmployeeScreen;
    }


    // Add states to ComboBox

    private ObservableList<String> stateProvinceCodeList = FXCollections.observableArrayList("AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY");
    private ObservableList<String> departmentList = FXCollections.observableArrayList("Owner", "Manager", "Supervisor", "Worker");

    // Personal Information

    @FXML
    private TextField lastName;
    @FXML
    private TextField firstName;
    @FXML
    private TextField homePhone;
    @FXML
    private TextField address;
    @FXML
    private TextField city;
    @FXML
    private ComboBox<String> stateProvinceCodeBox;
    @FXML
    private TextField postalCode;
    @FXML
    private ComboBox<String> departmentBox;


    // Login Information

    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private CheckBox isAdmin;


    // Initialize Choice Boxes

    @FXML
    private void initialize(){
        stateProvinceCodeBox.setItems(stateProvinceCodeList);
        departmentBox.setItems(departmentList);
    }


    // Cancel Button

    @FXML
    public void cancel(){
        main.setScene(EmployeeScreen);
    }


    // Save Button

    @FXML
    public void save(ActionEvent e){
        Employee employee = new Employee();
        employee.setFirstName(firstName.getText());
        employee.setLastName(lastName.getText());
        employee.setHomePhone(homePhone.getText());
        employee.setAddress(address.getText());
        employee.setCity(city.getText());
        employee.setStateProvinceCode(String.valueOf(stateProvinceCodeBox.getValue()));
        employee.setPostalCode(Integer.parseInt(postalCode.getText()));
        employee.setDepartmentTypeID(String.valueOf(departmentBox.getValue()));
        employee.setEmail(email.getText());
        employee.setPassword(password.getText());
        employee.setAdmin(isAdmin.isSelected());

        ConnectionFactory cf = new ConnectionFactory();
        Connection conn = cf.getConnection();
        try{
            String SPsql = "EXEC sp_Employee_Create ?,?,?,?,?,?,?,?,?,?,?,?";
            PreparedStatement ps = conn.prepareStatement(SPsql);
            ps.setEscapeProcessing(true);
            ps.setQueryTimeout(30);
            ps.setString(1, employee.getDepartmentTypeID());
            ps.setBoolean(2, employee.getAdmin());
            ps.setString(3, employee.getPassword());
            ps.setString(4, employee.getFirstName());
            ps.setString(5, employee.getLastName());
            ps.setString(6, employee.getHomePhone());
            ps.setString(7, employee.getEmail());
            ps.setString(8, employee.getAddress());
            ps.setString(9, employee.getCity());
            ps.setString(10, employee.getStateProvinceCode());
            ps.setInt(11, employee.getPostalCode());
            ps.setBoolean(12, true);
            ResultSet rs = ps.executeQuery();
            main.setScene(EmployeeScreen);
        }
        catch (Exception ex){
            throw new RuntimeException("Error", ex);
        }
        finally {
            try {
                if (conn != null) { conn.close(); }
            } catch (SQLException sqlExc) {
                System.out.println(sqlExc.getMessage());
            }
        }
    }
}
