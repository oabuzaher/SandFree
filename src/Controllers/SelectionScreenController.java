package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class SelectionScreenController {

    private Scene LoginScreen;
    private Scene ClientScreen;
    private Scene JobScreen;
    private Scene EmployeeScreen;
    private Scene InventoryScreen;
    private Main main;


    public void setMain(Main main){
        this.main = main;
    }
    public void setLoginScreen(Scene LoginScreen){
        this.LoginScreen = LoginScreen;
    }
    public void setClientScreen(Scene ClientScreen){
        this.ClientScreen = ClientScreen;
    }
    public void setJobScreen(Scene JobScreen){
        this.JobScreen = JobScreen;
    }
    public void setEmployeeScreen(Scene EmployeeScreen){
        this.EmployeeScreen = EmployeeScreen;
    }
    public void setInventoryScreen(Scene InventoryScreen){
        this.InventoryScreen = InventoryScreen;
    }




    @FXML
    public void logOut(){
        main.setScene(LoginScreen);
    }
    @FXML
    public void clickClient(){
        main.setScene(ClientScreen);
    }
    @FXML
    public void clickJob(){
        main.setScene(JobScreen);
    }
    @FXML
    public void clickEmployee(){
        main.setScene(EmployeeScreen);
    }
    @FXML
    public void clickInventory(){
        main.setScene(InventoryScreen);
    }

}

