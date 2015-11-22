package ClientPack;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by MD on 22/11/2015.
 */
public class Client implements Runnable{
    Main main ;
    Socket socket ;
    Thread thread ;
    int port ;
    String userName ;

    Client(int port, String userName , Main main){
        this.main = main ;
        this.userName = userName ;
        this.port = port ;

        thread = new Thread(this) ;
        thread.start();
    }

    public void run(){
        try {
            socket = new Socket("127.0.0.1",port) ;
            main.socket = socket ;
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(userName);
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            String message = (String) inputStream.readObject();
            if (message.length() == 0) message = "No massage!!";
            main.controller.serverText.setText(message);
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
