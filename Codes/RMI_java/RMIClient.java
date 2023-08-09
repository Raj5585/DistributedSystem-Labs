import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObj = (RemoteInterface) Naming.lookup("rmi://localhost/RemoteObject");

            String message = "Hello, server!";
            remoteObj.sendMessage(message);

            String response = remoteObj.receiveMessage();
            System.out.println("Received from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
