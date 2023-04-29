package org.albertolemus.system;

import javax.swing.JFrame;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 25 abr. 2022
 * @time 16:23:33
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class EstudianteSingleton {
    
    private static JFrame estudianteInstancia;

    private EstudianteSingleton() {
    }
    
    public static JFrame getEstudianteSingleton(){
        if(estudianteInstancia ==(null)){
            estudianteInstancia = new FRMEstudiante();
        }
        return estudianteInstancia;
    }
    
}
