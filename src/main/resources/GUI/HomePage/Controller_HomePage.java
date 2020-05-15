package GUI.HomePage;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_HomePage {

    public void SignInButtonClicked(ActionEvent event) throws IOException {
        Parent SignInView = FXMLLoader.load(getClass().getResource("../SignIn/SignIn.fxml"));
        Scene SignInViewScene = new Scene(SignInView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(SignInViewScene);
        window.show();
    }

    public void RegisterButoonClicked(ActionEvent event) throws IOException
    {
        Parent RegisterView = FXMLLoader.load(getClass().getResource("../Register/Register.fxml"));
        Scene RegisterScene = new Scene(RegisterView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(RegisterScene);
        window.show();
    }

    public void AboutItButoonClicked(ActionEvent event) throws IOException
    {
        Parent AboutItView = FXMLLoader.load(getClass().getResource("AboutIt.fxml"));
        Scene AboutItScene = new Scene(AboutItView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(AboutItScene);
        window.show();
    }
    public void BackHomeViewButoonClicked(ActionEvent event) throws IOException
    {
        Parent HomePageView = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene HomePageScene = new Scene(HomePageView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(HomePageScene);
        window.show();
    }


}
