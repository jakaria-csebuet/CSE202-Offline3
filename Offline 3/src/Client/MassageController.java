package Client;

import javafx.fxml.FXML;

import java.awt.*;

/**
 * Created by MD on 21/11/2015.
 */
public class MassageController {
    private Main main ;

    @FXML
    private TextArea serveText ;

    public void init(String userName) {
        serveText.append(userName);
    }

    public void setMain(Main main) {
        this.main = main ;
    }

}
