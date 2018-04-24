package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class InventoryController1 {

    private Scene SelectionScreen;
    private Scene InventoryScreen2;
    private Scene InventoryScreen3;

    private Main main;

    public void setMain(Main main){
        this.main = main;
    }

    public void setSelectionScreen(Scene SelectionScreen){
        this.SelectionScreen = SelectionScreen;
    }

    public void setInventoryScreen2(Scene InventoryScreen2){
        this.InventoryScreen2 = InventoryScreen2;
    }

    public void setInventoryScreen3(Scene inventoryScreen3) {
        InventoryScreen3 = inventoryScreen3;
    }

    @FXML
    public void back(){
        main.setScene(SelectionScreen);
    }

    @FXML
    public void details(){
        main.setScene(InventoryScreen2);
    }

    @FXML
    public void reorder(){
        main.setScene(InventoryScreen3);
    }
}
