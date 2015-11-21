package Client;

import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Created by MD on 21/11/2015.
 */
public class MassageController {
    private Main main ;

    @FXML
    private  TextArea  serverText ;

    public void init(String userName) {
        serverText.setText("Hi " + userName);
    }

    public void setMain(Main main) {
        this.main = main ;
    }

}