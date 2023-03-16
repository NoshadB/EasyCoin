package com.example.easycoin;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class StartUpPageController {
    @FXML
    private Label loginButton;
    @FXML

    /* Opens up login form when login button is clicked */
    protected void onLoginButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPageView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) loginButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setFullScreen(true);
    }
}