package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import application.MainApp;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Person;

import java.net.URL;
import java.util.ResourceBundle;

public class Screen2Controller implements Initializable {

    @FXML
    private JFXButton goToMainBtn;

    @FXML
    private JFXButton goToScreen3Btn;
    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person, String> nameTC;

    @FXML
    private TableColumn<Person, String> phoneTC;

    @FXML
    private TableColumn<Person, String> mailTC;

    @FXML
    private TableColumn<Person, Integer> salaryTC;

    @FXML
    private JFXButton deleteBtn;

    @FXML
    private JFXButton addBtn;

    @FXML
    private JFXButton updateBtn;

    @FXML
    private JFXTextField searchTxt;

    @FXML
    private JFXButton searchBtn;

    @FXML
    private JFXTextField nameTxt;

    @FXML
    private JFXTextField phoneTxt;

    @FXML
    private JFXTextField emailTxt;

    @FXML
    void handelGoToMain(ActionEvent event) {
        MainApp.getScreenController().activate("home");
    }

    @FXML
    void handleGoToScreen3(ActionEvent event) {
        MainApp.getScreenController().activate("screen3");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameTC.setCellValueFactory(new PropertyValueFactory<Person,String>("Name"));
        mailTC.setCellValueFactory(new PropertyValueFactory<Person,String>("Email"));
        phoneTC.setCellValueFactory(new PropertyValueFactory<Person,String>("Phone"));
        salaryTC.setCellValueFactory(new PropertyValueFactory<Person,Integer>("Salary"));
        personTable.getItems().addAll(
                _loadRandomData(10)
        );

    }

    private ObservableList<Person> _loadRandomData(int numberOfRecords){
        ObservableList<Person> people = FXCollections.observableArrayList();
        for (int i = 0; i <numberOfRecords ; i++) {
            people.add(new Person("person"+i,"123-456-9"+i,"email@person"+i+".com",(int)((Math.random())*50000+i)));
        }
        return people;
    }
}