import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button_submit;

    @FXML
    private Label label_total;

    @FXML
    private ScrollPane scrollpane;

    @FXML
    void initialize(MouseEvent event) {

    }

    @FXML
    void on_submit(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert button_submit != null : "fx:id=\"button_submit\" was not injected: check your FXML file 'View.fxml'.";
        assert label_total != null : "fx:id=\"label_total\" was not injected: check your FXML file 'View.fxml'.";
        assert scrollpane != null : "fx:id=\"scrollpane\" was not injected: check your FXML file 'View.fxml'.";

    }

}
