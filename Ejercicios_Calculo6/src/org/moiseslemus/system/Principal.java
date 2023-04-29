package org.moiseslemus.system;
import java.util.Scanner;
/* 
@author Alberto Moises Gerardo Lemus Alvarado
Carnet: 2021062
codigo tecnico: IN5BM
Grupo: 1
*/
public class Principal {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("---------- MENU DE OPCIONES ---------");
        System.out.println("       ------- 1. SUMAR --------");
        System.out.println("       ------- 2. RESTAR --------");
        System.out.println("       ---- 3. MULTIPLICAR ------");
        System.out.println("       ------ 4. DIVIDIR --------");
        System.out.println("       -------- 5. SALIR ---------");
        System.out.println(" POR FAVOR INGRESE UNA OPCION");
        
        int opcion = read.nextInt();

        System.out.println("INGRESE EL PRIMER NUMERO");
        int num1 = read.nextInt();

        System.out.println("INGRESE EL SEGUNDO NUMERO");
        int num2 = read.nextInt();

    switch(opcion){
        case 1: 
            System.out.println("Suma: " + (num1+num2));
        break;
        case 2:
            int resultado;
            resultado = 0;
            resultado = num1 - num2;
            System.out.println("Resta: " + resultado);
        break;
        case 3:
            int resultadoMulti;
            resultadoMulti = 0;
            resultadoMulti = num1 * num2;
            System.out.println("Multiplicacion " + resultadoMulti);
        break;
        case 4: 
             int resultDivision;
             resultDivision = 0;
             resultDivision = num1 / num2;
            System.out.println("Division " + resultDivision);
        break;
        case 5:
            System.out.println("Elegiste Salir");
        break;
        default:
            System.out.println("ESE VALOR NO ES VALIDO");

        }
    }
}