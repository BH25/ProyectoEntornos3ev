
package primerproyecto;
/**
 *
 * @author Hristo Prashtakov 
 * @version 2.0 Version completa, todos los objetos y metodos añadidos.
 * @since 28-05-2016
 */
public class TodosEmpleados {
    
    static Empleado e1, e2, e3, e4, e5, e6, e7, e8, e9 , e10;
    
    
    static void altaEmpleados(){
        e1 = new Empleado("Em Uno", 100, 1);
        e2 = new Empleado("Em Dos", 200, 0);
        e3 = new Empleado("Em Tres", 300, 3);
        e4 = new Empleado("Em Cuatro", 400, 0);
        e5 = new Empleado("Em Cinco", 500, 5);
        e6 = new Empleado("Em Seis", 600, 0);
        e7 = new Empleado("Em Siete", 700, 7);
        e8 = new Empleado("Em Ocho", 800, 0);
        e9 = new Empleado("Em Nueve", 900, 9);
        e10 = new Empleado(Pantalla.pideCadena("Introduce el nombre del empleado: "), 
                           Pantalla.pideDouble("Introduce el plus de salario: "),
                           Pantalla.pideEntero("Introduce el nº de hijos: "));
    }//Metodo altaEmpleado  
    
}//Fin clase Todo empleados


