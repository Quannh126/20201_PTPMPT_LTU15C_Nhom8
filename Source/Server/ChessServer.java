package Source.Server;

import java.rmi.registry.*;

public class ChessServer {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        if (hostGames()) {

        } else {

        }
    }

    public static boolean hostGames() {
        boolean success = false;
        try {
            // create GameSession objects to host
            GameSession sesh1 = new GameSession();
            GameSession sesh2 = new GameSession();
            GameSession sesh3 = new GameSession();

            // Create 3 registry objects for each session
            Registry registry1;
            Registry registry2;
            Registry registry3;
            // registry = LocateRegistry.getRegistry();

            // Start up the registries
            registry1 = LocateRegistry.createRegistry(4300);
            System.out.println("registry1 created at port 4200");
            registry2 = LocateRegistry.createRegistry(4301);
            System.out.println("registry2 created at port 4201");
            registry3 = LocateRegistry.createRegistry(4302);
            System.out.println("registry2 created at port 4202");

            // Bind each Session with a registry and give it a name
            registry1.rebind("Session1", sesh1);
            // server.lab2.setText("Sesh1 up and running");
            registry2.rebind("Session2", sesh2);
            // server.lab3.setText("Sesh2 up and running");
            registry3.rebind("Session3", sesh3);
            // server.lab4.setText("Sesh3 up and running");
            success = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return success;
    }
}