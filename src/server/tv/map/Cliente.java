package server.tv.map;
// Generated Dec 5, 2016 10:36:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int clienteCodigo;
     private int usuarioCodigo;
     private String clienteNombre;
     private String clienteApellido;
     private String clienteTelefono;
     private String clienteCedula;
     private String clienteEmail;
     private String clienteCiudad;
     private String clienteDireccion;
     private Set contratos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int clienteCodigo, int usuarioCodigo, String clienteNombre, String clienteApellido, String clienteTelefono, String clienteCedula, String clienteEmail, String clienteCiudad, String clienteDireccion) {
        this.clienteCodigo = clienteCodigo;
        this.usuarioCodigo = usuarioCodigo;
        this.clienteNombre = clienteNombre;
        this.clienteApellido = clienteApellido;
        this.clienteTelefono = clienteTelefono;
        this.clienteCedula = clienteCedula;
        this.clienteEmail = clienteEmail;
        this.clienteCiudad = clienteCiudad;
        this.clienteDireccion = clienteDireccion;
    }
    public Cliente(int clienteCodigo, int usuarioCodigo, String clienteNombre, String clienteApellido, String clienteTelefono, String clienteCedula, String clienteEmail, String clienteCiudad, String clienteDireccion, Set contratos) {
       this.clienteCodigo = clienteCodigo;
       this.usuarioCodigo = usuarioCodigo;
       this.clienteNombre = clienteNombre;
       this.clienteApellido = clienteApellido;
       this.clienteTelefono = clienteTelefono;
       this.clienteCedula = clienteCedula;
       this.clienteEmail = clienteEmail;
       this.clienteCiudad = clienteCiudad;
       this.clienteDireccion = clienteDireccion;
       this.contratos = contratos;
    }
   
    public int getClienteCodigo() {
        return this.clienteCodigo;
    }
    
    public void setClienteCodigo(int clienteCodigo) {
        this.clienteCodigo = clienteCodigo;
    }
    public int getUsuarioCodigo() {
        return this.usuarioCodigo;
    }
    
    public void setUsuarioCodigo(int usuarioCodigo) {
        this.usuarioCodigo = usuarioCodigo;
    }
    public String getClienteNombre() {
        return this.clienteNombre;
    }
    
    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }
    public String getClienteApellido() {
        return this.clienteApellido;
    }
    
    public void setClienteApellido(String clienteApellido) {
        this.clienteApellido = clienteApellido;
    }
    public String getClienteTelefono() {
        return this.clienteTelefono;
    }
    
    public void setClienteTelefono(String clienteTelefono) {
        this.clienteTelefono = clienteTelefono;
    }
    public String getClienteCedula() {
        return this.clienteCedula;
    }
    
    public void setClienteCedula(String clienteCedula) {
        this.clienteCedula = clienteCedula;
    }
    public String getClienteEmail() {
        return this.clienteEmail;
    }
    
    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }
    public String getClienteCiudad() {
        return this.clienteCiudad;
    }
    
    public void setClienteCiudad(String clienteCiudad) {
        this.clienteCiudad = clienteCiudad;
    }
    public String getClienteDireccion() {
        return this.clienteDireccion;
    }
    
    public void setClienteDireccion(String clienteDireccion) {
        this.clienteDireccion = clienteDireccion;
    }
    public Set getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set contratos) {
        this.contratos = contratos;
    }




}


