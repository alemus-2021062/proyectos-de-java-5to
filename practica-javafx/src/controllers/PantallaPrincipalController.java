package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import system.Principal;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 11 jul. 2022
 * @time 16:27:34
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class PantallaPrincipalController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public Principal escenaMenuPrincipal;
    
    public Principal getEscenaMenuPrincipal(){
        return escenaMenuPrincipal;
    }
    
    public void setEscenarioMenuPrincipal(Principal escenaMenuPrincipal){
        this.escenaMenuPrincipal = escenaMenuPrincipal;
    }
    
    @FXML
    public void clicSalir(ActionEvent event){
        System.exit(0);
    }
    
    @FXML
    public void clicOpciones(MouseEvent event){
        escenaMenuPrincipal.mostrarEscenaOpciones();
    }
    
    
    
}
