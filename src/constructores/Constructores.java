/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Jean Pierre
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Manuel", 20, "Finanzas");
        Empleado empleadoCopia = new Empleado(empleado);
        //ctrl + space
        empleadoCopia.setDepartamento("ventas");
                
        imprimir(empleado.getTextoImprimir());    
        imprimir(empleadoCopia.getTextoImprimir());
        
        //Persona persona = new Persona();
        //Persona juanPersona = new Persona("Juan",25);
        
        //imprimir(persona.getTextoImprimir());    
        //imprimir(juanPersona.getTextoImprimir());
    }
    
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
    public static String convertirATexto(int entero) {
        return String.valueOf(entero);
    }
}
