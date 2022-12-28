package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.util.Duration;


public class MediaDemo extends Application {
    private static final String MEDIA_URL="http://liveexample.pearsoncmg.com/common/sample.mp4";

    @Override
    public  void start(Stage stage){
        Media media = new Media(MEDIA_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        Button playButton = new Button(">");
        playButton.setOnAction(e->{
            if(playButton.getText().equals(">")){
                mediaPlayer.play();
                playButton.setText("||");
            } else{
                mediaPlayer.pause();
                playButton.setText(">");
            }
        });

        Button reWindButton = new Button("<<");
        reWindButton.setOnAction(e->mediaPlayer.seek(Duration.ZERO));

        Slider sliderVolume = new Slider();
        sliderVolume.setPrefWidth(150);
        sliderVolume.setMaxWidth(Region.USE_PREF_SIZE);
        sliderVolume.setMinWidth(30);
        sliderVolume.setValue(50);
        mediaPlayer.volumeProperty().bind(sliderVolume.valueProperty().divide(100));

        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(playButton,reWindButton,new Label("Volume", sliderVolume));

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(mediaView);
        borderPane.setBottom(hBox);

        Scene scene = new Scene(borderPane,650,500);
        stage.setTitle("Media Demo");
        stage.setScene(scene);
        stage.show();





    }
}
