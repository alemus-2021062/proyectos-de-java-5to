package org.in5bm.albertolemus.bean;

/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 17/03/2022
 * @Carne 2021062
 * @CodigoTecnico IN5BM
 */
public abstract class Operacion {

    private float numero1;
    private float numero2;
    private float resultado;
    private char operador;

    //constructores 
    //constructor sin parametros
    public Operacion() {

    }

    //Constructor con parametros
    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public char getOperador() {
        return operador;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public abstract float operar();

    public abstract float operar(float numero1, float numero2);

}
