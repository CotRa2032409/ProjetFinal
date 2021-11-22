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
    @FXML
    private Button bou1 = new Button("1");
    @FXML
    private Button bou2 = new Button("2");
    @FXML
    private Button bou3 = new Button("3");
    @FXML
    private Button bou4 = new Button("4");
    @FXML
    private Button bou5 = new Button("5");
    @FXML
    private Button bou6 = new Button("6");
    @FXML
    private Button bou7 = new Button("7");
    @FXML
    private Button bou8 = new Button("8");
    @FXML
    private Button bou9 = new Button("9");
    @FXML
    private Button bouPoint = new Button(".");
    @FXML
    private Button bouNegatif = new Button("+/-");
    @FXML
    private Button bouCarre = new Button("+/-");
    @FXML
    private Button bouRacine = new Button("+/-");
    @FXML
    private Button bouPlus = new Button("+");
    @FXML
    private Button bouMoins = new Button("-");
    @FXML
    private Button bouFois = new Button("*");
    @FXML
    private Button bouDiviser = new Button("/");
    @FXML
    private Button bouInverse = new Button("1/x");
    @FXML
    private Button bouEgal = new Button("=");
    @FXML
    private Button bouEffacer = new Button("Effacer");

    @FXML
    protected void onScientifiqueButtonClick() {

    }

    @FXML
    protected void onNumber0Click() {
        insert += bou0.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber1Click() {
        insert += bou1.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber2Click() {
        insert += bou2.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber3Click() {
        insert += bou3.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber4Click() {
        insert += bou4.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber5Click() {
        insert += bou5.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber6Click() {
        insert += bou6.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber7Click() {
        insert += bou7.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber8Click() {
        insert += bou8.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNumber9Click() {
        insert += bou9.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onPointClick() {
        insert += bouPoint.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onNegatifClick() {
        insert = Operations.inverseSigne(textField.getText());
        textField.setText(insert);
    }

    @FXML
    protected void onCarreClick() {
        insert = Operations.exposant2(textField.getText());
        textField.setText(insert);
    }

    @FXML
    protected void onRacineClick() {
        insert = Operations.racineCarree(textField.getText());
        textField.setText(insert);
    }

    @FXML
    protected void onAdditionClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onSoustractionClick() {
        insert += bouMoins.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onMultiplicationClick() {
        insert += bouFois.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onDivisionClick() {
        insert += bouDiviser.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onInverseClick() {
        insert = Operations.unSurResultat(textField.getText());
        textField.setText(insert);
    }

    @FXML
    protected void onEgalClick() {
        insert = (CalculBuilder.calculBuilderStandard(textField.getText()));
        textField.setText(insert);
    }

    @FXML
    protected void onEffacerClick() {
        String calcul = textField.getText();
        StringBuffer sb= new StringBuffer(calcul);
        sb.deleteCharAt(sb.length()-1);
        insert = String.valueOf(sb);
        textField.setText(insert);
        System.out.println(sb);
    }

}