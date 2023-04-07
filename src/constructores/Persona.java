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
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona() {}
    
    public Persona (String nombre, int edad) {   
        this.nombre = nombre;
        this.edad = edad;
        
    }
    /*public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad =edad;       
    }*/
    
    public String getEdadComoTexto() {
        String edadTexto = String.valueOf(edad);
        return edadTexto;
    }
    
    public String getTextoImprimir() {
        return "Nombre: "+ this.nombre + "\nEdad: " + getEdadComoTexto()
                + "\n--------------------";
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       
    
    public int getEdad() {
        return edad;
    }
    
    public void getEdad(int edad){
        this.edad = edad;
    }
}
