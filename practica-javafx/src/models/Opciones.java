package models;

import javafx.scene.control.ComboBox;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 13 jul. 2022
 * @time 13:05:16
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Opciones {
    
    private int llave;
    private String nombre;
    private String poder;
    private int nivelPoder;
    private String etico;
    
    public Opciones() {
    }
    
    public Opciones(int llave, String nombre, String poder, int nivelPoder, String etico){
        this.llave=llave;
        this.nombre=nombre;
        this.poder=poder;
        this.nivelPoder=nivelPoder;
        this.etico=etico;
    }
    
    public Opciones(String nombre,String poder, int nivelPoder, String etico){
        this.nombre=nombre;
        this.poder=poder;
        this.nivelPoder=nivelPoder;
        this.etico=etico;        
    }

    public int getLlave() {
        return llave;
    }

    public void setLlave(int llave) {
        this.llave = llave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public String getEtico() {
        return etico;
    }

    public void setEtico(String etico) {
        this.etico = etico;
    } 
}
