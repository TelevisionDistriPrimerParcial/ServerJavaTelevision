package server.tv.map;
// Generated 03-dic-2016 13:57:40 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private Integer facturaCodigo;
     private int contratoCodigo;
     private Date facturaFecha;

    public Factura() {
    }

    public Factura(int contratoCodigo, Date facturaFecha) {
       this.contratoCodigo = contratoCodigo;
       this.facturaFecha = facturaFecha;
    }
   
    public Integer getFacturaCodigo() {
        return this.facturaCodigo;
    }
    
    public void setFacturaCodigo(Integer facturaCodigo) {
        this.facturaCodigo = facturaCodigo;
    }
    public int getContratoCodigo() {
        return this.contratoCodigo;
    }
    
    public void setContratoCodigo(int contratoCodigo) {
        this.contratoCodigo = contratoCodigo;
    }
    public Date getFacturaFecha() {
        return this.facturaFecha;
    }
    
    public void setFacturaFecha(Date facturaFecha) {
        this.facturaFecha = facturaFecha;
    }




}

