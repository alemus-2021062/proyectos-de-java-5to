package org.in5bm.albertolemus.bean;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 30 mar. 2022
 * @time 14:05:21 
 * @Carne 2021062
 * @CodigoTecnico IN5BM
 */
public class Potencia extends Operacion {

    @Override
    public float operar() {
        setResultado((float) Math.pow(getNumero1(), getNumero2()));
        return getResultado();
    }

    @Override
    public float operar(float numero1, float numero2) {
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado((float) Math.pow(numero1, numero2));
        return getResultado();

    }

}
