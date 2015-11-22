package ServerPack;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by MD on 22/11/2015.
 */
public class Server implements Runnable{
    ServerController controller ;
    ServerSocket serverSocket ;
    int port ;
    Thread thread ;

    Server(int port, ServerController controller){
        this.controller = controller ;
        this.port = port ;
        thread = new Thread(this) ;
        thread.start();
    }
    public void run(){
        try {
            serverSocket = new ServerSocket(port) ;
            while(true) {
                Socket socket = serverSocket.accept();
                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                String clientName = (String) inputStream.readObject();
                ServerAction serverAction = new ServerAction(socket, controller, clientName);

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
