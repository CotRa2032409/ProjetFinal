package com.example.projetfinal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField textField;
    @FXML
    private String insert = "";
    @FXML
    private Button bou0 = new Button("0");

    public HelloController() {
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onScientifiqueButtonClick() throws IOException {

    }

    @FXML
    protected void onEgalClick() {

    }

    @FXML
    protected void onNumberClick(){
    }

    @FXML
    protected void onNumber0Click(){
        insert += bou0.getText();
        textField.setText(insert);
    }
}