/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import run.Main;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vpc
 */
public class ServerMain {

    public static void main(String[] args) {
        System.out.println("run Master...");
        try {
            final Registry reg = LocateRegistry.createRegistry(9999);
            reg.bind("server", new AgentServerImpl());
            Object o = new Object();
            synchronized (o) {
                o.wait();
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
