/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.tv.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author hendrix
 */
public class ServidorCliente extends Thread{
    
    private Socket socket;
    private BufferedReader input;
    private PrintWriter output ;
    
    public ServidorCliente(Socket socket) {
        try {
            System.out.println("Nuevo cliente agregado...."+socket.getRemoteSocketAddress());
            this.socket = socket;
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
        } catch (Exception e) {
            System.err.println("Error...");
        }
    }

    @Override
    public void run() {
        try {
            String data="";
            while ((data = input.readLine()) != null) {
                System.out.println("Mensaje Recibido: "+data);
                StringBuilder sb = new StringBuilder(data);
                output.println(sb.reverse());
                if ("exit".equals(data)) {
                    break;
                }
            }
            System.out.println("Fin Cliente.");
            this.socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
