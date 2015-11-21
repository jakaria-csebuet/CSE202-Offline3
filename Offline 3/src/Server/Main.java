package Server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    Stage stage ;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage ;
        showServerPage() ;
    }

    private void showServerPage() throws IOException {
        FXMLLoader loader = new FXMLLoader() ;
        loader.setLocation(getClass().getResource("server.fxml"));
        Parent root = loader.load();

        ServerController controller = loader.getController() ;
        controller.init();
        controller.setMain(this) ;

        stage.setTitle("Server");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
