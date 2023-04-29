package org.albertolemus.system;
import java.util.Scanner;
/**
 * @author Alberto Moises Gerardo Lemus Alvarado
 * correo: alemus-2021062@kinal.edu.gt
 * Carnet: 2021062
 * codigo tecnico: IN5BM
 * Grupo: 1
 */
public class Ejercicio5 {
    public static void main(String[] args) {
       /*
       Diseñe una aplicación que muestre las tablas de multiplicar del 1 a un número ingresado 
       por el usuario. (Bucle For)
       */ 
       Scanner read = new Scanner(System.in);
       int numero;
       System.out.println("Escriba el numero de la tabla");
       numero = read.nextInt();
       for(int i=1;i<=numero;i++){
           System.out.println("\nTabla del "+ i);
           for(int j=1;j<=10;j++){
           System.out.println(i+" X "+ j + " = " + (i * j));
           }
       }
       
    }
}
