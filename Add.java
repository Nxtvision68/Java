package adder;


import java.rmi.Remote;




   
   

public interface Add<Int> extends Remote {
  public int sum(int x,int y) throws Exception;
  public int  diff(int x,int y) throws Exception;
  public void multi(int x,int y) throws Exception;
      
  } 
