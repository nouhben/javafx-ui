package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.beans.binding.Binding;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

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

    private Image firstImg;
    private Image secondImg;

    private static HashMap<String, Image> images;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        _loadImages();
        this.imgViewFirst.setImage(firstImg);
        this.imgViewSecond.setImage(secondImg);

        nextBtn.setOnAction(event -> {
            int img1 = Integer.parseInt(Character.toString(this.imgViewFirst.getImage().getUrl().charAt(this.imgViewFirst.getImage().getUrl().length() - 5)));
            int img2 = Integer.parseInt(Character.toString(this.imgViewSecond.getImage().getUrl().charAt(this.imgViewSecond.getImage().getUrl().length() - 5)));
            System.out.println(img1+" --- "+img2);

           img1++;
           img2++;
           if (img1 > 6)
               img1 = 1;
           if (img2>6)
               img2 = 1;
            System.out.println(img1+" --- "+img2);

            _playNextImage("plate"+img1+".png","plate"+img2+".png");

        });
    }

    private void _loadImages(){
        images = new HashMap<>();
        File f;
        try{
            f = new File("/Users/OpenMindes/Dev/javafx/AmiraUI1/resources/images/plate1.png");
            images.put("plate1",new Image(f.toURI().toString()));

            f = new File("/Users/OpenMindes/Dev/javafx/AmiraUI1/resources/images/plate2.png");
            images.put("plate2",new Image(f.toURI().toString()));

            f = new File("/Users/OpenMindes/Dev/javafx/AmiraUI1/resources/images/plate3.png");
            images.put("plate3",new Image(f.toURI().toString()));

            f = new File("/Users/OpenMindes/Dev/javafx/AmiraUI1/resources/images/plate4.png");
            images.put("plate4",new Image(f.toURI().toString()));

            f = new File("/Users/OpenMindes/Dev/javafx/AmiraUI1/resources/images/plate5.png");
            images.put("plate5",new Image(f.toURI().toString()));

            f = new File("/Users/OpenMindes/Dev/javafx/AmiraUI1/resources/images/plate5.png");
            images.put("plate6",new Image(f.toURI().toString()));

            //init
            firstImg = images.get("plate1");
            secondImg = images.get("plate2");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void _playNextImage(String img1,String img2){
        firstImg = images.get(img1);
        secondImg = images.get(img2);
    }
}