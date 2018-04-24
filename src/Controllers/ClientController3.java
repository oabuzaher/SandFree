package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class ClientController3 {
    private Scene LoginScreen;
    private Scene ClientScreen2;
    private Main main;


    public void setMain(Main main) {
        this.main = main;
    }
    public void setLoginScreen(Scene LoginScreen){
        this.LoginScreen = LoginScreen;
    }

    public void setClientScreen2(Scene ClientScreen2) {
        this.ClientScreen2 = ClientScreen2;

    }
    @FXML
    public void back(){
        main.setScene(ClientScreen2);
    }
    @FXML
    public void logOut(){
        main.setScene(LoginScreen);
    }
}