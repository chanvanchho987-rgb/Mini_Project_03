import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader();

        Parent root = loader.load(getClass().getResource("view.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        
        stage.setTitle("Mini Project 3");

        //stage.getIcons().add(new Image(getClass().getResourceAsStream("pic\\itc-cambodia.jpg")));  
        stage.show();
        
        
    }   
}


