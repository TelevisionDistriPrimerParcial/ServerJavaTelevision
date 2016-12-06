package server.tv.map;
// Generated Dec 5, 2016 10:36:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * FormaPago generated by hbm2java
 */
public class FormaPago  implements java.io.Serializable {


     private int formaPagoCodigo;
     private String formaPagoDetalle;
     private Set pagos = new HashSet(0);

    public FormaPago() {
    }

	
    public FormaPago(int formaPagoCodigo, String formaPagoDetalle) {
        this.formaPagoCodigo = formaPagoCodigo;
        this.formaPagoDetalle = formaPagoDetalle;
    }
    public FormaPago(int formaPagoCodigo, String formaPagoDetalle, Set pagos) {
       this.formaPagoCodigo = formaPagoCodigo;
       this.formaPagoDetalle = formaPagoDetalle;
       this.pagos = pagos;
    }
   
    public int getFormaPagoCodigo() {
        return this.formaPagoCodigo;
    }
    
    public void setFormaPagoCodigo(int formaPagoCodigo) {
        this.formaPagoCodigo = formaPagoCodigo;
    }
    public String getFormaPagoDetalle() {
        return this.formaPagoDetalle;
    }
    
    public void setFormaPagoDetalle(String formaPagoDetalle) {
        this.formaPagoDetalle = formaPagoDetalle;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }




}

