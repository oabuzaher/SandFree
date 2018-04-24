package Controllers;

import javafx.fxml.FXML;
import javafx.scene.Scene;

public class JobController2 {
    private Scene JobScreen;
    private Main main;

    public void setMain(Main main){
        this.main = main;
    }
    public void setJobScreen(Scene JobScreen){
        this.JobScreen = JobScreen;
    }

    @FXML
    public void back(){
        main.setScene(JobScreen);
    }
}