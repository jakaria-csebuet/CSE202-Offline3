package Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

/**
 * Created by MD on 21/11/2015.
 */
public class ClientController {
    private Main main ;

    @FXML
     private TextField textField ;

    @FXML
     private Button button ;

    public void setConnect(ActionEvent actionEvent){
        try {
            main.showMassageBox("hi") ;
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void setMain(Main main) {
        this.main = main ;
    }
}
