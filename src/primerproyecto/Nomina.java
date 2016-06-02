
package primerproyecto;

/**
 *
 * @author Hristo Prashtakov
 * @version 1.0 Implementación de las primeras variables
 * @since 01-06-2016
 */
public class Nomina {
    static final double SALARIO_MINIMO = 600,AYUDA = 100;
    static final float IRPF_MAX = 24f, IRPF_MIN = 9f;
    
  public  static void nominaCal(String nombre, int nHijos, double plus){
      float irpf;
      double extraordinaria=0;
      double ayudaTotal=0;
      double irpfFinal;
        
      System.out.printf("%40s", "NOMINA\n");
      
      System.out.printf("Fecha: ");
      Pantalla.miFecha.muestraFecha();
      
      System.out.println("");   
      
      System.out.printf("Empleado: " + nombre + " Numero Hijos: " + nHijos);
      
      System.out.println(""); 
      
      System.out.printf("%40s","Salario Base: ");
      System.out.println("\t" + Empleado.getSalarioBase());
      System.out.printf("%40s","Plus: ");
      System.out.println("\t" + plus);
      if((Empleado.getSalarioBase()+plus+extraordinaria+ayudaTotal) < SALARIO_MINIMO){
           irpf = IRPF_MIN;
       }else {irpf = IRPF_MAX;}
       
        irpf=(irpf-nHijos);
        if (irpf<1){irpf=1;}
        
         if (Pantalla.miFecha.mes==6 || Pantalla.miFecha.mes==12){
            System.out.printf("%40s", "Extraordinaria:");
            extraordinaria=Empleado.getSalarioBase();
            System.out.println("\t" + extraordinaria);
        }//Fin del if para Extraordinaria
       
       if (Pantalla.miFecha.mes==9) {
           System.out.printf("%40s", "Ayuda por hijos:");
            ayudaTotal=AYUDA*nHijos;
            System.out.println("\t" + ayudaTotal);   
       }//Fin del if para ayudas hijos
       
       
      System.out.printf("%40s", irpf + "% de IRPF: ");
      irpfFinal=((Empleado.getSalarioBase()+plus+extraordinaria+ayudaTotal)/100)*irpf;
      System.out.println("\t" + irpfFinal);
      System.out.println("\t\t\t---------------------------------------");
      System.out.printf("%40s", "Total a recibir:");
      System.out.println("\t" + (Empleado.getSalarioBase()+plus+extraordinaria+ayudaTotal-irpfFinal));
      System.out.println("");
    
      
      
       
       
  }//Fin metodo de calcular la nomina
    


}//Fin clase Nomina.
