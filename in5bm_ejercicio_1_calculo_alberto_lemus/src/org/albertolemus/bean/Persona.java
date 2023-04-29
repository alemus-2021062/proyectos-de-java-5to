package org.albertolemus.bean;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 19 mar. 2022
 * @time 15:06:54
 * Carne: 2021062
 * Codigo Tecnico: IN5BM
 */
public class Persona {
    //Atributos
    
       private String nombre;
       public String apellido;
       public String genero;
       public String ocupacion;
       public int edad;
       
       public Persona(){
       }
       
       public Persona(String nombre){
           this.nombre = nombre;
       }
       
       public Persona(String nombre, String apellido){
           this.nombre = nombre;
           this.apellido = apellido;
       }
       
       public void setNombre(String nombre){
           this.nombre = nombre;
       }
       
       public void setApellido(String apellido){
           this.apellido = apellido;
       }
       
       public void setGenero(String genero){
           this.genero = genero;
       }
       
       public void setOcupacion(String ocupacion){
           this.ocupacion = ocupacion;
       }
       
       public void setEdad(int edad){
           this.edad = edad;
       }
       
       
    //Metodos
    public void desplegarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getGenero(){
        return genero;   
    }
    
    public String getOcupacion(){
        return ocupacion;
    }
    
    public int getEdad(){
        return edad;
    }
    
    
}
