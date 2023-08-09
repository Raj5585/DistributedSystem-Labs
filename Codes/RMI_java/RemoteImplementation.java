import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImplementation extends UnicastRemoteObject implements RemoteInterface {
    public RemoteImplementation() throws RemoteException {
        super();
    }

    public void sendMessage(String message) throws RemoteException {
        System.out.println("Server received message: " + message);
    }

    public String receiveMessage() throws RemoteException {
        return "Server response: Message received successfully!";
    }
}
