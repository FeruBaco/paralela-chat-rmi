package Server;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
  public static void main(String[] args)   {

    final int PORT = 1005;

    try {
      Registry rmi = LocateRegistry.createRegistry(PORT);

      rmi.rebind("Chat", (Remote) new ChatImp());
      System.out.println("Servidor activo " + PORT);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
