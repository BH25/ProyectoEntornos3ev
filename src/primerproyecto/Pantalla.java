
package primerproyecto;

import java.util.Scanner;
//import static primerproyecto.PrimerProyecto.cambiarDatosEmpleado;


/**
 *
 * @author Hristo Prashtakov
 * @version 1.0 viene mitad de metodos, proximo añadido de más metodos en futura versión.
 * @since 28-05-2016
 */
public class Pantalla {
       static Fecha miFecha;
         
       static Fecha pideFecha() {
        miFecha = new Fecha();
        return miFecha;
        }//pideFecha
          
    public static int pideEntero(String mensaje){

        Scanner teclado = new Scanner(System.in);
          System.out.print(mensaje);
          return teclado.nextInt();
    }//pideEntero

    public  static String pideCadena(String cadena){
        Scanner teclado = new Scanner (System.in);
        System.out.print(cadena);
        return teclado.nextLine();
    }//pideCadena

    public static double pideDouble(String cadena) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(cadena);
        return teclado.nextDouble();
    }//PideDouble
    
    public static float pideFloat(String cadena){
         Scanner teclado = new Scanner (System.in);
         System.out.print(cadena);
         return teclado.nextFloat();
    }//pideFloat
    
    
}//Final Pantalla
