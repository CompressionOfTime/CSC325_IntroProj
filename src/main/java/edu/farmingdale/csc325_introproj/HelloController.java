package edu.farmingdale.csc325_introproj;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    // new line

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome Natalie!");
    }
}