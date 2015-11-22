package ServerPack;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;

/**
 * Created by MD on 22/11/2015.
 */
public class ServerAction implements Runnable{
    Socket socket ;
    ServerController controller ;
    Thread thread ;
    String clientName ;

    static ObservableList<String> observableList = FXCollections.observableArrayList();
    ServerAction(Socket socket,ServerController controller,String clientName){
        this.controller = controller ;
        this.socket = socket ;
        thread = new Thread(this) ;
        this.clientName = clientName ;

        observableList.add(clientName) ;
        controller.list.put(clientName,thread) ;
        controller.listView.setItems(observableList);

    }

    public void run(){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(controller.textArea.getText());
            controller.textArea.clear();
            socket.close();
            controller.list.remove(clientName);
            Platform.runLater(()->observableList.remove(clientName));
            controller.listView.setItems(observableList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
