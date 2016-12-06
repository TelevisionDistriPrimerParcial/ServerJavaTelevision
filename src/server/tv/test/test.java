/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package server.tv.test;

import server.tv.db.ServerTvCrud;
import server.tv.map.Empleado;

/**
 *
 * @author Luis
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp = ServerTvCrud.findEmpleadoByUser("test_emp", "123.456");
        System.out.println(">> "+emp.getEmpleadoNombre()+" "+emp.getEmpleadoApellido());
    }
    
}
