package GUI.SupplyCompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_SupplyCompanyPage {

    public void LogOutButtonClicked(ActionEvent event) throws IOException {
        Parent LogOutView = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene LogOutScene = new Scene(LogOutView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        //window.setScene(LogOutScene);
        //window.show();
        window.close();
    }
}
