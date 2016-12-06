package server.tv.map;
// Generated Dec 5, 2016 10:36:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Plan generated by hbm2java
 */
public class Plan  implements java.io.Serializable {


     private int planCodigo;
     private String planNombre;
     private short planTarifa;
     private int planCantidadCanales;
     private Set canals = new HashSet(0);
     private Set detalleContratos = new HashSet(0);

    public Plan() {
    }

	
    public Plan(int planCodigo, String planNombre, short planTarifa, int planCantidadCanales) {
        this.planCodigo = planCodigo;
        this.planNombre = planNombre;
        this.planTarifa = planTarifa;
        this.planCantidadCanales = planCantidadCanales;
    }
    public Plan(int planCodigo, String planNombre, short planTarifa, int planCantidadCanales, Set canals, Set detalleContratos) {
       this.planCodigo = planCodigo;
       this.planNombre = planNombre;
       this.planTarifa = planTarifa;
       this.planCantidadCanales = planCantidadCanales;
       this.canals = canals;
       this.detalleContratos = detalleContratos;
    }
   
    public int getPlanCodigo() {
        return this.planCodigo;
    }
    
    public void setPlanCodigo(int planCodigo) {
        this.planCodigo = planCodigo;
    }
    public String getPlanNombre() {
        return this.planNombre;
    }
    
    public void setPlanNombre(String planNombre) {
        this.planNombre = planNombre;
    }
    public short getPlanTarifa() {
        return this.planTarifa;
    }
    
    public void setPlanTarifa(short planTarifa) {
        this.planTarifa = planTarifa;
    }
    public int getPlanCantidadCanales() {
        return this.planCantidadCanales;
    }
    
    public void setPlanCantidadCanales(int planCantidadCanales) {
        this.planCantidadCanales = planCantidadCanales;
    }
    public Set getCanals() {
        return this.canals;
    }
    
    public void setCanals(Set canals) {
        this.canals = canals;
    }
    public Set getDetalleContratos() {
        return this.detalleContratos;
    }
    
    public void setDetalleContratos(Set detalleContratos) {
        this.detalleContratos = detalleContratos;
    }




}


