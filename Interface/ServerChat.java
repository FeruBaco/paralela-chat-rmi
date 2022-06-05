package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerChat extends Remote{
  void register(ClientChat client) throws RemoteException;
  void message(String message) throws RemoteException;
}
