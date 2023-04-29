package org.albertolemus.system;

import javax.swing.JFrame;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 24 abr. 2022
 * @time 11:56:22
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class LoginSingleton {
    private static JFrame instanciaLogin;
    
    private LoginSingleton(){
        
    }
    
    public static JFrame getInstance(){
        if(instanciaLogin==(null)){
            instanciaLogin = new FRMLogin();
        }
        return instanciaLogin;
    }
    
    
    
    
}
