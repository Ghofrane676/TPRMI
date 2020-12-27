import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    
   double crediter(float x)throws RemoteException;
    String debiter(float x)throws RemoteException;
    String lireSolde()throws RemoteException;
}
