package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Demo extends Application {
    @Override
    public void start(Stage stage){
        DescriptionPane descriptionPane = new DescriptionPane();

        descriptionPane.setTitel("Canada");
        String description ="The Canadian national flag....";

        Scene scene = new Scene(descriptionPane,500,500);
        stage.setScene(scene);
        stage.setTitle("TextAreaDemo");
        stage.show();
            }
}
