package com.example.easycoin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.io.IOException;

public class HeaderController {

    @FXML
    private Label accountButton;

    @FXML
    private Label settingsButton;

    @FXML
    private Label logoutButton;

    /* Opens up login form when login button is clicked */
    @FXML
    protected void onAccountButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPageView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) accountButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    /* Opens up login form when login button is clicked */
    @FXML
    protected void onSettingsButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPageView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) settingsButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    /* Opens up login form when login button is clicked */
    @FXML
    protected void onLogoutButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPageView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    /*
    public void initialize() {
        // Set up event handlers for the buttons
        accountButton.setOnAction(event -> {
            // TODO: Replace with actual URL or action
            System.out.println("My Account button clicked!");
        });

        settingsButton.setOnAction(event -> {
            // TODO: Replace with actual URL or action
            System.out.println("My Settings button clicked!");
        });

        logoutButton.setOnAction(event -> {
            // TODO: Replace with actual URL or action
            System.out.println("Logout button clicked!");
        });

        */
}
