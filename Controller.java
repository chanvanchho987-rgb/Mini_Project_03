import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;
<<<<<<< Updated upstream
import javafx.scene.image.ImageView;
=======
>>>>>>> Stashed changes

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void on_submit(ActionEvent event) {

    }
    VBoxx vbox = new Vbox();

<<<<<<< Updated upstream
    VBox vbox = new VBox();

    // HBox hbox_1 = new HBox();
    // HBox hbox_2 = new HBox();
    // HBox hbox_3 = new HBox();

    // Label label_1 = new Label("Item 1");
    // Label label_1_price = new Label("5.00$");
    // ImageView image_1 = new ImageView("Arduino.jpg");
    // Spinner<Integer> spinner_1 = new Spinner<>(0, 10, 0);

    // Pos pos = Pos.CENTER;

    @FXML
    void initialize() {

        // image_1.setFitWidth(100);
        // image_1.setFitHeight(100);

        // hbox_1.getChildren().addAll(image_1, label_1, label_1_price, spinner_1);

        // hbox_1.setAlignment(pos);

        // vbox.getChildren().addAll(hbox_1);
=======

    @FXML
    void initialize() {
        scrollpane.setContent(vbox);
>>>>>>> Stashed changes

    }

}
