package org.albertolemus.system;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 3-3-2022
 * Carne: 2021062
 * Codigo: IN5BM
 */
public class Principal {
    public static void main(String[] args) {
       String color;
       String marca;
       String modelo;
       double cilindraje;
       double precio;
       double velocidad;
       double gasolina;
       String llave;
       String volante;
       double aceleracion;
       double frenado; 
       Motocicleta moto = new Motocicleta();
       Scanner read = new Scanner(System.in);
       
       //---------COLOR----------
       System.out.println("Cual es el color de tu moto?");
       color=read.nextLine();
       moto.setColor(color);
       System.out.println(color);
       
       //-------MARCA--------------
       System.out.println("Marca de la moto");
       marca=read.nextLine();
       moto.setMarca(marca);
       System.out.println(marca);
       
       //----------MODELO-----------
       
       System.out.println("Modelo de la moto");
       modelo=read.nextLine();
       moto.setModelo(modelo);
       System.out.println(modelo);
       
       //-------CILINDRAJE---------
       System.out.println("Cilindraje de la moto");
       cilindraje=read.nextDouble();
       moto.setCilindraje(cilindraje);
       System.out.println(cilindraje);
       
       //-------PRECIO--------
       System.out.println("Precio de la moto");
       precio=read.nextDouble();
       moto.setPrecio(precio);
       System.out.println(precio);
       
       //--------ARRANCAR-------
       System.out.println("Como esta la llave de tu moto? \n" + "puesta o no puesta");
       read.nextLine();
       llave=read.nextLine();
       moto.arrancar(llave);
       
        System.out.println("Cual es tu velocidad actual?");
       velocidad=read.nextDouble();
        System.out.println("Cuanto vas a acelerar?");
       aceleracion=read.nextDouble();
        moto.acelerar(velocidad,aceleracion);
       
        System.out.println("Cual es tu velocidad actual?");
       velocidad=read.nextDouble();
        System.out.println("Cuanto vas a frenar?");
       frenado=read.nextDouble();
        moto.acelerar(velocidad,frenado);
       
       
        
        
    }
}
