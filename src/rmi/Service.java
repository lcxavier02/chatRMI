package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.JTextArea;

public interface Service extends Remote {
    void registerClient(CallbackC client, String username) throws RemoteException;
    void unregisterClient(CallbackC client) throws RemoteException;
    void broadcastMessage(String message) throws RemoteException;
    void sendDirectMessage(String sender, String receiver, String message) throws RemoteException;
}
