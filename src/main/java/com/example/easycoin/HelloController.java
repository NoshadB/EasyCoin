package com.example.easycoin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Links to new page");
    }*/

    @FXML
    protected void onHelloButtonClick() throws IOException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("login-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

}