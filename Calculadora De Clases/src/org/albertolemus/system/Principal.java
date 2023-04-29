package org.albertolemus.system;
import javax.swing.JOptionPane;
import org.albertolemus.bean.Suma;
import org.albertolemus.bean.Resta;
import org.albertolemus.bean.Multiplicacion;
import org.albertolemus.bean.Division;

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
       double numero1=0;
       double numero2=0;
       byte opcion;
       
       do{
           opcion=Byte.parseByte(JOptionPane.showInputDialog(" "
                   +"MENU PRINCIPAL\n"
                   +"1. SUMA\n"
                   +"2. RESTA\n"
                   +"3. MULTIPLICACION\n"
                   +"4. DIVISION\n"
                   +"5. SALIR\n"
                   +"\n"
                   +"ELIJA EL NUMERO DE SU OPCION: \n" ));
           if((opcion>=1)&&(opcion<=4)){
               numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));
               numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero: "));
           }
           
           switch(opcion){
               case 1:
                   //SUMANDO
                   Suma sumar = new Suma();
                   sumar.setNumero1(numero1);
                   sumar.setNumero2(numero2);
                   double resultadoSuma=sumar.sumar(numero1,numero2);
                   JOptionPane.showMessageDialog(null, String.format ("La suma es: %.2f" , resultadoSuma));
               break;
               case 2:
                    //RESTAR
                    Resta restar = new Resta();
                    restar.setNumero1(numero1);
                    restar.setNumero2(numero2);
                    double resultadoResta=restar.restar(numero1,numero2);
                    JOptionPane.showMessageDialog(null, String.format("La resta es: %.2f",resultadoResta));
               break;    
               case 3:
                   //MULTIPLICAR
                    Multiplicacion multiplicar = new Multiplicacion();
                    multiplicar.setNumero1(numero1);
                    multiplicar.setNumero2(numero2);
                    double resultadoMultiplicar=multiplicar.multiplicar(numero1,numero2);
                    JOptionPane.showMessageDialog(null,String.format("La multiplicacion es: %.2f", resultadoMultiplicar));
               break;  
               case 4:
                   //DIVISION
                    Division dividir = new Division();
                    dividir.setNumero1(numero1);
                    dividir.setNumero2(numero2);
                    double resultadoDividir=dividir.dividir(numero1,numero2);
                    JOptionPane.showMessageDialog(null, String.format("La division es: %.2f",resultadoDividir));
                   
               break;
               case 5:   
               break;
               default:
                   JOptionPane.showMessageDialog(null, " Esa no es una opcion valida");
               break;    
           }
           
           
       }while(opcion!=5);
       JOptionPane.showMessageDialog(null, "Gracias por usar este programa");
    }
}
