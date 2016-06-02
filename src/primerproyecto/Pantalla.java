
package primerproyecto;

import java.util.Scanner;
import static primerproyecto.PrimerProyecto.cambiarDatosEmpleado;


/**
 *
 * @author Hristo Prashtakov
 * @version 2.0 añadimos los últimos metodos que quedaban, menús que son llamados desde  el main
 * @since 01-06-2016
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
    
    public  static int menuEmpleado(){
        System.out.println("*********************************");
        System.out.println("*************ACME****************");
        System.out.println("*********************************");
        System.out.println("1.- "+TodosEmpleados.e1.getNombre());
        System.out.println("2.- "+TodosEmpleados.e2.getNombre());
        System.out.println("3.- "+TodosEmpleados.e3.getNombre());
        System.out.println("4.- "+TodosEmpleados.e4.getNombre());
        System.out.println("5.- "+TodosEmpleados.e5.getNombre());
        System.out.println("6.- "+TodosEmpleados.e6.getNombre());
        System.out.println("7.- "+TodosEmpleados.e7.getNombre());
        System.out.println("8.- "+TodosEmpleados.e8.getNombre());  
        System.out.println("9.- "+TodosEmpleados.e9.getNombre());               
        System.out.println("10.-"+TodosEmpleados.e10.getNombre());
        System.out.println("Otro.- Volver a la pantalla anterior");
        return Pantalla.pideEntero("Introduce el nº de empleado: ");      
    
    }//Menu de los empleados


public static int menuPrincipal(){
        System.out.println("*********************************");
        System.out.println("*************ACME****************");
        System.out.println("*********************************");
        System.out.println("1.-Calcular la nómina");
        System.out.println("2.-Datos del empleado");
        System.out.println("3.-Salario base");
        System.out.println("Otro.-Terminar");
        return Pantalla.pideEntero("Elige una opción: ");
    
    }//MenuPrincipal
    
    
    
     public static void muestraDatosEmpleado(Empleado e){
        System.out.println("*********************************");
        System.out.println("*************ACME****************");
        System.out.println("*********************************"); 
        System.out.println("NOMBRE: " + e.getNombre());
        System.out.println("HIJOS: " + e.getnHijos());
        System.out.println("PLUS: " + e.getPlus());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        cambiarDatosEmpleado(e);
    }//Menu que muestra los datos del empleado seleccionado
        
    public static  int cambiaDatosEmpleado(){
        System.out.println("*********************************");
        System.out.println("*************ACME****************");
        System.out.println("*********************************");
        System.out.println("1.-CAMBIAR NOMBRE: ");
        System.out.println("");
        System.out.println("2.-CAMBIAR NUMERO DE HIJOS: ");
        System.out.println("");
        System.out.println("3.-CAMBIAR PLUS: ");
        System.out.println("");
        System.out.println("OTRO.-VOLVER");
        System.out.println("");
        return Pantalla.pideEntero("ELIGE OPCIÓN: ");
    }// Menu para cambiar los datos del empleado seleccionado previamente.
    
}//Final Pantalla
