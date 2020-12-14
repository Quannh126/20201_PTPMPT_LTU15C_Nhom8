package Source.Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GameSession extends UnicastRemoteObject implements GameSessionInterface {
    // not sure what this does, but it's required to not give warnings
    private static final long serialVersionUID = 1L;
    private int playersInGame = 0;

    public GameSession() throws RemoteException {

    }

    @Override
    public int getOccupancy() throws RemoteException {
        return playersInGame;
    }

    @Override
    public boolean playerJoin() throws RemoteException {
        if (playersInGame == 0) {
            playersInGame++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void playerExit() throws RemoteException {
        if (playersInGame == 1) {
            playersInGame--;

        } else if (playersInGame == 2) {
            playersInGame--;
        } else {
            playersInGame = 0;
        }

    }

}