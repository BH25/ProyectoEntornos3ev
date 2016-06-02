
package primerproyecto;

/**
 *
 * @author Hristo Prashtakov
 * @version 2.0 añadimos gets y sets
 * @since 01-06-2016
 */
public class Empleado {

    /**
     * @return the salarioBase
     */
    public static int getSalarioBase() {
        return salarioBase;
    }//Final metodo getSalarioBase.
    
    private String nombre;
    private double plus;
    private int nHijos;
    private static int salarioBase;
    
  public Empleado(String nombre, double plus,int nHijos){
      this.nombre = nombre;
      this.plus = plus;
      this.nHijos = nHijos;

  }//Constructor Empleado
  
   public static void setSalarioBase(int aSalarioBase) {
        salarioBase = aSalarioBase;
   }//setSalarioBase

   /**
     * @return del  nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the plus
     */
    public double getPlus() {
        return plus;
    }

    /**
     * @param plus the plus to set
     */
    public void setPlus(double plus) {
        this.plus = plus;
    }

    /**
     * @return the nHijos
     */
    public int getnHijos() {
        return nHijos;
    }

    /**
     * @param nHijos the nHijos to set
     */
    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }
}//Final clase empleado
