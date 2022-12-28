package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LabelWithGraphic extends Application {
    @Override
    public  void start(Stage stage){
        ImageView us = new ImageView();

        Label lb2= new Label("Circle", new Circle(50,50,25));
        lb2.setContentDisplay(ContentDisplay.TOP);

        Label lb3 = new Label("Rectangle", new Rectangle(10,10,50,25));
        lb3.setContentDisplay(ContentDisplay.RIGHT);

        Label lb4 = new Label("Ellipse", new Ellipse(50,50,50,25));
        lb4.setContentDisplay(ContentDisplay.LEFT);

        Ellipse ellipse = new Ellipse(50,50,50,25);
        ellipse.setStroke(Color.GREEN);
        ellipse.setFill(Color.WHITE);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));

        Label lb5 = new Label("A Pane inside a label", stackPane);
        lb5.setContentDisplay(ContentDisplay.BOTTOM);

        HBox pane = new HBox(20);
        pane.getChildren().addAll(lb2,lb3,lb4,lb5);

        Scene scene = new Scene(pane,450,150);
        stage.setScene(scene);
        stage.setTitle("LabelwithGRaphic");
        stage.show();

    }
}
