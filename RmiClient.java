package adder;

import adder.Add;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RmiClient {

    
    public static void main(String[] args) {
        try {
            Registry myreg = LocateRegistry.getRegistry("localhost",3002);
            Add a =(Add)myreg.lookup("MyAdder");
            int A = a.sum(4, 5);
            System.out.println(A);
            System.out.println(a.diff(4, 5));
           
        } catch (RemoteException ex) {
            Logger.getLogger(RmiClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(RmiClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}


