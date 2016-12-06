/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.tv.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import server.tv.map.Empleado;
import server.tv.map.RolEmpleado;
import server.tv.map.Usuario;

/**
 *
 * @author Luis
 */
public class ServerTvCrud {

    /*
    select emp.EMPLEADO_NOMBRE, emp.EMPLEADO_APELLIDO 
    from dbTelevision.EMPLEADO as emp 
    where emp.USUARIO_CODIGO = ( 
    select us.USUARIO_CODIGO 
    from dbTelevision.USUARIO as us 
    where us.USUARIO_NOMBRE = 'test_emp' 
    and us.USUARIO_CLAVE = '123.456');
     */
    public static Empleado findEmpleadoByUser(String USUARIO_NOMBRE, String USUARIO_CLAVE) {
        Empleado person = null;
        String SELECT = "select * "
                + "from EMPLEADO as emp "
                + "where emp.USUARIO_CODIGO = ( "
                + "select us.USUARIO_CODIGO "
                + "from USUARIO as us "
                + "where us.USUARIO_NOMBRE = '" + USUARIO_NOMBRE + "' "
                + "and us.USUARIO_CLAVE = '" + USUARIO_CLAVE + "')";
        ConnectionMysql con = new ConnectionMysql();
        ArrayList<Empleado> Personas = new ArrayList<>();
        try {

            ResultSet rt = con.consultar(SELECT);
            Empleado prb = new Empleado();
            if (rt != null) {
                while (rt.next()) {
                    prb.setEmpleadoCodigo(rt.getInt(1));
                    prb.setUsuario(new Usuario(rt.getInt(2), USUARIO_NOMBRE, USUARIO_CLAVE));
                    prb.setRolEmpleado(new RolEmpleado(rt.getInt(3), ""));
                    prb.setEmpleadoNombre(rt.getString(4));
                    prb.setEmpleadoApellido(rt.getString(5));
                    Personas.add(prb);
                }
            }
            if (!Personas.isEmpty()) {
                person = Personas.get(0);
                con.CloseConnection();
            }
        } catch (SQLException ex) {
        } catch (Exception ex) {
            throw ex;
        }
        return person;
    }
}
