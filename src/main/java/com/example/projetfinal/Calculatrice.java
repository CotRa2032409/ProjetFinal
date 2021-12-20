package com.example.projetfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Calculatrice extends Application {

    private static Stage stage;
    private static Scene scene1;
    private static Scene scene2;

    @Override
    public void start(Stage stage) throws IOException {
        Calculatrice.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Calculatrice.class.getResource("hello-view.fxml"));
        scene1 = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader2 = new FXMLLoader(Calculatrice.class.getResource("scientifique.fxml"));
        scene2 = new Scene(fxmlLoader2.load());
        stage.setTitle("Calculatrice");
        stage.setScene(scene1);
        stage.show();

        System.out.println(CalculBuilder.calculBuilderScientifique("-1*-1"));

        //System.out.println(CalculBuilder.calculBuilderScientifique("1+(4-2+(3-2)*3)"));
    }

    public static void main(String[] args) {
        launch();
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Calculatrice.stage = stage;
    }

    public static Scene getScene1() {
        return scene1;
    }

    public static void setScene1() {
        stage.setScene(scene1);
    }

    public static Scene getScene2() {
        return scene2;
    }

    public static void setScene2() {
        stage.setScene(scene2);
    }
}
