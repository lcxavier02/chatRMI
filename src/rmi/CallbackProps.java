package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class CallbackProps extends UnicastRemoteObject implements CallbackC {
    private final String username;
    private final JTextArea jTextArea;

    public CallbackProps(String username,  JTextArea jTextArea) throws RemoteException {
        this.username = username;
        this.jTextArea = jTextArea;
    }

    @Override
    public void receiveMessage(String message) throws RemoteException {
        SwingUtilities.invokeLater(() -> {
            if (jTextArea != null) {
                jTextArea.append(message + "\n");
            } else {
                System.out.println("JTextArea not set for user: " + username);
            }
        });
    }


    @Override
    public String getUsername() throws RemoteException {
        return username;
    }
}

