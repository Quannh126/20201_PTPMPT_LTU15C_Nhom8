package Source.Server;

import java.rmi.*;

public interface GameSessionInterface extends Remote {
    public int getOccupancy() throws RemoteException;

    public boolean playerJoin() throws RemoteException;

    public void playerExit() throws RemoteException;
}
