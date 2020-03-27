package controllers;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

public class ScreenController {
    private HashMap<String,Pane> screenMap = new HashMap<String, Pane>();
    private Scene main;

    public ScreenController(Scene main){
        this.main = main;
    }

    public void addScreen(String name, Pane screen){
        this.screenMap.put(name,screen);
    }

    public void removeScreen(String name){
        this.screenMap.remove(name);
    }
    public void activate(String name){
        this.main.setRoot(this.screenMap.get(name));
    }

    public HashMap<String, Pane> getScreenMap() {
        return screenMap;
    }
}
