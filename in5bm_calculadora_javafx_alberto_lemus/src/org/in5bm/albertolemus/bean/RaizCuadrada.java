package org.in5bm.albertolemus.bean;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 29 mar. 2022
 * @time 11:25:50 
 * @Carne 2021062
 * @CodigoTecnico IN5BM
 */
public class RaizCuadrada extends Operacion {

    @Override
    public float operar() {
        setOperador('√');
        setResultado((float) Math.sqrt(getNumero2()));
        return getResultado();
    }

    @Override
    public float operar(float numero1, float numero2) {
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado((float) Math.pow(numero1, numero2));
        return getResultado();
    }

    public float operar(float numero) {
        setNumero2(numero);
        setResultado((float) Math.sqrt(getNumero2()));
        return getResultado();
    }

}
