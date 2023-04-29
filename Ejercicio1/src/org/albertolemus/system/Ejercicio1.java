package org.albertolemus.system;
import java.util.Scanner;
/** 
* @author Alberto Moises Gerardo Lemus Alvarado
* correo: alemus-2021062@kinal.edu.gt
* Carnet: 2021062
* codigo tecnico: IN5BM
* Grupo: 1
*/
public class Ejercicio1 {
    public static void main(String[] args) {
       /*
        Martha va a realizar una fiesta por lo cual ha invitado a una gran cantidad de personas. 
        Pero también ha decidido algunas reglas: Que todas las personas con edades mayores a 
        los quince años, sólo pueden entrar si traen regalos; que jóvenes con los quince años 
        cumplidos entra totalmente gratis pero los de menos de quince años no pueden entrar 
        a la fiesta. Hacer un algoritmo donde se tome la edad de una persona y que requisito de 
        los anteriores le toca cumplir si quiere entrar.
       */
       Scanner read = new Scanner(System.in);
       byte edad;
       boolean traeRegalo;
       
       //Entrada
       System.out.print("Ingrese la edad del invitado");
       edad = read.nextByte();
       System.out.println("¿Trae regalo (true/false)?");
       traeRegalo = read.nextBoolean();
       
       //Proceso y salida
       if(edad>15){
           if(traeRegalo){
               System.out.println("Si puede entrar");
           }else {
               System.out.println("No puede entrar");
           }
           
       }else {
           if (edad==15){
               System.out.println("Si puede entrar");
           }else {
               if(edad<15){
                   System.out.println("No puede entrar");
               }
           }
       }  
    }
     
}
