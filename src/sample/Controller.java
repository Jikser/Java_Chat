package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;
    @FXML
    public Button buttonMsg;

    @FXML
    public void sendMessage(ActionEvent actionEvent) {
        textArea.appendText((textField.getText()) +"\n");
        textField.clear();
        textField.requestFocus();
    }
    @FXML
    public void clickClose(ActionEvent actionEvent) {
        Platform.runLater(() -> {
            Stage stage = (Stage) buttonMsg.getScene().getWindow();
            stage.close();
        });
    }
}