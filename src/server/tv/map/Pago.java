package server.tv.map;
// Generated Dec 5, 2016 10:36:11 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pago generated by hbm2java
 */
public class Pago  implements java.io.Serializable {


     private int pagoCodigo;
     private Factura factura;
     private FormaPago formaPago;
     private Date pagoFecha;

    public Pago() {
    }

	
    public Pago(int pagoCodigo, Date pagoFecha) {
        this.pagoCodigo = pagoCodigo;
        this.pagoFecha = pagoFecha;
    }
    public Pago(int pagoCodigo, Factura factura, FormaPago formaPago, Date pagoFecha) {
       this.pagoCodigo = pagoCodigo;
       this.factura = factura;
       this.formaPago = formaPago;
       this.pagoFecha = pagoFecha;
    }
   
    public int getPagoCodigo() {
        return this.pagoCodigo;
    }
    
    public void setPagoCodigo(int pagoCodigo) {
        this.pagoCodigo = pagoCodigo;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public FormaPago getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
    public Date getPagoFecha() {
        return this.pagoFecha;
    }
    
    public void setPagoFecha(Date pagoFecha) {
        this.pagoFecha = pagoFecha;
    }




}

