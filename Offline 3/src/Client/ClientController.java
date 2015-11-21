package Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

/**
 * Created by MD on 21/11/2015.
 */
public class ClientController {
    private Main main ;

    @FXML
    private TextField textField ;

    @FXML
    private  Button connect ;


    public void setConnect(ActionEvent actionEvent){
        String userName = textField.getText() ;
        System.out.println(userName);
        try {
            main.showMassageBox(userName) ;
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void setMain(Main main) {
        this.main = main ;
    }
}
