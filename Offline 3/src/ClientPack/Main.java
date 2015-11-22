package ClientPack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.Socket;

public class Main extends Application {
    Stage stage ;
    Parent parent ;
    MassageController controller ;
    Socket socket ;

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
        parent = root ;

        MassageController controller = loader.getController() ;
        //controller.init(userName) ;
        this.controller = controller ;
        controller.setMain(this,socket) ;

        stage.setTitle("Massage Box");
        stage.setScene(new Scene(root, 500, 330));
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);

    }
}
