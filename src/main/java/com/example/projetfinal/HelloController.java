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
    private Label reponse;
    @FXML
    private Label historique;
    @FXML
    private TextField textField;
    @FXML
    private String insert = "";
    @FXML
    private Button bou0;
    @FXML
    private Button bou1;
    @FXML
    private Button bou2;
    @FXML
    private Button bou3;
    @FXML
    private Button bou4;
    @FXML
    private Button bou5;
    @FXML
    private Button bou6;
    @FXML
    private Button bou7;
    @FXML
    private Button bou8;
    @FXML
    private Button bou9;
    @FXML
    private Button bouPoint;
    @FXML
    private Button bouNegatif;
    @FXML
    private Button bouCarre;
    @FXML
    private Button bouRacine;
    @FXML
    private Button bouPlus;
    @FXML
    private Button bouMoins;
    @FXML
    private Button bouFois;
    @FXML
    private Button bouDiviser;
    @FXML
    private Button bouInverse;
    @FXML
    private Button bouEgal;
    @FXML
    private Button bouEffacer;
    @FXML
    private Button bouModulo;

    //Boutons Standard

    @FXML
    protected void onStandardButtonClick() {
        HelloApplication.setScene1();
    }

    @FXML
    protected void onScientifiqueButtonClick() {
        HelloApplication.setScene2();
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
    protected void onEgalClick() throws NumberFormatException {
        try {
            insert = (CalculBuilder.calculBuilderStandard(textField.getText()));
            reponse.setText(insert);
            historique.setText("Historique :\n" + reponse.getText());
            //Pas fini
            //VBox???
            insert = "";
        }
        catch (Exception e){
            e.printStackTrace();
            reponse.setText("Erreur");
        }
        finally {
            insert = "";
        }
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

    //Boutons Scientifiques

    @FXML
    protected void onModuloClick() {
        insert += bouModulo.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onParentheseOuverteClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onParentheseFermeeClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onExposantClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onRacineArbitraireClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onSinClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onCosClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onTanClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onArcsinClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onArccosClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onArctanClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onEulerExposantClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onLogClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onLnClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onFactorielleClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onPiClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onEulerClick() {
        insert += bouPlus.getText();
        textField.setText(insert);
    }

    @FXML
    protected void onEgalScientifiqueClick() throws NumberFormatException {
        try {
            insert = (CalculBuilder.calculBuilderScientifique(textField.getText()));
            reponse.setText(insert);
            historique.setText("Historique :\n" + reponse.getText());
            //Pas fini
            //VBox???
            insert = "";
        }
        catch (Exception e){
            e.printStackTrace();
            reponse.setText("Erreur");
        }
        finally {
            insert = "";
        }
    }
}