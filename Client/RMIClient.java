package Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import Interface.RMIInterface;
import Interface.ServerChat;

public class RMIClient {

  public static void main(String[] args) {
    try {
      String name = JOptionPane.showInputDialog("Ingresa tu nombhre");
      String nom = name;
      Registry registry = LocateRegistry.getRegistry("localhost", 1005);

      //USER
      // RMIInterface rmiInterface = (RMIInterface) registry.lookup("Usuario");
      // System.out.println("Nombre es: " + rmiInterface.name(nom));

      // CHAT
      ServerChat server = (ServerChat) registry.lookup("Chat");
      new Thread(new InterfaceImp(nom, server)).start();

    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
  
}
