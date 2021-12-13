/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;


import static java.lang.Boolean.TRUE;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import shared.AgentServer;
import shared.Data;

/**
 *
 * @author vpc
 */
public class AgentServerImpl extends UnicastRemoteObject
        implements AgentServer {


    public AgentServerImpl() throws RemoteException {
    }

    @Override
    public Object send(Data d) throws RemoteException {
            System.out.println("*************"+d.sendReg()+"***************");
           System.out.println("*************"+d.sendpluv()+"***************");
            return TRUE;

    }

 

}
