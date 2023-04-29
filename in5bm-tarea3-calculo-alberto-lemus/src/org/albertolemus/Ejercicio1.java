package org.albertolemus;

import java.util.Scanner;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 6 abr. 2022
 * @time 18:03:17
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        /*
        Ejercicio 1:
        Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
        han introducido. (Clico While) 
         */
        System.out.println("Ingrese numeros hasta poner uno negativo");
        int numero = 0;
        int contador = 0;

        while (numero >= 0)
        {
            contador++;
            numero = read.nextInt();
            System.out.println("El numero ingresado es: " + numero);
        }
        System.out.println("La cantidad de numeros ingresados son: " + contador);
    }
}
