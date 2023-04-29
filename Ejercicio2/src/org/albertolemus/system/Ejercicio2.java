package org.albertolemus.system;
import java.util.Scanner;
/**
* @author Alberto Moises Gerardo Lemus Alvarado
* correo: alemus-2021062@kinal.edu.gt
* Carnet: 2021062
* codigo tecnico: IN5BM
* Grupo: 1
*/
public class Ejercicio2 {
    public static void main(String[] args) {
       /*
       Despliegue un mensaje indicando, si un año ingresado por el usuario (yyyy), es o no 
       bisiesto. La regla para los años bisiestos según el calendario gregoriano es: Un año es 
       bisiesto si es divisible por 4, excepto el último de cada siglo (aquel divisible por 100), 
       salvo que este último sea divisible por 400.
       */ 
       Scanner read = new Scanner(System.in);
       
       int year;
       
       System.out.println("Ingrese el año en formato (yyyy)");
       year = read.nextInt();
       
       
       if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 ==0)){
            System.out.println("El año es bisiesto");
       } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
