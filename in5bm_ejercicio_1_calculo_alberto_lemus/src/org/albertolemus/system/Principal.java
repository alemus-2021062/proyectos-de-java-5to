package org.albertolemus.system;
import org.albertolemus.bean.Persona;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 19 mar. 2022
 * @time 15:05:52
 * Carne: 2021062
 * Codigo Tecnico: IN5BM
 */

public class Principal {
    public static void main(String[] args) {
       // Persona p1 = new Persona();
       Persona p1 = new Persona("Karla", "Rodriguez"); 
        
       //p1.nombre = "Karla"; 
       // p1.setNombre("Karla");
       
       //p1.apellido = "Rodriguez";
       //p1.setApellido("Rodriguez");
       
       //p1.ocupacion = "Informatico";
       p1.setOcupacion("Informatica");
       
       //p1.genero = "Femenino";
       p1.setGenero("Femenino");
       
       //p1.edad = 21;
       p1.setEdad(21);
       
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("Ocupacion: " + p1.getOcupacion());
        System.out.println("Genero: " + p1.getGenero());
        System.out.println("Edad: " + p1.getEdad());
      
       p1.getNombre();
       p1.getApellido();
       p1.getOcupacion();
       p1.getGenero();
       p1.getEdad();
       
    }
}
