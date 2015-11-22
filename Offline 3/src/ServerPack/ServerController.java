package ServerPack;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.util.Hashtable;


public class ServerController {
    private Main main ;

    public Hashtable<String, Thread> list = new Hashtable<>();

    @FXML
    protected ListView listView ;

    @FXML
    protected TextArea textArea ;

    @FXML
    private Button button ;

    public void init(){

        ObservableList<String> names = FXCollections.observableArrayList(
                "Julia", "Ian", "Sue", "Matthew", "Hannah", "Stephan", "Denise");
        listView.setItems(names);
    }

    public void addItem(String userName){
        listView.getItems().add(userName) ;
    }

    public void sendOnAction(ActionEvent actionEvent) {
        String clientName = (String) listView.getFocusModel().getFocusedItem();
        Thread thread = list.get(clientName) ;
        thread.start();
    }

    public void setMain(Main main) {
        this.main = main ;
    }
}
