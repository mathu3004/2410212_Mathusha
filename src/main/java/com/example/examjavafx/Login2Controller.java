package com.example.examjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login2Controller {
        @FXML
        public MenuItem closeMenuButton;
        @FXML
        public TextField usernameText;
        @FXML
        public PasswordField passwordText;
        @FXML
        public Label mySpaceLabel;
        @FXML
        public Label promptText;

        @FXML
        protected void onCloseMenuButtonClick() {
            System.exit(0);
        }

        @FXML
        protected void onLoginButtonClick() {
            String username = usernameText.getText();
            String password = passwordText.getText();
            if (username.isEmpty() || password.isEmpty()) {
                promptText.setText("You must fill all the fields");
            }
        }
    }


