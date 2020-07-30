/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apprmiclient;

import apprmi.ISumador;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ajunq
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        // TODO code application logic here
        Registry regiregistry = LocateRegistry.getRegistry("localhost", 8989);
        ISumador suma = (ISumador)regiregistry.lookup("objetoSuma");
        int total = suma.Sumar(10, 30);
        System.out.println("La suma es: " + total);
    }
    
}
