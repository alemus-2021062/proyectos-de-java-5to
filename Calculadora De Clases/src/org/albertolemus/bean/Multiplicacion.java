package org.albertolemus.bean;

/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 01/03/2022
 * correo: alemus-2021062@kinal.edu.gt
 * carne: 2021062
 * Codigo tecnico: IN5BM
 * 
 */
public class Multiplicacion {
    
    private double numero1;
    private double numero2;
    
    //CONSTRUCTORES
    public Multiplicacion(){
        
    }
    
    public Multiplicacion(double numero1,double numero2){
       this.numero1=numero1;
       this.numero2=numero2;
    }
    
    //METODOS
    
    public double multiplicar(){
       double resultado= this.numero1 * this.numero2;
       return resultado;
    }
    
    public double multiplicar(double numero1,double numero2){
       return numero1 * numero2;
    }
    
    //GETTER'S y SETTER'S
    public double getNumero1(){
       return numero1; 
    }
    
    public double getNumero2(){
       return numero2; 
    }
    
    public void setNumero1(double numero1){
       this.numero1=numero1;
    }
    public void setNumero2(double numero2){
       this.numero2=numero2;
    }
    
}
