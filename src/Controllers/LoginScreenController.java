package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class LoginScreenController {
    private Scene SelectionScreen;
    private Scene ClientScreen;
    private Scene JobScreen;
    private Scene ClientScreen3;
    private Main main;

    public void setMain(Main main){
        this.main = main;
    }

    public void setSelectionScreen(Scene SelectionScreen){
        this.SelectionScreen = SelectionScreen;
    }
    public void setClientScreen(Scene ClientScreen){
        this.ClientScreen = ClientScreen;
    }
    public void setJobScreen(Scene JobScreen){
        this.JobScreen = JobScreen;
    }
    public void setClientScreen3(Scene ClientScreen3){
        this.ClientScreen3 = ClientScreen3;
    }

    @FXML
    public void loginButtonClicked(){
        main.setScene(SelectionScreen);
    }
}
