package adder;
import adder.AddRemote;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RmiServer {

    
    public static void main(String[] args) {
        try {
        	
            Registry reg = LocateRegistry.createRegistry(3003);
            AddRemote Ar = new AddRemote();
            reg.bind("Myadder", Ar);
            System.out.println("server is ready");
            } 
        catch (RemoteException ex) {
            Logger.getLogger(RmiServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(RmiServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}