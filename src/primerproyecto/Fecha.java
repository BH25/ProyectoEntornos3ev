
package primerproyecto;

/**
 * 
 * @author Hristo Prashtakov
 * @version 2.0 Version completa, correción de errores y añadido del metodo muestraFecha();
 * @since 01-06-2016
 */
public class Fecha {
    int year;
    int mes;
    int dia;
    
    Fecha(){
        
        do{
            dia = Pantalla.pideEntero("Introduce el dia: ");
            mes = Pantalla.pideEntero("Introduce el mes: ");
            year = Pantalla.pideEntero("Introduce el año: ");
          } while (!correcta2());

    }//Constructor de la clase Fecha
 
    public void muestraMes(){
            switch (mes){
                case 1:
                    System.out.print("Enero");
                    break;
                case 2:
                    System.out.print("Febrero");
                    break;
                case 3:
                    System.out.print("Marzo");
                    break;
                case 4:
                    System.out.print("Abril");
                    break;
                case 5:
                    System.out.print("Mayo");
                    break;
                case 6:
                    System.out.print("Junio");
                    break;
                case 7:
                    System.out.print("Julio");
                    break;
                case 8:
                    System.out.print("Agosto");
                    break;
                case 9:
                    System.out.print("Septiembre");
                    break;
                case 10:
                    System.out.print("Octubre");
                    break;
                case 11:
                    System.out.print("Noviembre");
                    break;
                case 12:
                    System.out.print("Diciembre");
                    break;
            }//Final switch
    }//Final metodo muestraMes
    
    int getDiasMes(){
        switch(mes){
            case 4:
                
            case 6:
                
            case 9:
                
            case 11:
                return 30;
            //No es necesario break
            case 2:
               if (esBisiesto()) {
                   return 29;
               } else{
                   return 28;
               }
            default:
                return 31;
       }// Final switch      
    }// Final metodo getDiasMes
 
    void muestraFecha() {
        System.out.print(dia + " de ");
        muestraMes();
        System.out.print(" de " + year);
    }//Final muestraFecha
    
 
    boolean correcta2() {
                if (mes > 0 && mes <= 12 && dia > 0 && dia <= getDiasMes()) {
                return true;

                }else {
                    System.out.println("Fecha incorrecta");
                    return false;
                }
      
    }//Final metodo correcta2
    
    boolean esBisiesto(){
        return (( year% 4 ==0) && (year % 100!= 0)|| (year % 400 ==0));
    }//esBisiesto
    
}//Final clase Fecha

