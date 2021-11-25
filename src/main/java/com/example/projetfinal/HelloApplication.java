package com.example.projetfinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.invoke.CallSite;


public class HelloApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


        System.out.println(CalculBuilder.calculBuilderScientifique("2+4*3"));
    }

    public static void main(String[] args) {
        launch();
    }

    public static Stage getStage() {
        return stage;
    }

}
