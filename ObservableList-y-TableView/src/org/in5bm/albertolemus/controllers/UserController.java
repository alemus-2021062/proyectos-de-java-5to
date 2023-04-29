package org.in5bm.albertolemus.controllers;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 10 may. 2022
 * @time 13:17:39
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class UserController {
    
    private String colNombre;
    private String colApellido;
    private int colEdad;

    public UserController(String nombre, String apellido, int edad) {
        this.colNombre = nombre;
        this.colApellido = apellido;
        this.colEdad = edad;
    }

    public String getNombre() {
        return colNombre;
    }

    public void setNombre(String nombre) {
        this.colNombre = nombre;
    }

    public String getApellido() {
        return colApellido;
    }

    public void setColor(String apellido) {
        this.colApellido = apellido;
    }

    public int getEdad() {
        return colEdad;
    }

    public void setEdad(int edad) {
        this.colEdad = edad;
    }
    
    
}
