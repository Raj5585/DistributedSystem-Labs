import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObj = new RemoteImplementation();

            // Create the registry and bind the remote object
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/RemoteObject", remoteObj);

            System.out.println("Server started.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
