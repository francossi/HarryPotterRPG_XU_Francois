package com.example.harrypotterrpg_xu_francois;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    Scene scene;
    Stage stage;
    @FXML
    ImageView Accueil;
    @FXML
    ImageView Introduction;


    public void switchToIntroduction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Introduction.fxml"));
        stage = (javafx.stage.Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }
    public void switchToChapter1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Chapter1.fxml"));
        stage = (javafx.stage.Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

}