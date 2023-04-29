package org.albertolemus;

import java.util.Scanner;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 7 abr. 2022
 * @time 16:09:34
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        /*
            Ejercicio 3:
            A un profesor se le solicita el ingreso de notas hasta que indique ya no desea 
            ingresar más notas, para esto el programa preguntará al profesor después de cada 
            ingreso si desea ingresar una nota más. Al terminar de ingresarlas, debe mostrar 
            la cantidad de notas ingresadas y el promedio de nota. (Clico Do-While)
         */
        Scanner read = new Scanner(System.in);

        int contador = 0;
        double numero = 0;
        double resultado = 0;
        double promedio = 0;
        String respuesta = " ";

        System.out.println("Ingrese una nota");

        do
        {
            contador++;
            numero = read.nextInt();
            System.out.println("El numero ingresado es: " + numero);
            resultado = resultado + numero;
            System.out.println("¿Quiere ingresar otra nota? (s/n)");
            read.nextLine();
            respuesta = read.nextLine();
            if (respuesta.equals("s"))
            {
                System.out.println("Ingrese otra nota");
            }

        } while (respuesta.equals("s"));

        promedio = resultado / contador;

        System.out.println("Usted ingreso: " + contador + " numeros \n");
        System.out.printf("El promedio es de: %.2f" , promedio);

    }
}
