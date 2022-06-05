package Server;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
  public static void main(String[] args)   {
    try {
      Registry rmi = LocateRegistry.createRegistry(1005);

      rmi.rebind("Chat", (Remote) new ChatImp());
      System.out.println("Servidor activo");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
