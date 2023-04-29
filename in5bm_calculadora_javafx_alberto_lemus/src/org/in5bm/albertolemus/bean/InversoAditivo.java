package org.in5bm.albertolemus.bean;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 23 mar. 2022
 * @time 14:39:41 
 * @Carne 2021062
 * @CodigoTecnico IN5BM
 */
public class InversoAditivo extends Operacion {

    @Override
    public float operar() {
        setResultado(getNumero1() * getNumero2());
        return getResultado();
    }

    @Override
    public float operar(float numero1, float numero2) {
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado(getNumero1() * getNumero2());
        return getResultado();
    }

}
