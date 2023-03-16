package com.example.easycoin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class FrontPageApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FrontPageView.fxml"));
        primaryStage.setTitle("EasyCoin");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
}
