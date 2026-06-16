import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label total;

    @FXML
    private ScrollPane scrollpane;

    @FXML
    void on_submit(ActionEvent event) {
        int total = 0;
        for (int i = 0; i < spinners.size(); i++) {
            total += spinners.get(i).getValue() * (int) items[i][1];
        }
        this.total.setText("Total: " + total + " $");
    }

    // ====================================================================================================================
    VBox vbox = new VBox();

    Object[][] items = {
            { "Arduino Uno", 10.0, "ESP32.jpg" },
            // { "ESP32", 20.0, "ESP32.jpg" },
            // { "Rasberry Pi", 30.0, "Rasberry Pi.jpg" },
            // { "Srey Sart", 40.0, "Srey Sart.jpg" },
            // { "STM3F2103", 50.0, "STM32F103.jpg" }
    };

    ArrayList<HBox> hboxes = new ArrayList<>();
    ArrayList<Label> label_names = new ArrayList<>();
    ArrayList<Label> label_prices = new ArrayList<>();
    ArrayList<ImageView> images = new ArrayList<>();
    ArrayList<Spinner<Integer>> spinners = new ArrayList<>();
    // ====================================================================================================================

    @FXML
    void initialize() {

        System.out.println(items[0][0] + " " + items[0][1] + " " + items[0][2]);
        for (int i = 0; i < items.length; i++) {
            hboxes.add(new HBox());

            label_names.add(new Label(i + "." + items[i][0].toString() + " "));
            label_prices.add(new Label(items[i][1].toString() + " $"));
            images.add(new ImageView(items[i][2].toString()));
            spinners.add(new Spinner<>(0, 100, 0));

            hboxes.get(i).getChildren().addAll(
                    label_names.get(i),
                    label_prices.get(i),
                    images.get(i),
                    spinners.get(i));

            vbox.getChildren().add(hboxes.get(i));
        }

        scrollpane.setContent(vbox);

    }

}
