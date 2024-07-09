package com.example.examjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Objects;

public class LoginController {
    @FXML
    public TextField fullNameText;
    @FXML
    public TextField emailIDText;
    @FXML
    public PasswordField passwordText;
    @FXML
    public Label promptText;
    @FXML
    public Button submitButton;

    public void onSubmitButtonClick() throws Exception {
        if (fullNameText.getText().isEmpty() || emailIDText.getText().isEmpty() || passwordText.getText().isEmpty()) {
            promptText.setText("You must fill all the fields!!!");
        }
        else {
            submitButton.setText("Submit");
            Stage previousStage =(Stage) submitButton.getScene().getWindow();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login2.fxml")));
            previousStage.setScene(new Scene(root, 600, 350 ));
        }
    }
}
