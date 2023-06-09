package com.example.easycoin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;

public class LoginPageController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    //TODO: This function acc doesn't happen rn, it needs to be triggered by a button click but...
    //TODO: This code is a template from a github account, so i'l check how they did it and edit it

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.setFullScreen(true);

        Window owner = submitButton.getScene().getWindow();

        if(usernameField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your name");
            return;
        }
        if(passwordField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter a password");
            return;
        }

        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Login Successful!",
                "Welcome " + usernameField.getText());
    }


    public void onSubmitButtonClick(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("FrontPageView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 800, 500);
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.setScene(scene);
        stage.setFullScreen(true);
    }
}