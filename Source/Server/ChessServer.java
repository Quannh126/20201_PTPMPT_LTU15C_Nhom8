package Source.Server;

import java.rmi.registry.*;

public class ChessServer {

    public static void main(String[] args) {
        // server = new ChessServer();
        if (hostGames()) {
            System.out.println("\n...Hosting successful!");
        } else {
            System.out.println("\n...Hosting Failed!");
        }
    }

    public static boolean hostGames() {
        boolean success = false;
        try {
            // create GameSession objects to host
            GameSession sesh = new GameSession();

            // Create 3 registry objects for each session
            Registry registry;

            registry = LocateRegistry.getRegistry();

            // Start up the registries
            registry = LocateRegistry.createRegistry(4200);
            System.out.println("registry1 created at port 4200");

            // Bind each Session with a registry and give it a name
            registry.rebind("Session1", sesh);
            System.out.println("Sesh up and running");

            success = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return success;
    }
}