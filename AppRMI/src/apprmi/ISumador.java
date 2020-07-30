/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apprmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ajunq
 */

// entiende de remote
public interface ISumador extends Remote{
    public int Sumar(int numeroA, int numeroB) throws RemoteException;
}
