
package primerproyecto;

/**
 * 
 * @author Hristo Prashtakov
 * @version 2.0 agregación de switchs y implementacion de los menus creados en la clase Pantalla y Nomina
 * @since 01-06-2016
 */

public class PrimerProyecto {

    
    public static void main(String[] args) {
       
     
       TodosEmpleados.altaEmpleados();
       Empleado.setSalarioBase(Pantalla.pideEntero("Introduce el salario base: "));
       primerMenu();
    }//Final del main
    public static void primerMenu(){  
       int op;
        op=Pantalla.menuPrincipal();
       
        switch(op){
            case 1:
                Pantalla.pideFecha();
                listaEmpleado();
                break;
            case 2:
                datosEmpleado();
                break;
            case 3:
                Empleado.setSalarioBase(Pantalla.pideEntero("Introduce el nuevo salario base: "));
                System.out.println("El nuevo salario base común es: " + Empleado.getSalarioBase());
                primerMenu();
                break;
            case 4:
        default: 
          break;
        }//swtich1
    }//Final del menú principal
    
    public static void listaEmpleado(){
        int op2;
        
       op2=Pantalla.menuEmpleado();
       switch(op2) {
           case 1:
               Nomina.nominaCal(TodosEmpleados.e1.getNombre(),TodosEmpleados.e1.getnHijos(),TodosEmpleados.e1.getPlus());
               listaEmpleado();
               break;
             case 2:
               Nomina.nominaCal(TodosEmpleados.e2.getNombre(),TodosEmpleados.e2.getnHijos(),TodosEmpleados.e2.getPlus());
               listaEmpleado();
               break;
             case 3:
               Nomina.nominaCal(TodosEmpleados.e3.getNombre(),TodosEmpleados.e3.getnHijos(),TodosEmpleados.e3.getPlus());
               listaEmpleado();
               break;
             case 4:
               Nomina.nominaCal(TodosEmpleados.e4.getNombre(),TodosEmpleados.e4.getnHijos(),TodosEmpleados.e4.getPlus());
               listaEmpleado();
               break;
             case 5:
               Nomina.nominaCal(TodosEmpleados.e5.getNombre(),TodosEmpleados.e5.getnHijos(),TodosEmpleados.e5.getPlus()); 
               listaEmpleado();
               break;
             case 6:
               Nomina.nominaCal(TodosEmpleados.e6.getNombre(),TodosEmpleados.e6.getnHijos(),TodosEmpleados.e6.getPlus());
               listaEmpleado();
               break;
             case 7:
               Nomina.nominaCal(TodosEmpleados.e7.getNombre(),TodosEmpleados.e7.getnHijos(),TodosEmpleados.e7.getPlus());
               listaEmpleado();
               break;
             case 8:
               Nomina.nominaCal(TodosEmpleados.e8.getNombre(),TodosEmpleados.e8.getnHijos(),TodosEmpleados.e8.getPlus());
               listaEmpleado();
               break;
             case 9:
               Nomina.nominaCal(TodosEmpleados.e9.getNombre(),TodosEmpleados.e9.getnHijos(),TodosEmpleados.e9.getPlus());
               listaEmpleado();
               break;
             case 10:
               Nomina.nominaCal(TodosEmpleados.e10.getNombre(),TodosEmpleados.e10.getnHijos(),TodosEmpleados.e10.getPlus());
               listaEmpleado();
               break;
             default:
               primerMenu();
                 break;
       }//Final del switch
    }//Final del metodo lista de Empleados
    
    public static void datosEmpleado(){
        
        int op3;
        op3 = Pantalla.menuEmpleado();
        
        switch(op3) {
            
            case 1:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e1);
                break;
            case 2:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e2);
                break;
            case 3:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e3);
                break;
            case 4:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e4);
                break;
            case 5:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e5);
                break;
            case 6:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e6);
                break;
            case 7:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e7);
                break;
            case 8:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e8);
                break;
            case 9:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e9);
                break;
            case 10:
                Pantalla.muestraDatosEmpleado(TodosEmpleados.e10);
                break;
            default:
                primerMenu();
                break;   
        }//Final del switch
        
    }//Final del metodo datos del empleado
   
   public static void cambiarDatosEmpleado(Empleado e){
    int op4;
        op4=Pantalla.cambiaDatosEmpleado();
        switch(op4){
            case 1:
                e.setNombre(Pantalla.pideCadena("INTRODUCE UN NOMBRE NUEVO: "));
                Pantalla.muestraDatosEmpleado(e);
                break;
            case 2:
                e.setnHijos(Pantalla.pideEntero("INTRODUCE UN NUEVO NUMERO DE HIJOS: "));
                Pantalla.muestraDatosEmpleado(e);
                break;
            case 3:
                e.setPlus(Pantalla.pideDouble("INTRODUCE UN PLUS NUEVO: "));
                Pantalla.muestraDatosEmpleado(e);
                break;
            default:
               datosEmpleado();
                break;
        }//Final del switch   
    }//Final del metodo que cambia los datos del empleado
    
    
}//Final de la clase PrimerProyecto. 
    