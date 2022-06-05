package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientChat extends Remote{
  void clientMessage(String message) throws RemoteException;
}
