package org.albertolemus.system;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 24 abr. 2022
 * @time 13:11:20
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Util {
    
    JFrame frmLogin;
    
    public void abrirLogin(){
        frmLogin = LoginSingleton.getInstance();
        frmLogin.setVisible(true);        
    }    
    
    public void salir(){
        int respuesta = JOptionPane.showConfirmDialog(null,
        "Esta seguro que desea salir", 
        "Confirmacion de cierre", 
        JOptionPane.YES_NO_OPTION);
        
        if(respuesta == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }
    
    public void validar(String usser, String pass){
        if((usser.equals("")) && (!pass.equals(""))){
            JOptionPane.showMessageDialog(null,"El campo usuario esta vacio",
                    "ERROR", JOptionPane.ERROR_MESSAGE);   
        }else if((!usser.equals("")) && (pass.equals(""))){
            JOptionPane.showMessageDialog(null, "El campo contraseña esta vacio",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if((usser.equals("")) && (pass.equals(""))){
            JOptionPane.showMessageDialog(null,"Los campos usuario y contraseña estan vacios",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if((usser.equals("root")) && (pass.equals("admin")) ){
                JFrame frmInicio = InicioSingleton.getInstancia();
                frmLogin=LoginSingleton.getInstance();
                frmInicio.setVisible(true);
                frmLogin.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Acceso Denegado","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    public void estudiante(){
        JFrame frmEstudiante = EstudianteSingleton.getEstudianteSingleton();
        frmEstudiante.setVisible(true);
    }
    
}
