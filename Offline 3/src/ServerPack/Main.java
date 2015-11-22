package ServerPack;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    Stage stage ;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage ;
        showServerPage() ;
    }

    private void showServerPage() throws Exception {
        FXMLLoader loader = new FXMLLoader() ;
        loader.setLocation(getClass().getResource("server.fxml"));
        Parent root = loader.load();

        ServerController controller = loader.getController() ;
        Server server = new Server(33333,controller) ;
        controller.setMain(this) ;

        stage.setTitle("ServerPack");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
         //new Server();

    }


    public static void main(String[]args) {
        launch(args);
    }

}
