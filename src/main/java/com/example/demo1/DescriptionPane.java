package com.example.demo1;

import javafx.geometry.Insets;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DescriptionPane extends BorderPane {

    private  Label label = new Label();
    private TextArea textArea = new TextArea();

    public DescriptionPane(){
        label.setContentDisplay(ContentDisplay.TOP);
        label.setPrefSize(200,100);

        label.setFont(new Font("SansSerif",16));
        textArea.setEditable(false);

        ScrollPane scrollPane = new ScrollPane(textArea);

        setLeft(label);
        setCenter(scrollPane);
        setPadding(new Insets(5,5,5,5));
    }

    public void setTitel(String titel){
        label.setText(titel);
    }

    public  void setImageView(ImageView icon){
        label.setGraphic(icon);
    }

    public  void setDescription(String text){
        textArea.setText(text);
    }


}
