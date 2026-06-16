import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //
        FXMLLoader loader = new FXMLLoader();
        loader = new FXMLLoader(getClass().getResource("scene_main/View.fxml"));
        loader.setController(new scene_main.Controller());

        //
        Parent root = loader.load();
        
        //
        Scene scene = new Scene(root);

        //
        Image icon = new Image(getClass().getResourceAsStream("asset/Logo-ITC-PNG.png"));

        //
        stage.getIcons().add(icon);
        stage.setTitle("Microcontroller Shop");
        stage.setScene(scene);
        stage.show();
    }
}