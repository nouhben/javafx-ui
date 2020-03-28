package application;

import controllers.ScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    private static Stage primaryStage;
    private static ScreenController screenController;
    @Override
    public void start(Stage primaryStage) throws Exception{
        MainApp.primaryStage = primaryStage;
        try{
            Scene main = new Scene(FXMLLoader.load(this.getClass().getResource("../screens/home_large.fxml")));
            setScreenController(main);
            primaryStage.setScene(main);

            primaryStage.setResizable(false);
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void setScreenController(Scene main){
        screenController = new ScreenController(main);
        try{
            screenController.addScreen("home",FXMLLoader.load(this.getClass().getResource("../screens/home_large.fxml")));
            screenController.addScreen("screen2",FXMLLoader.load(this.getClass().getResource("../screens/screen2.fxml")));
            screenController.addScreen("screen3",FXMLLoader.load(this.getClass().getResource("../screens/screen3.fxml")));
            //screenController.addScreen("ui1",FXMLLoader.load(this.getClass().getResource("../screens/home_large.fxml")));
            //screenController.addScreen("ui2",FXMLLoader.load(this.getClass().getResource("../screens/home_mobile.fxml")));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static ScreenController getScreenController() {
        return screenController;
    }
}
