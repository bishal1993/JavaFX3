package com.example.demo1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class TextFieldDemo extends CheckBoxDemo{
    @Override
    public BorderPane getPane(){
        BorderPane borderPane = super.getPane();

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5,5,5,5));
        paneForTextField.setStyle("-fx-border-color:green");
        paneForTextField.setLeft(new Label("Enter a new message: "));

        TextField textField = new TextField();
        textField.setAlignment(Pos.BOTTOM_LEFT);
        paneForTextField.setCenter(textField);
        borderPane.setTop(paneForTextField);

        textField.setOnAction(e-> text.setText(textField.getText()));

        return  borderPane;

    }

    public static void main(String [] args){
        launch(args);
    }
}
