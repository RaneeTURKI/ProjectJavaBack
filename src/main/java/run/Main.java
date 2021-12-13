/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import client.ClientMain;
import server.ServerMain;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vpc
 */
public class Main {

    public static void main(String[] args) {

        if (Arrays.stream(args).anyMatch(x -> x.equals("all"))) {
            runAll();

        } else if (Arrays.stream(args).anyMatch(x -> x.equals("master"))) {
            runMaster();
        
        } else if (Arrays.stream(args).anyMatch(x -> x.equals("client"))) {
            runClient();
        } else {
            runAll();
        }
    }

    private static void runAll() {
        try {
            new Thread(() -> runMaster()).start();
            Thread.sleep(1000);
            
            new Thread(() -> runClient()).start();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void runMaster() {
        ServerMain.main(new String[0]);
    }

   

    private static void runClient() {
        ClientMain.main(new String[0]);
    }
}
