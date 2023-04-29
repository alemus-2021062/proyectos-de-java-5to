package org.albertolemus.system;
import java.util.Scanner;
/**
 * @author Alberto Moises Gerardo Lemus Alvarado
 * correo: alemus-2021062@kinal.edu.gt
 * Carnet: 2021062
 * codigo tecnico: IN5BM
 * Grupo: 1
 */
public class Ejercicio6 {
    public static void main(String[] args) {
       /*
       Leer las calificaciones de una clase de 10 estudiantes y contar el número total de 
       aprobados (Mayor o igual a 61 pts). (Bucle For)
       */ 
       Scanner read = new Scanner(System.in);
       int contador=0;
       for(int i=1;i<=10;i++){
           System.out.println("Nota del alumno: ");
           int nota=read.nextInt();
              if (nota >=61){
                    contador++;
              }    
           }
           System.out.println("Cantidad de aprobados: "+ contador);
       }       
}
