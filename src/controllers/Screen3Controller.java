package controllers;


import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import application.MainApp;

public class Screen3Controller {

    @FXML
    private JFXButton goToMainBtn;

    @FXML
    private JFXButton goToScreen3Btn;

    @FXML
    void handelGoToMain(ActionEvent event) {
        MainApp.getScreenController().activate("home");
    }

    @FXML
    void handleGoToScreen2(ActionEvent event) {
        MainApp.getScreenController().activate("screen2");

    }

}