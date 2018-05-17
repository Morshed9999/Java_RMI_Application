/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
// Creating Remote interface for our application
public interface Hello extends Remote {
 void printMsg() throws RemoteException;
}