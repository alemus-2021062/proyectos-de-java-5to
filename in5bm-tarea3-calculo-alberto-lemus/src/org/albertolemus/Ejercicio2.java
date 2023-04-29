package org.albertolemus;

import java.util.Scanner;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 6 abr. 2022
 * @time 18:09:56
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*
        Ejercicio 2:
        Pedir números hasta que se teclee un 0, mostrar la suma de todos los números
        introducidos (Ciclo Do-While) 
         */
        System.out.println("Ingrese numeros hasta ingresar el 0");
        int numero = 0;
        int contador = 0;
        int resultado = 0;

        do
        {
            contador++;
            numero = read.nextInt();
            resultado = resultado + numero;
            System.out.println("El numero ingresado es: " + numero);

        } while (!(numero == 0));

        System.out.println("La suma de los numeros ingresados son: " + resultado);

    }
}
