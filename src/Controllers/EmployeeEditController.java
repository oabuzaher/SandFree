package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;


public class EmployeeEditController {

    private Scene EmployeeScreen;

    private Main main;

    public void setMain(Main main){
        this.main = main;
    }
    public void setEmployeeScreen(Scene EmployeeScreen){
        this.EmployeeScreen = EmployeeScreen;
    }

    @FXML
    public void cancel(){
        main.setScene(EmployeeScreen);
    }

}
