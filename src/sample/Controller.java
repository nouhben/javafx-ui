package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private JFXComboBox<?> marqueID;

    @FXML
    private JFXComboBox<?> color1ID;

    @FXML
    private JFXButton confirmBtn;

    @FXML
    private Label color1Err;

    @FXML
    private JFXComboBox<?> modelID;

    @FXML
    private Label portsErr;

    @FXML
    private Label modelErr;

    @FXML
    private Label marqueErr;

    @FXML
    private JFXComboBox<?> portesID;

    @FXML
    private Label portErr;

    @FXML
    private Label yearErr;

    @FXML
    private JFXComboBox<?> kmID;

    @FXML
    private Label kmErr;

    @FXML
    private Label conductTypeErr;

    @FXML
    private Label anneeErr1;

    @FXML
    private JFXComboBox<?> fuelTypeID;

    @FXML
    private Label fuelTypeErr;

    @FXML
    private ToggleGroup typeConduct;

    @FXML
    private JFXComboBox<?> color2ID;

    @FXML
    private ToggleGroup ports1;

    @FXML
    private JFXComboBox<?> yearID;

    @FXML
    private Label color2Err;

    @FXML
    private Label transmissionErr;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    void confirm(ActionEvent event) {

    }

}
