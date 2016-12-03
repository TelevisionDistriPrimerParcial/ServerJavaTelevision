package server.tv.map;
// Generated 03-dic-2016 13:57:40 by Hibernate Tools 3.6.0



/**
 * PlanCanalId generated by hbm2java
 */
public class PlanCanalId  implements java.io.Serializable {


     private int planCodigo;
     private int canalCodigo;

    public PlanCanalId() {
    }

    public PlanCanalId(int planCodigo, int canalCodigo) {
       this.planCodigo = planCodigo;
       this.canalCodigo = canalCodigo;
    }
   
    public int getPlanCodigo() {
        return this.planCodigo;
    }
    
    public void setPlanCodigo(int planCodigo) {
        this.planCodigo = planCodigo;
    }
    public int getCanalCodigo() {
        return this.canalCodigo;
    }
    
    public void setCanalCodigo(int canalCodigo) {
        this.canalCodigo = canalCodigo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PlanCanalId) ) return false;
		 PlanCanalId castOther = ( PlanCanalId ) other; 
         
		 return (this.getPlanCodigo()==castOther.getPlanCodigo())
 && (this.getCanalCodigo()==castOther.getCanalCodigo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPlanCodigo();
         result = 37 * result + this.getCanalCodigo();
         return result;
   }   


}


