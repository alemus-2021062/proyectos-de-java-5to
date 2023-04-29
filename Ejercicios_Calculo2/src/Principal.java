/* 
@author Alberto Moises Gerardo Lemus Alvarado
Carnet: 2021062
codigo tecnico: IN5BM
Grupo: 1
*/
    import java.util.Scanner;
public class Principal {
    public static void main(String [] args){
        /*
        A partir de dos numeros realice las siguientes operaciones:
        suma, resta, multiplicacion, division entera, division real,
        residuo division, potenciacion y muestre el resultado en
        pantalla
        */
        Scanner read = new Scanner(System.in);
        int numero1;
        int numero2;

        int resultSuma;
        int resultResta;
        int resultMulti;
        int resultDivision;
        double resultDivReal;
        int resultResiduo;
        double resultPotencia;

        // ENTRADA -> PROCESO -> SALIDA
        System.out.println("Ingrese un numero");
        numero1 = read.nextInt();

        System.out.println("Ingrese otro numero");
        numero2 = read.nextInt();

        //PROCEO

        resultSuma = numero1 + numero2;
        resultResta = numero1 - numero2;
        resultMulti = numero1 * numero2;
        resultDivision = numero1 / numero2;
        resultDivReal =(double) numero1 / numero2;
        resultResiduo = numero1 % numero2;
        resultPotencia = Math.pow(numero1, numero2);

        //SALIDA DE DATOS

        System.out.println("El resultado de la suma es " + resultSuma);
        System.out.println("El resultado de la resta es " + resultResta);
        System.out.println("El resultado de la multiplicacion es " + resultMulti);
        System.out.println("El resultado de la division es " + resultDivision);
        System.out.println("El resultado de la division real es " + resultDivReal);
        System.out.println("El resultado del residuo es " + resultResiduo);
        System.out.println("El resultado de la potenciacion es " + resultPotencia);
    }
}
