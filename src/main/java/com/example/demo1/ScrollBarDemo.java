package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScrollBarDemo extends Application {
    @Override
    public void start(Stage stage){
        Text text = new Text(20,20,"JavaFX Programming");

        ScrollBar sbHorizontal = new ScrollBar();
        ScrollBar sbVertical = new ScrollBar();
        sbVertical.setOrientation(Orientation.VERTICAL);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);

        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(sbHorizontal);
        pane.setRight(sbVertical);

        sbHorizontal.valueProperty().addListener(ov->text.setX(sbHorizontal.getValue()*paneForText.getWidth()/sbHorizontal.getMax()));

        sbVertical.valueProperty().addListener(ov->text.setY(sbVertical.getValue()*paneForText.getHeight()/sbVertical.getMax()));

        Scene scene = new Scene(pane,450,170);
        stage.setTitle("ScrollBarDemo");
        stage.setScene(scene);
        stage.show();

    }
}
