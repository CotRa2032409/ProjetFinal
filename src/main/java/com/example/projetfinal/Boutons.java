package com.example.projetfinal;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Boutons {
    @FXML
    private Label welcomeText;
    @FXML
    private Label reponse;
    @FXML
    private TextArea historique;
    @FXML
    private TextField votreCalcul;
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
    private Button bouModulo;
    @FXML
    private Button bouParentheseOuverte;
    @FXML
    private Button bouParentheseFermee;
    @FXML
    private Button bouexposants;
    @FXML
    private Button bouRacineArbitraire;
    @FXML
    private Button bouSin;
    @FXML
    private Button bouCos;
    @FXML
    private Button bouTan;
    @FXML
    private Button bouArcsin;
    @FXML
    private Button bouArccos;
    @FXML
    private Button bouArctan;
    @FXML
    private Button bouEulerExposant;
    @FXML
    private Button bouLog;
    @FXML
    private Button bouLn;
    @FXML
    private Button bouFactorielle;
    @FXML
    private Button bouPi;
    @FXML
    private Button bouEuler;

    //Boutons Standard

    @FXML
    protected void onStandardButtonClick() {
        Calculatrice.setScene1();
    }

    @FXML
    protected void onScientifiqueButtonClick() {
        Calculatrice.setScene2();
    }

    @FXML
    protected void onNumber0Click() {
        insert += bou0.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber1Click() {
        insert += bou1.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber2Click() {
        insert += bou2.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber3Click() {
        insert += bou3.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber4Click() {
        insert += bou4.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber5Click() {
        insert += bou5.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber6Click() {
        insert += bou6.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber7Click() {
        insert += bou7.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber8Click() {
        insert += bou8.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNumber9Click() {
        insert += bou9.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onPointClick() {
        insert += bouPoint.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onNegatifClick() {
        insert = Operations.inverseSigne(votreCalcul.getText());
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onCarreClick() {
        insert = Operations.exposant2(votreCalcul.getText());
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onRacineClick() {
        insert = Operations.racineCarree(votreCalcul.getText());
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onAdditionClick() {
        insert += bouPlus.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onSoustractionClick() {
        insert += bouMoins.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onMultiplicationClick() {
        insert += bouFois.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onDivisionClick() {
        insert += bouDiviser.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onInverseClick() {
        insert = Operations.unSurResultat(votreCalcul.getText());
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onEgalClick() throws NumberFormatException {
        try {
            insert = (CalculBuilder.calculBuilderStandard(votreCalcul.getText()));
            reponse.setText(insert);
            historique.appendText('\n' + insert);
            insert = "";
        } catch (Exception e) {
            e.printStackTrace();
            reponse.setText("Erreur");
        } finally {
            insert = "";
        }
    }

    @FXML
    protected void onEffacerClick() {
        String calcul = votreCalcul.getText();
        StringBuffer sb = new StringBuffer(calcul);
        sb.deleteCharAt(sb.length() - 1);
        insert = String.valueOf(sb);
        votreCalcul.setText(insert);
        System.out.println(sb);
    }

    //Boutons scientifiques différents

    @FXML
    protected void onNegatifScientifiqueClick() {
        insert += "(" + bouNegatif.getText() + ")";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onCarreScientifiqueClick() {
        insert += "²";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onRacineScientifiqueClick() {
        insert += "√(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onInverseScientifiqueClick() {
        insert += "(" + bouInverse.getText() + ")";
        votreCalcul.setText(insert);
    }

    //Boutons scientifiques nouveaux

    @FXML
    protected void onModuloClick() {
        insert += bouModulo.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onParentheseOuverteClick() {
        insert += bouParentheseOuverte.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onParentheseFermeeClick() {
        insert += bouParentheseFermee.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onExposantClick() {
        insert += "^(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onRacineArbitraireClick() {
        insert += "(" + bouRacineArbitraire.getText() + ")";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onSinClick() {
        insert += bouSin.getText() + "(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onCosClick() {
        insert += bouCos.getText() + "(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onTanClick() {
        insert += bouTan.getText() + "(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onArcsinClick() {
        insert += bouArcsin.getText() + "(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onArccosClick() {
        insert += bouArccos.getText() + "(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onArctanClick() {
        insert += bouArctan.getText() + "(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onEulerExposantClick() {
        insert += "e^(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onLogClick() {
        insert += bouLog.getText() + "(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onLnClick() {
        insert += bouLn.getText() + "(";
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onFactorielleClick() {
        insert += bouFactorielle.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onPiClick() {
        insert += bouPi.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onEulerClick() {
        insert += bouEuler.getText();
        votreCalcul.setText(insert);
    }

    @FXML
    protected void onEgalScientifiqueClick() throws NumberFormatException {
        try {
            insert = (CalculBuilder.calculBuilderScientifique(votreCalcul.getText()));
            reponse.setText(insert);
            historique.appendText('\n' + insert);
            insert = "";
        } catch (Exception e) {
            e.printStackTrace();
            reponse.setText("Erreur");
        } finally {
            insert = "";
        }
    }

    //Boutons Menu Conversion

    @FXML
    protected void onDegreeToFahrenheit(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) * 1.8 + 32));
    }

    @FXML
    protected void onFahrenheitToDegree(){
        reponse.setText(String.valueOf((Double.parseDouble(reponse.getText()) - 32) / 1.8));
    }

    @FXML
    protected void onLivreToKg(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) / 2.205));
    }

    @FXML
    protected void onKgToLivre(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) * 2.205));
    }

    @FXML
    protected void onMetreToPouce(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) * 39.37));
    }

    @FXML
    protected void onPouceToMetre(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) / 39.37));
    }

    @FXML
    protected void onKmHToMs(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) / 3.6));
    }

    @FXML
    protected void onMsToKmH(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) * 3.6));
    }

    @FXML
    protected void onDegreeToRad(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) * (Math.PI / 180)));
    }

    @FXML
    protected void onRadToDegree(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) * (180 / Math.PI)));
    }

    @FXML
    protected void onSecondeToMinute(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) / 60));
    }

    @FXML
    protected void onMinuteToSeconde(){
        reponse.setText(String.valueOf(Double.parseDouble(reponse.getText()) * 60));
    }
}