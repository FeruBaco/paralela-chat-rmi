package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Interface.RMIInterface;

public class InterfaceImp extends UnicastRemoteObject implements RMIInterface {
  public InterfaceImp() throws RemoteException {
    super();
  }

  @Override
  public String name(String name) throws RemoteException {
    return name;
  }
}