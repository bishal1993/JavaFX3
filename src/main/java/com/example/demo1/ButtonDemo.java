package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonDemo extends Application {
    protected Text text = new Text(60,50,"JavaFX Programming");

    @Override
    public void start(Stage stage){
        Scene scene = new Scene(getPane(),450,200);
        stage.setTitle("ButtonDemo");
        stage.setScene(scene);
        stage.show();
    }

    protected BorderPane getPane(){
        HBox paneForButtons = new HBox();
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right");
        Button btUp  = new Button("Up");
        Button btDown = new Button("Down");


        paneForButtons.getChildren().addAll(btLeft,btRight,btUp,btDown);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color:green");

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);

        btLeft.setOnAction(e-> text.setX(text.getX()-10));
        btRight.setOnAction(e-> text.setX(text.getX()+10));
        btUp.setOnAction(e->text.setY(text.getY()-10));
        btDown.setOnAction(e->text.setY(text.getY()+10));

        return pane;
    }
}
