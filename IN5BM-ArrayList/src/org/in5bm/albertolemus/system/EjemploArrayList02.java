package org.in5bm.albertolemus.system;

import java.util.ArrayList;

/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 21/04/2022
 * @carne 2021062
 * @Codigo IN5BM 
 */
public class EjemploArrayList02 {
    public static void main(String[] args) {
        
        /*
        Wrapper
        int -> Integer
        double -> Double
        float -> Float
        long -> Long
        boolean -> Boolean
        char ->Character
        */
        
        ArrayList<Integer> a = new ArrayList<>();
        
        
        a.add(-14545);
        a.add(4);
        a.add(9);
        a.add(-16);
        System.out.println("No. de elementos: " + a.size());
        System.out.println("El elemento en la posicion uno es : " + a.get(0));
        
        for(int i = 0; i < a.size();i++){
            System.out.println(a.get(i));
        }
        
        System.out.println("\n contenido de la lista con ForEach");
                
        a.add(5);
        a.add(99);
        
        for(int numero : a){
            System.out.println(numero);
        }
        
        a.removeIf(numero -> numero < 10);
        
        System.out.println("Lista despues de remover los menores a 10");
        
        for(int numero : a){
            System.out.println(numero);
        }        
        
        
    }
}
