package org.moiseslemus.controller;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 17 may. 2022
 * @time 16:19:48
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Suma {
    
    int num1 = 0;
    int num2 = 0;
    int resultado;
    
    public Suma(){
        
    }
    
    public Suma(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int operar(int num1,int num2){
        resultado = num1 + num2;
        return resultado;
    }
    
    public int getNum1(){
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResultado() {
        return resultado;
    }
    
    public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
