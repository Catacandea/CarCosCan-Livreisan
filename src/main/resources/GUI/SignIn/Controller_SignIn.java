package GUI.SignIn;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller_SignIn {

    public void BackHomeViewButoonClicked(ActionEvent event) throws IOException
    {
        Parent HomePageView = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene HomePageScene = new Scene(HomePageView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(HomePageScene);
        window.show();
    }

    public void HomePageCustomer(ActionEvent event) throws IOException
    {
        Parent CustomerHomePageView = FXMLLoader.load(getClass().getResource("CustomerHomePage.fxml"));
        Scene CustomerHomePageScene = new Scene(CustomerHomePageView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(CustomerHomePageScene);
        window.show();
    }

    public void HomePageSupply(ActionEvent event) throws IOException
    {
        Parent SupplyHomePageView = FXMLLoader.load(getClass().getResource("SupplyCompanyHomePage.fxml"));
        Scene SupplyHomePageScene = new Scene(SupplyHomePageView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(SupplyHomePageScene);
        window.show();
    }

    public void HomePageDelivery(ActionEvent event) throws IOException
    {
        Parent DeliveryHomePageView = FXMLLoader.load(getClass().getResource("DeliveryCompanyHomePage.fxml"));
        Scene DeliveryHomePageScene = new Scene(DeliveryHomePageView);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(DeliveryHomePageScene);
        window.show();
    }
}
