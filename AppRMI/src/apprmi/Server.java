/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apprmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ajunq
 */
public class Server extends UnicastRemoteObject implements ISumador {

    public Server() throws RemoteException {
        super();
    }

    public static void main(String[] args) throws RemoteException {
        // publicar, puerto,
        Registry regiregistry = LocateRegistry.createRegistry(8989);
        regiregistry.rebind("objetoSuma", new Server());
        System.out.println("El servidor esta listo...");
    }

    @Override
    public int Sumar(int numeroA, int numeroB) throws RemoteException {
        return numeroA + numeroB;
    }

}
