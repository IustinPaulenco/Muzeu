package com.example.muzeu;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label welcomeText;


    @FXML
    protected void meniuPrincipalVizualizare(ActionEvent event) throws Exception{
        System.out.println("Intrăm pe vizualizare din meniu");
        root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("default-format.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void meniuPrincipalLogin(ActionEvent event) throws Exception{
        System.out.println("Intrăm pe login din meniu");
        root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void meniuPrincipalLogged(ActionEvent event) throws Exception{
        System.out.println("Logged In!");
        root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("logged.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void meniuPrincipal(ActionEvent event) throws Exception{
        System.out.println("Intrăm pe vizualizare din meniu");
        root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}