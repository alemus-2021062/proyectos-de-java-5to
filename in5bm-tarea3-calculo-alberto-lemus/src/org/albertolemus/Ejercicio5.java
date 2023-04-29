package org.albertolemus;

import java.util.Scanner;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 6 abr. 2022
 * @time 19:59:25
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        /*
            Ejercicio 5:
            Pedir 10 sueldos. Mostrar cuantos hay mayores de 5000 (Bucle for)
         */
        Scanner read = new Scanner(System.in);
        int contadorSueldo = 0;

        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Ingrese 10 sueldos");
            double sueldo = read.nextDouble();
            if (sueldo >= 5000)
            {
                contadorSueldo++;

            }

        }
        System.out.println("Los ingresos mayores a 5000 son: " + contadorSueldo);

    }
}
