package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class InventoryController2 {
    private Scene InventoryScreen;

    private Main main;

    public void setMain(Main main){
        this.main = main;
    }

    public void setInventoryScreen(Scene InventoryScreen){
        this.InventoryScreen = InventoryScreen;
    }

    @FXML
    public void back(){
        main.setScene(InventoryScreen);
    }
}

