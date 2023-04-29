package org.albertolemus.system;
import java.util.Scanner;
/**
 * @author Alberto Moises Gerardo Lemus Alvarado
 * correo: alemus-2021062@kinal.edu.gt
 * Carnet: 2021062
 * codigo tecnico: IN5BM
 * Grupo: 1
 */
public class Ejercicio3 {
    public static void main(String[] args) {
       /*
       Mostrar los números impares, hasta un número ingresado por el usuario. (While)
       */
       Scanner read = new Scanner(System.in);
       System.out.println("Ingrese un numero");
       int limite = read.nextInt(); 
       int numero = 0;
       
       while(numero <=limite){
           if(numero%2 !=0){
               System.out.println(numero);
           }
           numero++;
       }       
    }
}
