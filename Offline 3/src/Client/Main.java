package Client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Stage stage ;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage ;
        showConnectPage() ;
    }

    private void showConnectPage() throws Exception{
        FXMLLoader loader = new FXMLLoader() ;
        loader.setLocation(getClass().getResource("client.fxml"));
        Parent root = loader.load();

        ClientController controller = loader.getController() ;
        controller.setMain(this) ;

        stage.setTitle("Client");
        stage.setScene(new Scene(root, 500, 300));
        stage.show();
    }




    public void showMassageBox(String userName) throws Exception{
        FXMLLoader loader = new FXMLLoader() ;
        loader.setLocation(getClass().getResource("massage.fxml"));
        Parent root = loader.load();

        MassageController controller = loader.getController() ;
        //controller.init(userName) ;
        controller.setMain(this) ;

        stage.setTitle("Massage Box");
        stage.setScene(new Scene(root,500,400));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
