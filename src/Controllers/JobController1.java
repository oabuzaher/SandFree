package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class JobController1 {
    private Scene SelectionScreen;
    private Scene LoginScreen;
    private Scene JobScreen2;

    private Main main;

    public void setMain(Main main){
        this.main = main;
    }

    public void setSelectionScreen(Scene SelectionScreen){
        this.SelectionScreen = SelectionScreen;
    }
    public  void setLoginScreen(Scene LoginScreen){
        this.LoginScreen = LoginScreen;
    }
    public void setJobScreen2(Scene JobScreen2){
        this.JobScreen2 = JobScreen2;
    }

    @FXML
    public void mainMenuClicked(){
        main.setScene(SelectionScreen);
    }
    @FXML
    public void logOut(){
        main.setScene(LoginScreen);
    }

    @FXML
    public void evjobs(){
        main.setScene(JobScreen2);
    }

}
