
package primerproyecto;

/**
 *
 * @author Hristo Prashtakov
 * @version 1.0 Creacion de las primeras variables  y de su constructor.
 * @since 28-05-2016
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

   
}//Final clase empleado
