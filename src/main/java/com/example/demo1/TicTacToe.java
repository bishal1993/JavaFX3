package com.example.demo1;

import javafx.application.Application;
import javafx.scene.control.Cell;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    private char whoseTurn = 'X';
    private Cell[][] cell = new Cell[3][3];

    private Label lbStatus = new Label("X's turn to play");


    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pane.add(cell[i][j] = new Cell(), j, i);
            }
        }

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(lbStatus);
    }

    public boolean isWon(char token) {
        for (int i = 0; i < 3; i++) {
            //  if(cell[i][0].getToken()==token && cell[i][1] ==token &&cell[i][2]==token){
            return true;


        }
        return true;
    }


}
