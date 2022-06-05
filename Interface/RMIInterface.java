package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote{
  String name(String name) throws RemoteException;
}
