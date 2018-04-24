package Controllers;

import javafx.scene.layout.*;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //Primary Stage
    Stage window;

    Scene LoginScreen, SelectionScreen, ClientScreen, JobScreen, ClientScreen2, ClientScreen3, JobScreen2,
            EmployeeScreen, EmployeeScreen2,InventoryScreen,InventoryScreen2, InventoryScreen3;

    private Pane pane1;
    private Pane pane2;
    private Pane pane3;
    private Pane pane4;
    private Pane pane5;
    private Pane pane6;
    private Pane pane7;
    private Pane pane8;
    private Pane pane9;
    private Pane pane10;
    private Pane pane11;
    private Pane pane12;
    private Pane pane13;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            //Set Window as primary stage
            window = primaryStage;

            // load fxml files and their controllers
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("LoginScreen.fxml"));
            pane1 = loader.load();
            LoginScreenController controller1 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("SelectionScreen.fxml"));
            pane2 = loader.load();
            SelectionScreenController controller2 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("ClientMenu.fxml"));
            pane3 = loader.load();
            ClientMenuController controller3 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("JobsMenuScreen.fxml"));
            pane4 = loader.load();
            JobController1 controller4 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("ClientMenuScreen2.fxml"));
            pane5 = loader.load();
            ClientController2 controller5 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("ClientMenuScreen3.fxml"));
            pane6 = loader.load();
            ClientController3 controller6 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("JobsMenuScreen2.fxml"));
            pane7 = loader.load();
            JobController2 controller7 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("EmployeeMenu.fxml"));
            pane8 = loader.load();
            EmployeeMenuController controller8 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("EmployeeAdd.fxml"));
            pane9 = loader.load();
            EmployeeAddController controller9 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("EmployeeEdit.fxml"));
            pane10 = loader.load();
            EmployeeEditController controller10 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("InventoryMenu.fxml"));
            pane11 = loader.load();
            InventoryController1 controller11 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("InventoryDetails.fxml"));
            pane12 = loader.load();
            InventoryController2 controller12 = loader.getController();

            loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("InventoryReorder.fxml"));
            pane13 = loader.load();
            InventoryController3 controller13 = loader.getController();



            //scenes based on what is loaded form fxml files
            Scene LoginScreen = new Scene(pane1);
            Scene SelectionScreen = new Scene(pane2);
            Scene ClientScreen = new Scene(pane3);
            Scene JobScreen = new Scene(pane4);
            Scene ClientScreen2 = new Scene(pane5);
            Scene ClientScreen3 = new Scene (pane6);
            Scene JobScreen2 = new Scene (pane7);
            Scene EmployeeScreen = new Scene(pane8);
            Scene EmployeeScreen2 = new Scene(pane9);
            Scene EmployeeScreen3 = new Scene(pane10);
            Scene InventoryScreen = new Scene(pane11);
            Scene InventoryScreen2 = new Scene(pane12);
            Scene InventoryScreen3 = new Scene (pane13);


            //Pass reference the each scenes controller
            controller1.setSelectionScreen(SelectionScreen);
            controller1.setMain(this);
            controller2.setLoginScreen(LoginScreen);
            controller2.setMain(this);

            controller3.setSelectionScreen(SelectionScreen);
            controller3.setMain(this);
            controller2.setClientScreen(ClientScreen);
            controller2.setMain(this);
            controller3.setLoginScreen(LoginScreen);
            controller3.setMain(this);
            controller1.setClientScreen(ClientScreen);
            controller1.setMain(this);

            controller4.setSelectionScreen(SelectionScreen);
            controller4.setMain(this);
            controller2.setJobScreen(JobScreen);
            controller2.setMain(this);
            controller4.setLoginScreen(LoginScreen);
            controller4.setMain(this);
            controller1.setJobScreen(JobScreen);
            controller1.setMain(this);

            controller5.setClientScreen(ClientScreen);
            controller5.setMain(this);
            controller3.setClientScreen2(ClientScreen2);
            controller3.setMain(this);

            controller6.setClientScreen2(ClientScreen2);
            controller6.setMain(this);
            controller5.setClientScreen3(ClientScreen3);
            controller5.setMain(this);
            controller6.setLoginScreen(LoginScreen);
            controller6.setMain(this);
            controller1.setClientScreen3(ClientScreen3);
            controller1.setMain(this);

            controller7.setJobScreen(JobScreen);
            controller7.setMain(this);
            controller4.setJobScreen2(JobScreen2);
            controller4.setMain(this);

            controller8.setEmployeeMenu(SelectionScreen);
            controller8.setMain(this);
            controller2.setEmployeeScreen(EmployeeScreen);
            controller2.setMain(this);

            controller9.setEmployeeScreen(EmployeeScreen);
            controller9.setMain(this);
            controller8.setEmployeeAdd(EmployeeScreen2);
            controller8.setMain(this);

            controller10.setEmployeeScreen(EmployeeScreen);
            controller10.setMain(this);
            controller8.setEmployeeEdit(EmployeeScreen3);
            controller8.setMain(this);

            controller11.setSelectionScreen(SelectionScreen);
            controller11.setMain(this);
            controller2.setInventoryScreen(InventoryScreen);
            controller2.setMain(this);

            controller12.setInventoryScreen(InventoryScreen);
            controller12.setMain(this);
            controller11.setInventoryScreen2(InventoryScreen2);
            controller11.setMain(this);

            controller13.setInventoryScreen(InventoryScreen);
            controller13.setMain(this);
            controller11.setInventoryScreen3(InventoryScreen3);
            controller11.setMain(this);










            window.setScene(LoginScreen);
            window.setTitle("SandFree");
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setScene(Scene scene) {
        window.setScene(scene);
    }}


