package org.in5bm.albertolemus.bean;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 29 mar. 2022
 * @time 8:37:28
 * @Carne 2021062
 * @CodigoTecnico IN5BM
 */
public class Reciproco extends Operacion {

    @Override
    public float operar() {
        setResultado(getNumero1() / getNumero2());
        return getResultado();
    }

    @Override
    public float operar(float uno, float numero) {
        this.setNumero1(uno);
        this.setNumero2(numero);
        this.setResultado(uno / numero);
        return this.getResultado();
    }

}
