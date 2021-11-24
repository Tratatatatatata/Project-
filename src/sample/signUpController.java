package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class signUpController {

    @FXML
    private Button buttonSignUp2;

    @FXML
    private TextField fieldName;

    @FXML
    private TextField fieldPassword1;

    @FXML
    private TextField fieldPassword2;

    @FXML
    private TextField fieldSurname;

    @FXML
    private TextField fieldUsername;

    @FXML
    void initialize() {
        buttonSignUp2.setOnAction(event -> {
            buttonSignUp2.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/mainScene.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }
}

