package org.albertolemus.system;
import java.util.Scanner;
/**
 * @author Alberto Moises Gerardo Lemus Alvarado
 * correo: alemus-2021062@kinal.edu.gt
 * Carnet: 2021062
 * codigo tecnico: IN5BM
 * Grupo: 1
 */
public class Ejercicio7 {
    public static void main(String[] args) {
       /*
       Se le solicita ingresar números y mostrar la suma, hasta que el usuario indique que ya no 
       desea ingresar más, para ello debe mostrar un mensaje después de cada ingreso 
       preguntándole si desea continuar. (Bucle Do-While)
       */
       Scanner read = new Scanner(System.in);
       double suma = 0.0;
       String respuesta = "";
       
        do {
            System.out.println("Ingrese un numero: ");
            double numero = read.nextDouble();
            suma = suma + numero;
            System.out.println("Desea ingresar otro numero: (s/n)");
            read.nextLine();
            respuesta=read.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Suma total: "+ suma);
       
    }
}
