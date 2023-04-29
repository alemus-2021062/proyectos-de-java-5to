package org.albertolemus.system;

import javax.swing.JFrame;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 24 abr. 2022
 * @time 15:09:48
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class InicioSingleton {
    private static JFrame instancia;
    
    private InicioSingleton(){
        
    }
    
    public static JFrame getInstancia(){
        if(instancia == null){
            instancia = new PantallaInicio();
        }
        return instancia;
    }
    
    
}
