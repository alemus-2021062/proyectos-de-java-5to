package org.albertolemus.system;
import java.util.Scanner;
/**
 * @author Alberto Moises Gerardo Lemus Alvarado
 * correo: alemus-2021062@kinal.edu.gt
 * Carnet: 2021062
 * codigo tecnico: IN5BM
 * Grupo: 1
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       /*
       Ingrese un valor y este será la cantidad de valores de la serie Fibonacci, por ejemplo, si 
       se ingresa 5 mostrará en pantalla: 0, 1, 1, 2, 3. La serie de Fibonacci está dado por los dos 
       primeros términos 0 y 1 el siguiente término es la suma de sus dos términos anteriores 
       por lo que 0 + 1 = 1, que sería el tercer término de la serie. (Bucle While) 
       */ 
       Scanner read =new Scanner(System.in);
       System.out.println("Ingrese un numero");
       int limite=read.nextInt();
       int num1=0;
       int num2=1;
       int temp;
       int contador=2;
       
       System.out.print("\n" + num1 + ", \t");
       System.out.print(num2 + ", \t");
       
       while(contador<limite){
           temp =num1;
           num1=num2;
           num2=temp+num1;
           System.out.print(num2 + ", \t");
           contador++;
       }
        System.out.println("\n");
    }
}
