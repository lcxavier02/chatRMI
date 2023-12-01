package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextArea;

public class Server extends UnicastRemoteObject implements Service {
    private Map<String, CallbackC> clients;

    public Server() throws RemoteException {
        clients = new HashMap<>();
    }

    @Override
    public void registerClient(CallbackC client, String username) throws RemoteException {
        clients.put(username, client);
        broadcastMessage(username + " has joined the chat.");
    }

    private String getClientUsername(CallbackC client) throws RemoteException {
    return client.getUsername();
}

    @Override
    public void unregisterClient(CallbackC client) throws RemoteException {
        String username = getClientUsername(client);
        clients.remove(username);
    }

    @Override
    public void broadcastMessage(String message) throws RemoteException {
        for (CallbackC client : clients.values()) {
            client.receiveMessage(message);
        }
    }

    @Override
    public void sendDirectMessage(String sender, String receiver, String message) throws RemoteException {
        CallbackC client = clients.get(receiver);

        if (client != null) {
            client.receiveMessage("-- Private message from " + sender + " --: " + message);
        }
    }
    
    public void connection(String Ip){
            try {
                Service chatService = new Server();

                LocateRegistry.createRegistry(9000);
                
                java.rmi.Naming.rebind("rmi://"+Ip+":9000/ChatService", chatService);
 
                System.out.println("Chat server ready.");
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
    

    public static void main(String[] args) {
            try {
                Service chatService = new Server();

                LocateRegistry.createRegistry(9000);

                java.rmi.Naming.rebind("rmi://localhost:9000/ChatService", chatService);
                
                System.out.println("Chat server ready.");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
