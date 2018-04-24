package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;


public class EmployeeMenuController {
    private Scene EmployeeMenu;
    private Scene EmployeeAdd;
    private Scene EmployeeEdit;

    private Main main;

    public void setMain(Main main){
        this.main = main;
    }

    public void setEmployeeMenu(Scene EmployeeMenu){
        this.EmployeeMenu = EmployeeMenu;
    }

    public void setEmployeeAdd(Scene EmployeeAdd){
        this.EmployeeAdd = EmployeeAdd;
    }
    public void setEmployeeEdit(Scene EmployeeEdit){
        this.EmployeeEdit = EmployeeEdit;
    }

    @FXML
    public void back(){
        main.setScene(EmployeeMenu);
    }

    @FXML
    public void addEmployee(){

        main.setScene(EmployeeAdd);
    }

    @FXML
    public void evemployee(){
        main.setScene(EmployeeEdit);
    }
}
