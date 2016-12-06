package server.tv.map;
// Generated Dec 5, 2016 10:36:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ServicioAdicional generated by hbm2java
 */
public class ServicioAdicional  implements java.io.Serializable {


     private int servicioAdicionalCodigo;
     private String servicioAdicionalDetalle;
     private short servicioAdicionalCosto;
     private Set ticketServicios = new HashSet(0);

    public ServicioAdicional() {
    }

	
    public ServicioAdicional(int servicioAdicionalCodigo, String servicioAdicionalDetalle, short servicioAdicionalCosto) {
        this.servicioAdicionalCodigo = servicioAdicionalCodigo;
        this.servicioAdicionalDetalle = servicioAdicionalDetalle;
        this.servicioAdicionalCosto = servicioAdicionalCosto;
    }
    public ServicioAdicional(int servicioAdicionalCodigo, String servicioAdicionalDetalle, short servicioAdicionalCosto, Set ticketServicios) {
       this.servicioAdicionalCodigo = servicioAdicionalCodigo;
       this.servicioAdicionalDetalle = servicioAdicionalDetalle;
       this.servicioAdicionalCosto = servicioAdicionalCosto;
       this.ticketServicios = ticketServicios;
    }
   
    public int getServicioAdicionalCodigo() {
        return this.servicioAdicionalCodigo;
    }
    
    public void setServicioAdicionalCodigo(int servicioAdicionalCodigo) {
        this.servicioAdicionalCodigo = servicioAdicionalCodigo;
    }
    public String getServicioAdicionalDetalle() {
        return this.servicioAdicionalDetalle;
    }
    
    public void setServicioAdicionalDetalle(String servicioAdicionalDetalle) {
        this.servicioAdicionalDetalle = servicioAdicionalDetalle;
    }
    public short getServicioAdicionalCosto() {
        return this.servicioAdicionalCosto;
    }
    
    public void setServicioAdicionalCosto(short servicioAdicionalCosto) {
        this.servicioAdicionalCosto = servicioAdicionalCosto;
    }
    public Set getTicketServicios() {
        return this.ticketServicios;
    }
    
    public void setTicketServicios(Set ticketServicios) {
        this.ticketServicios = ticketServicios;
    }




}


