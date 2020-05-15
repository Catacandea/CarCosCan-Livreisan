package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button1;
    Stage window;
    Scene scene1;
    Scene scene2;

    public Main() {
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        StackPane layout2 = new StackPane();
        this.scene2 = new Scene(layout2, 700.0D, 500.0D);
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("HomePage.fxml"));
        primaryStage.setTitle("CarCosCân Livreișăn");
        primaryStage.setScene(new Scene(root, 500.0D, 500.0D));
        primaryStage.show();
    }
}
