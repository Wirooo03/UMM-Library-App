package Main;

import data.LoginMenu;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        LoginMenu loginMenuObj = new LoginMenu();

        loginMenuObj.menuGUI();
    }

}