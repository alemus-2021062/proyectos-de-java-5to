package org.albertolemus.bean;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 25 mar. 2022
 * @time 13:07:59
 * Carne: 2021062
 * Codigo Tecnico: IN5BM
 */


public class Triangulo {
    
    
    private double base;
    private double altura;
    private double lado;
    private double area;
    private double perimetro;
    private Scanner read;
    
    //Constructor

       public Triangulo(double base, double altura, double lado) {
            this.base = base;
            this.altura = altura;
            this.lado = lado;
       }
    
    
    
       public Triangulo(){
           this.base = 0;
           this.altura = 0;
           this.lado = 0;
           this.area = 0;
           this.perimetro = 0;
           read = new Scanner(System.in);
       }

        //GETTER'S
        public double getBase() {
            return base;
        }

        public double getAltura() {
            return altura;
        }

        public double getLado() {
            return lado;
        }

        public double getArea() {
            return area;
        }

        public double getPerimetro() {
            return perimetro;
        }
        
        //SETTER'S
        public void setBase(double base) {
            this.base = base;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public void setPerimetro(double perimetro) {
            this.perimetro = perimetro;
        }
        
    
    
        public double capturarBase(){
            //JOptionPane.showMessageDialog(null,"ingrese la base del triangulo");
            //this.base = read.nextDouble();
            this.base = Double.parseDouble(JOptionPane.showInputDialog("ingrese la base del triangulo"));
            return base;
        }
        

        public double capturarAltura(){
            //System.out.println("Ingrese la altura del triangulo: ");
            //this.altura = read.nextDouble();
            this.altura = Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura del triangulo"));
            return altura;
        }

        public double calcularArea(){
            this.area = (this.base * this.altura)/2;
            return this.area;
        }
        
        public double calcularArea(double base, double altura){
            this.area = (base * altura)/2;
            return this.area;
        }        

        public double calcularPerimetro(){
            this.perimetro = this.base *3;
            return perimetro;
        }

        public double calcularPerimetro(double base){
            this.perimetro = base *3;
            return perimetro;
        }        

        public double calcularPerimetro(double lado1, double lado2, double lado3){
            this.perimetro = lado1 + lado2 + lado3;
            return perimetro;
        }        
        
        public void mostrarResultados(){
             JOptionPane.showMessageDialog(null,"El area del triangulo es: " + this.area);
             JOptionPane.showMessageDialog(null,"El perimetro del triangulo es: " + this.perimetro);  
        }
    
    
    
}
