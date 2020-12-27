import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public String sayHello() {
        return "Hello World !!";
    }
  
   
     public String debiter(float x)
    {
    if (solde<x)
    return "solde inférieuré ;
    else
    {solde=solde-x;
    return "solde débité";}
    }
    
     public double crediter(float x)
    {
    return solde+x;
    }
    
    public String lireSolde()
    {return "votre solde courant est"+solde;}
    }
   

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
