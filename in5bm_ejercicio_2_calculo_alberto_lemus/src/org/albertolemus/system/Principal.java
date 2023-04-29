package org.albertolemus.system;

import org.albertolemus.bean.Motocicleta;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 22 mar. 2022
 * @time 17:14:50
 * Carne: 2021062
 * Codigo Tecnico: IN5BM
 */
public class Principal {
    public static void main(String[] args) {
        
       Motocicleta miMoto = new Motocicleta ("bajaj","Discover","Rojo"); 
       System.out.println("Motocicleta");
       System.out.println("Marca: " + miMoto.getMarca()); 
       System.out.println("Modelo: " + miMoto.getModelo());
       System.out.println("Color: " + miMoto.getColor());
       miMoto.setPlaca("P0M0Y15");
       System.out.println("Placa: " + miMoto.getPlaca());
       miMoto.vender();    
    }
}
