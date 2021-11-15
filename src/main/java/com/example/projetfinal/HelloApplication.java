package com.example.projetfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(ae -> {

            if (ae.getCode() == KeyCode.MULTIPLY  || (ae.isShiftDown() && ae.getCode() == KeyCode.DIGIT8) )
                System.out.println(14 + 5);
            if (ae.getCode() == KeyCode.DIVIDE || (ae.isShiftDown() && ae.getCode() == KeyCode.DIGIT3))
                System.out.println(14 +5);
        });
        System.out.println(Operations.multiplication(8,5));
        System.out.println(Operations.division(8,5));
        System.out.println(Operations.exposant2(8));
        System.out.println(Operations.inverseSigne(8));
        System.out.println(Operations.racineCarree(25));
        System.out.println(Operations.unSurResultat());

        System.out.println(CalculBuilder.calculBuilder());

    }

    public static void main(String[] args) {
        launch();
    }
}