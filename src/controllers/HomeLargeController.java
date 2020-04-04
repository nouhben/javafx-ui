package controllers;
import com.jfoenix.controls.JFXButton;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.net.URL;
import java.util.*;

public class HomeLargeController implements Initializable {

    @FXML
    private Pane yellowPane;

    @FXML
    private ImageView imgViewSecond;

    @FXML
    private ImageView imgViewFirst;

    @FXML
    private Label logoLbl;

    @FXML
    private Pane blackPane;

    @FXML
    private Label desLbl;

    @FXML
    private Label imgNumberLbl;

    @FXML
    private Pane imgIndicatorPane;

    @FXML
    private Pane imgIndicatorNumerPane;

    @FXML
    private JFXButton lastBtn;

    @FXML
    private JFXButton nextBtn;

    @FXML
    private JFXButton homeBtn;

    @FXML
    private JFXButton recipeBtn;

    @FXML
    private JFXButton aboutBtn;

    @FXML
    private JFXButton contactBtn;


    private IntegerProperty imgNameProperty = new SimpleIntegerProperty(0);
    private List<Image> images  = Arrays.asList(
            _loadImage("plate1.png"),
            _loadImage("plate2.png"),
            _loadImage("plate3.png"),
            _loadImage("plate4.png"),
            _loadImage("plate5.png"),
            _loadImage("plate6.png")

            );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //_loadImage();
        nextBtn.setOnAction(event -> {
            //generate a random number
            Random random = new Random();
            int x = random.nextInt(7);
           // imgNameProperty.setValue(x);
            //change the name of the image
            //this.imgNameProperty.setValue("plate"+x+".png");
            System.out.println(images.get(x).getUrl());

        });
        //bind the image view with the image name
    imgViewFirst.imageProperty().bind(
            Bindings.createObjectBinding(
                    ()->
                        images.get(
                                imgNameProperty.getValue()
                        )

            )
    );
    }

    private Image _loadImage(String name){
        try {
            File f;
            f = new File("/Users/OpenMindes/Dev/javafx/AmiraUI1/resources/images/"+name);
            return new Image(f.toURI().toString());

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
