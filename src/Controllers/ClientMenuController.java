package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class ClientMenuController {
    private Scene LoginScreen;
    private Scene SelectionScreen;
    private Scene ClientScreen2;

    private Main main;


    public void setMain(Main main){
        this.main = main;
    }
    public void setSelectionScreen(Scene SelectionScreen){
        this.SelectionScreen = SelectionScreen;
    }
    public void setLoginScreen(Scene LoginScreen){
        this.LoginScreen = LoginScreen;
    }
    public void setClientScreen2(Scene ClientScreen2){
        this.ClientScreen2 = ClientScreen2;
    }


    @FXML
    public void evclient(){
        main.setScene(ClientScreen2);
    }
    @FXML
    public void mainMenuClicked(){
        main.setScene(SelectionScreen);
    }
    @FXML
    public void logOut(){
        main.setScene(LoginScreen);
    }
}