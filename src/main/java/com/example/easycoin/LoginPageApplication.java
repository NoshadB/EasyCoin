package com.example.easycoin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginPageApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        //FXMLLoader fxmlLoader = new FXMLLoader(StartUpPageApplication.class.getResource("LoginPageView.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Parent root = FXMLLoader.load(getClass().getResource("LoginPageView.fxml"));

        primaryStage.setTitle("LOGIN");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
}
