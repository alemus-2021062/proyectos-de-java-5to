package org.in5bm.albertolemus.system;

import java.util.ArrayList;


/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 21/04/2022
 * @carne 2021062
 * @Codigo IN5BM 
 */
public class EjemploArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        System.out.println("No. de elementos: " + a.size());
        
        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("magenta");
        System.out.println("No. de elementos: " + a.size());
        
        a.add("blanco");
        a.add("salmon");
        System.out.println("No. de elementos: " + a.size());
 
        System.out.println("Elemento en la posicion uno es : " + a.get(0));   
        System.out.println("Elemento en la posicion ultima es : " + a.get(5));
        
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i));
        }
        
        
        a.remove("rojo");
       
        
        System.out.println("\nForEach de colores despues de eliminar el rojo");
        
        for(String colores : a){
            System.out.println(colores);
        }        
        
        a.remove(1);
        System.out.println("\n despues de eliminar la posicion 1");
        
        for(String color : a){
            System.out.println(color);
        }
        
       if( a.contains("blanco")){
           System.out.println("El blanco esta en la lista de colores");
       }
        
       if(a.contains("rojo")){
           System.out.println("El rojo esta en la lista de colores");
       }else{
           System.out.println("El color rojo no esta en la lista");
       }
       
        System.out.println("El color en la posicion 0 es: " + a.get(0));
       a.set(0,"turqueza");
       
        System.out.println("Ahora el color en la posicion 0 es: " + a.get(0));
       
        a.add(1,"amarillo");
        System.out.println("Contenido del listado despues del add con posicion");
        
        for(String color : a){
            System.out.println(color);
        }
        
        a.removeIf(palabra -> palabra.contains("u"));
        System.out.println("\nContenido de la lista despues de eliminar los que contienen la letra \"U\" ");
        
        for(String color : a){
            System.out.println(color);
        }        
        
        
        
        
    }
}
