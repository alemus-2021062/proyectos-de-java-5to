package ejercicios_calculo;
import java.util.Scanner;

/* 
@author Alberto Moises Gerardo Lemus Alvarado
Carnet: 2021062
codigo tecnico: IN5BM
Grupo: 1
*/
public class Ejercicios_Calculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido;
        int edad;
        long cui;
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();

        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        System.out.println("Ingrese su CUI");
        cui = sc.nextLong();

        System.out.println("Hola " + nombre +" " + apellido + " tienes " + edad + " años ");
        System.out.println("CUI : "+ cui);
    }  
}

