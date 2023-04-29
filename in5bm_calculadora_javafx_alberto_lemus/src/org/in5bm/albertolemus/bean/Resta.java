package org.in5bm.albertolemus.bean;

/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 17/03/2022
 * @Carne 2021062
 * @CodigoTecnico IN5BM
 */
public class Resta extends Operacion {

    @Override
    public float operar() {
        setOperador('-');
        setResultado(getNumero1() - getNumero2());
        return getResultado();
    }

    @Override
    public float operar(float numero1, float numero2) {
        setOperador('-');
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado(getNumero1() - getNumero2());
        return getResultado();
    }

}
