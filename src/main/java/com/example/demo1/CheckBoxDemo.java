package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CheckBoxDemo extends ButtonDemo{
    @Override
    protected BorderPane getPane(){
        TextField textField = new TextField();
        textField.setEditable(false);
        textField.setStyle("-fx-text-fill:red");
        textField.setFont(Font.font("Times",20));
        textField.setAlignment(Pos.BASELINE_RIGHT);


        BorderPane pane = super.getPane();
        Font fontBoldItalic = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20);
        text.setFont(fontBoldItalic);

        Font fontBold = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.REGULAR,20);
        Font fontItalic = Font.font("Times New Roman", FontWeight.NORMAL,FontPosture.ITALIC,20);
        Font fontNormal = Font.font("Times New Roman",FontWeight.NORMAL,FontPosture.REGULAR,20);

        VBox paneForCheckBoxes = new VBox(20);
        paneForCheckBoxes.setPadding(new Insets(5,5,5,5));
        paneForCheckBoxes.setStyle("-fx-border-color:green");

        CheckBox chkBold = new CheckBox("Bold");
        CheckBox chkItalic = new CheckBox("Italic");

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5,5,5,5));

        paneForRadioButtons.setStyle("-fx-border-color:green");

        RadioButton rbRed= new RadioButton("Red");

         RadioButton rbGreen = new RadioButton("Green");
         RadioButton rbBlue = new RadioButton("Blue");

        paneForRadioButtons.getChildren().addAll(rbRed,rbGreen,rbBlue);
        pane.setLeft(paneForRadioButtons);

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        rbRed.setOnAction(e->{
            if(rbRed.isSelected()){
                text.setFill(Color.RED);
            }
        });

        rbGreen.setOnAction(e->{
            if(rbGreen.isSelected()){
                text.setFill(Color.GREEN);
            }
        });

        rbBlue.setOnAction(e->{
            if(rbBlue.isSelected()){
                text.setFill(Color.BLUE);
            }
        });

        paneForCheckBoxes.getChildren().addAll(chkBold,chkItalic);
        pane.setRight(paneForCheckBoxes);

        EventHandler<ActionEvent> handler = e->{
            if(chkBold.isSelected() && chkItalic.isSelected()){
                text.setFont(fontBoldItalic);
            } else if(chkBold.isSelected()){
                text.setFont(fontBold);
            } else if(chkItalic.isSelected()){
                text.setFont(fontItalic);
            } else{
                text.setFont(fontNormal);
            }
        };

        return  pane;

    }

    public static void main(String [] args){
        launch(args);
    }
}
