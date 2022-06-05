package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Interface.ClientChat;
import Interface.ServerChat;

public class ChatImp extends UnicastRemoteObject implements ServerChat{

  public ArrayList<ClientChat> clients;

  public ChatImp() throws RemoteException {
    clients = new ArrayList<ClientChat>();
  }

  @Override
  public void register(ClientChat client) throws RemoteException {
    this.clients.add(client);
    
  }

  @Override
  public void message(String message) throws RemoteException {
    int a = 0;
    while (a < clients.size()) {
      clients.get(a++).clientMessage(message);
    }
  }
}
