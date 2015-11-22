package ClientPack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
        Client client = new Client(33333,userName,main) ;
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
