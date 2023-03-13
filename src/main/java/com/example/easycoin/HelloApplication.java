package com.example.easycoin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Create start up scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        //Start stage
        stage.setTitle("EasyCoin");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();

        //Create login scene
        Parent newRoot = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        Scene newScene = new Scene(newRoot, 800, 500);

    }




    public static void main(String[] args) {
        launch();
    }
}
