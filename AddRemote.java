package adder;


import java.rmi.*;  
import java.rmi.server.*;

import adder.Add;
public class AddRemote extends UnicastRemoteObject implements Add<Object>{  
protected AddRemote() throws RemoteException {
		super();
	
	}



	private static final long serialVersionUID = 5878030637628548195L;
public void AdderRemote()throws RemoteException{  
  
}  
 

    
    public int sum(int x, int y) throws Exception {
        int z = x+y;
		return z;
    }

    
    public int diff(int x, int y)throws Exception {
        int w = x-y;
		return w;
      
 
    } 
    public void multi(int x, int y) throws Exception{
        int s = x*y;
       
    }
}  
