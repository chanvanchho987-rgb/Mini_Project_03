import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
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
        updateTotal();
    }

    private final VBox vbox = new VBox();
    private final HBox hbox_1 = new HBox(10);

    private final Label label_1 = new Label("1. Arduino");
    private final Label label_1_price = new Label("7$");
    private final ImageView image_1;
    private final Spinner<Integer> spinner_1 = new Spinner<>(0, 10, 0);

    public Controller() {
        InputStream imageStream = getClass().getResourceAsStream("/asset/Arduino Uno.jpg");
        if (imageStream != null) {
            image_1 = new ImageView(new Image(imageStream));
            image_1.setFitHeight(72);
            image_1.setPreserveRatio(true);
        } else {
            image_1 = new ImageView();
            label_1_price.setText("7$ (image missing)");
        }
    }

    @FXML
    void initialize() {
        hbox_1.getChildren().addAll(label_1, label_1_price, image_1, spinner_1);
        vbox.getChildren().add(hbox_1);
        scrollpane.setContent(vbox);

        label_total.setText("Total: 0$");
        spinner_1.valueProperty().addListener((obs, oldValue, newValue) -> updateTotal());
    }

    private void updateTotal() {
        int quantity = spinner_1.getValue();
        int unitPrice = 7;
        label_total.setText("Total: " + (quantity * unitPrice) + "$");
    }
}