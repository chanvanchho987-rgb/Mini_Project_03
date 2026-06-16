import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label_total;

    @FXML
    private ScrollPane scrollpane;

    @FXML
    void on_submit(ActionEvent event) {

        int total = 0;
        total += spinner_item_1.getValue() * 10;
        total += spinner_item_2.getValue() * 20;
        total += spinner_item_3.getValue() * 30;

        label_total.setText("Total: " + total + "$");

    }

    VBox vbox = new VBox();
    HBox hbox_item_1 = new HBox();
    HBox hbox_item_2 = new HBox();
    HBox hbox_item_3 = new HBox();

    Label label_item_1 = new Label("1. Galaxy S26 Ultra: ");
    Label label_item_1_price = new Label("10$");
    ImageView image_item_1 = new ImageView("photo\\Galaxy-S26-Ultra-Purple-1.jpg");
    Spinner <Integer> spinner_item_1 = new Spinner<>(0, 100, 0);

    Label label_item_2 = new Label("2. iPhone 17 Pro: ");
    Label label_item_2_price = new Label("20$");
    ImageView image_item_2 = new ImageView("photo\\iphone-17-pro-d7ae6571d5b147ab8312e83b4d30a5a9.jpg");
    Spinner <Integer> spinner_item_2 = new Spinner<>(0, 100, 0);

    Label label_item_3 = new Label("3. Oppo Find X9 Pro: ");
    Label label_item_3_price = new Label("30$");
    ImageView image_item_3 = new ImageView("photo\\Oppo Find X9 Pro.jpg");
    Spinner <Integer> spinner_item_3 = new Spinner<>(0, 100, 0);

    Pos pos = Pos.CENTER;

    @FXML
    void initialize() {

        image_item_1.setFitWidth(200);
        image_item_1.setFitHeight(200);

        image_item_2.setFitWidth(200);
        image_item_2.setFitHeight(200);

        image_item_3.setFitWidth(200);
        image_item_3.setFitHeight(200);

        hbox_item_1.getChildren().addAll(label_item_1, label_item_1_price, image_item_1, spinner_item_1);
        hbox_item_2.getChildren().addAll(label_item_2, label_item_2_price, image_item_2, spinner_item_2);
        hbox_item_3.getChildren().addAll(label_item_3, label_item_3_price, image_item_3, spinner_item_3);

        vbox.getChildren().add(hbox_item_1);
        vbox.getChildren().add(hbox_item_2);
        vbox.getChildren().add(hbox_item_3);
       
        scrollpane.setContent(vbox);
        

    }

}
