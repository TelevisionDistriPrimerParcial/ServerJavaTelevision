/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.tv.start;

import java.net.ServerSocket;
import server.tv.socket.ServidorCliente;

/**
 *
 * @author hendrix
 */
public class ServidorMultiple {
    
    public static void main(String args[]) {
        System.out.println("Servidor de multiples clientes");
        
        try {
            ServerSocket sc = new ServerSocket(667);
            while (true) {
                ServidorCliente cliente = new ServidorCliente(sc.accept());
                cliente.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
