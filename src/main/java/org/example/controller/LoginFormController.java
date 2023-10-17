package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    private Parent parent;
    private Stage stage;
    private Scene scene;
    public void btnLoginOnAction(ActionEvent actionEvent) {
        try {
            parent= FXMLLoader.load(getClass().getResource("/view/clothify_form.fxml"));
            stage= (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            scene=new Scene(parent);

            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage());
        }

    }
}
