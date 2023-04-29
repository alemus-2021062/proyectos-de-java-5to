package org.albertolemus.system;
import javax.swing.JOptionPane;
import org.albertolemus.bean.*;
/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 25 mar. 2022
 * @time 13:00:34
 * Carne: 2021062
 * Codigo Tecnico: IN5BM
 */
public class Principal {
    public static void main(String[] args) {
       Triangulo triangulo = new Triangulo();
       triangulo.capturarBase();
       triangulo.capturarAltura();
       triangulo.calcularArea();
       triangulo.calcularPerimetro();
       triangulo.mostrarResultados();
  
        
        Triangulo t2 = new Triangulo();
        double l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1"));
        double l2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2"));
        double l3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 3"));
        
        double perimetro = t2.calcularPerimetro(l1,l2,l3);
        JOptionPane.showMessageDialog(null, "El perimetro es: " + perimetro);
        
    }
}
