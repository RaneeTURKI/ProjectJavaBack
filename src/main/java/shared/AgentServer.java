/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shared;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author vpc
 */
public interface AgentServer extends Remote {

    Object send(Data d) throws RemoteException;

}
