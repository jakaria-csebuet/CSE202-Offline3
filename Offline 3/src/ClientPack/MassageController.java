package ClientPack;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.net.Socket;

/**
 * Created by MD on 21/11/2015.
 */
public class MassageController {
    private Main main ;
    private Socket socket ;

    @FXML
    protected TextArea  serverText ;

    public void init(String userName) {
        serverText.setText("Hi " + userName);
    }



    public void setMain(Main main,Socket socket) {
        this.main = main ;
        this.socket = socket ;
    }

}