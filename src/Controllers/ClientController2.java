package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class ClientController2 {
    private Scene ClientScreen;
    private Scene ClientScreen3;
    private Main main;


    public void setMain(Main main) {
        this.main = main;
    }
    public void setClientScreen(Scene ClientScreen){
        this.ClientScreen = ClientScreen;
    }
    public void setClientScreen3(Scene ClientScreen3){
        this.ClientScreen3 = ClientScreen3;
    }
    @FXML
    public void back(){
        main.setScene(ClientScreen);
    }
    @FXML
    public void viewjobs(){
        main.setScene(ClientScreen3);
    }
}
