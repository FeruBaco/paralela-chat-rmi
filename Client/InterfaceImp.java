package Client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import Interface.ClientChat;
import Interface.ServerChat;

public class InterfaceImp extends UnicastRemoteObject implements ClientChat, Runnable{

  ServerChat server;
  public String name = null;

  InterfaceImp(String name, ServerChat server) throws RemoteException {
    this.name = name;
    this.server = server;
    server.register(this);
  }

  @Override
  public void run() {
    Scanner s = new Scanner(System.in);
    String message;

    while (true) {
      message = s.nextLine();
      try {
        server.message(name + " : " + message);
      } catch (Exception  e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void clientMessage(String message) throws RemoteException {
    System.err.println(message);
    
  }
}
