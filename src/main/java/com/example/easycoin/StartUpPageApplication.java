package com.example.easycoin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

//Run to launch application

public class StartUpPageApplication extends Application {
    public static void main(String[] args) {
        launch();
    } //Launches code
    @Override
    public void start(Stage stage) throws IOException {
        //Create start up scene
        FXMLLoader fxmlLoader = new FXMLLoader(StartUpPageApplication.class.getResource("StartUpPageView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //Start stage
        stage.setTitle("EasyCoin");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
    }
}
