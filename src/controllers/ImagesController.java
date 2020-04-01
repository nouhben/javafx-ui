package controllers;

import javafx.beans.property.SimpleStringProperty;

public class ImagesController {
    private String _currentImagePath = " ";
    private SimpleStringProperty currentImagePath;

    public final String getCurrentImagePath() {
        if(currentImagePath == null)
            return _currentImagePath;
        return currentImagePath.get();
    }

    public final SimpleStringProperty currentImagePathProperty() {
        if (currentImagePath == null){
            this.currentImagePath = new SimpleStringProperty(this,"currentImagePath",_currentImagePath);
        }
        return currentImagePath;

    }

    public final void setCurrentImagePath(String value) {
       if (currentImagePath == null) {
           _currentImagePath = value ;
       }else {
           currentImagePath.set(value);
       }
    }
}
