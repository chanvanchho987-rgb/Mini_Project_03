import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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
    void on_submit(ActionEvent event) {

    }

    // ============================================================================================
    VBox vbox = new VBox();
    HBox hbox = new HBox();

    Label label1 = new Label("1. Arduino");
    Label label1_price = new Label("Price: $5.00");
    ImageView image1 = new ImageView(new Image(getClass().getResourceAsStream("/assets/arduino.png")));

    // ============================================================================================

    @FXML
    void initialize() {

    }

}
