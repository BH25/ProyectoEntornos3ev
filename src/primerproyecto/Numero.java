
package primerproyecto;
/**
 * 
 * @author Hristo Prashtakov
 * @version 2.0 se implementan todos los metodos posibles para la conversión de número a letra, falta unir con la clase Fecha, posible mejora de versión.
 * @since 01-06-2016
 */

public class Numero {
    int num;
  
  boolean correcto() {
      return (num >=0 && num <=99);
  }//Final meotod correcto
  
    String dameNumero(int n) {
        switch(n) {
            case 0:
                return "cero";
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            case 11:
                return "once";
            case 12:
                return "doce";
            case 13:
                return "trece";
            case 14:
                return "catorce";
            case 15:
                return "quince";
            case 30:
                return "treinta";
            default:
              return "";
        }//Final switch   
    }//Final metodo dameNumero      

    String numeroCompuesto(int num) {
        String cad;
        int decenas, unidades;
        decenas  = num / 10;
        unidades = num % 10;
        if (decenas > 2) {
            cad = dameNumero(decenas*10) + " y ";
        }else {
            if (decenas == 1) {
                cad="dieci";
            }else {
                cad="veinti";
                }//else2
        }//else1 
        cad +=(unidades);
        return cad;
    }//Final metodo numeroCompuesto
  
    void muestraFin(int n) {
      System.out.println("\n\t\tEl Numero " + n + "Es: " + dameNumero(n));
    }//Final metodo muestraFin
    
}//Final de la clase Numero
