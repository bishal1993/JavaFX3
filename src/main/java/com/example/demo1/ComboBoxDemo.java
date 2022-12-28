package com.example.demo1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {
    private String[] flagCountry = {"Canada","China","Denmark","Germany","India","United Kingdom","United States of Americ"};

    private DescriptionPane descriptionPane = new DescriptionPane();
    private ComboBox<String> cbo = new ComboBox<>();

    @Override
    public void start(Stage stage){
        flagCountry[0]="Canada";
        flagCountry[1]="China";
        flagCountry[2]="Denmark";
        flagCountry[3]="Germany";
        flagCountry[4]="India";
        flagCountry[5]="United Kingdom";
        flagCountry[6]="United States of Americ";

        setDisplay(0);

        BorderPane borderPane = new BorderPane();
        BorderPane paneForComboBox = new BorderPane();
        paneForComboBox.setLeft(new Label("Select a country: "));
        paneForComboBox.setCenter(cbo);
        borderPane.setTop(paneForComboBox);
        cbo.setPrefWidth(400);
        cbo.setValue("Canada");

        ObservableList<String> items = FXCollections.observableArrayList(flagCountry);
        cbo.getItems().addAll(items);
        borderPane.setCenter(descriptionPane);

        cbo.setOnAction(e->setDisplay(items.indexOf(cbo.getValue())));

        Scene scene = new Scene(borderPane,450,170);
        stage.setTitle("ComboBoxDemo");
        stage.setScene(scene);
        stage.show();

    }

    public void setDisplay(int index){
        descriptionPane.setTitel(flagCountry[index]);
        descriptionPane.setDescription(flagCountry[index]);
    }
}
