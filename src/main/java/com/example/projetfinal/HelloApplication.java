package com.example.projetfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(ae -> {
            if (ae.getCode() == KeyCode.MULTIPLY || (ae.isShiftDown() && ae.getCode() == KeyCode.DIGIT8))
                System.out.println(14 + 5);
            if (ae.getCode() == KeyCode.DIVIDE || (ae.isShiftDown() && ae.getCode() == KeyCode.DIGIT3))
                System.out.println(14 + 5);
        });

        System.out.println(CalculBuilder.calculBuilderStandard("25+25/5*2-10"));
        System.out.println(Operations.modulo(8,5));
        System.out.println(Operations.exposants(2, 4 ));
        System.out.println(Operations.sinus(45));
        System.out.println(Operations.cosinus(45));
        System.out.println(Operations.tangente(45));
        System.out.println(Operations.arcCos(0.001));
        System.out.println(Operations.arcSin(0.001));
        System.out.println(Operations.inverseSigne("25 + 25"));
    }

    public static void main(String[] args) {
        launch();
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        HelloApplication.stage = stage;
    }
}
