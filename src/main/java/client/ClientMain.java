/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import run.Main;
import java.rmi.registry.LocateRegistry;
 import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import shared.AgentServer;
import shared.Data;

/**
 *
 * @author vpc
 */
public class ClientMain {

    public static void main(String[] args) {
        Data d = new MyData(20.0, -20.0, 80.0, "bizerte") ;
        System.out.println("run Client...");
        try {
            final Registry reg = LocateRegistry.getRegistry("localhost", 9999);
            AgentServer server = (AgentServer) reg.lookup("server");
            System.out.println("send request");
            
            final Object r= server.send(d);
          //  final Object r = master.eval(new MyMapper(".", "eniso"), new MyReducer());
                 
       System.out.println("received response : " + r);
        } catch (Exception ex) {
        } 
    }

}
