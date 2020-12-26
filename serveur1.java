import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}

    public String sayHello() {
        return "Hello World !!";
    }
    public class CompteBancaire()
    {
    float s ;
    public CompteBancaire(float s)
    {
    this.s=s;
    }
     public CompteBancaire debiter(float x)
    {
    if (solde<x)
    return "solde inférieuré ;
    else
    {solde=solde-x;
    return "solde débité";}
    
    }
     public CompteBancaire crediter(float x)
    {
    return s+x;
    }
    
    public float lireSolde()
    {return "votre solde courant est"+s;}
    }
   

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
