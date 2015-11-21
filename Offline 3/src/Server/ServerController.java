package Server;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.awt.*;


public class ServerController {
    private Main main ;

    @FXML
    private ListView listView ;

    @FXML
    private TextArea textArea ;

    @FXML
    private Button button ;

    public void init(){

        ObservableList<String> names = FXCollections.observableArrayList(
                "Julia", "Ian", "Sue", "Matthew", "Hannah", "Stephan", "Denise");
        listView.setItems(names);
    }

    public void sendOnAction(ActionEvent actionEvent) {
        String serverMassage = textArea.getText() ;
        //listView.getItems().add(serverMassage) ;
        String clientName = (String) listView.getFocusModel().getFocusedItem();
        System.out.println(clientName + " " +serverMassage);
        listView.getItems().remove(clientName);
        textArea.clear();
    }

    public void setMain(Main main) {
        this.main = main ;
    }
}
