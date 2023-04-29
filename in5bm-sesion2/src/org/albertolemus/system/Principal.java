package org.albertolemus.system;
import java.util.Scanner;
/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 01/03/2022
 * correo: alemus-2021062@kinal.edu.gt
 * carne: 2021062
 * Codigo tecnico: IN5BM
 * 
 */
public class Principal {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in); 
       int [][] producto = new int [3][2];
       double [][] precio = new double[3][2];
       double subTotal=0;
       
       for(int i=0;i<3;i++){
           System.out.print("\nIngrese la cantidad de litros: ");
           producto[i][0] = read.nextInt();
           
           System.out.print("\nIngrese el codigo del producto: ");
           producto[i][1] = read.nextInt();
           
           switch(producto[i][1]){
               case 101:
                   precio[i][0]=40.00;
               break;
               case 102:
                   precio[i][0]=54.99;
               break;
               case 103:
                   precio[i][0]=72.80;
               break;
               case 104:
                   precio[i][0]=73.00;
               break;
               case 105:
                   precio[i][0]=102.75;
               break;
           }
           
           precio[i][1]= producto[i][0]*precio[i][0];
           subTotal= subTotal+precio[i][1];
       }
       
       double descuento = 0;
       if(subTotal>=500){
           descuento=subTotal*0.15;
       }
       
       double total = subTotal-descuento;
       
       
        System.out.println("\nNombre: ");
        read.nextLine();
        String nombre = read.nextLine();
        
        System.out.println("NIT: ");
        int nit=read.nextInt();
        
        System.out.println("\nNombre del cliente: "+nombre);
        System.out.println("\nNIT: "+nit);
        
        for(int i=0;i<15;i++){
            System.out.println(" ");
        }
        System.out.println("Nombre: " + nombre + "  " + "NIT: " + nit);
        System.out.println("__________________________________________________________");
        System.out.println("Cantidad \t Codigo \t\t Precio \t\t Monto");
        System.out.println("__________________________________________________________");
        
        for(int i =0;i<3;i++){
            System.out.print(producto[i][0] + "\t\t");
            System.out.print(producto[i][1] + "\t\t");
            System.out.print(precio[i][0] + "\t\t");
            System.out.print(precio[i][1] + "\t\n");
            
            
        }
        System.out.println("__________________________________________________________");
        
       System.out.printf("\nSubtotal: %.2f ", subTotal );
       System.out.printf("\nDescuento: %.2f", descuento);
       System.out.printf("\nTOTAL: %.2f \n", total);
        
        
        
        
        
        
    }
 
}
