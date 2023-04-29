package system;

import controllers.OpcionesController;
import controllers.PantallaPrincipalController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 11 jul. 2022
 * @time 16:25:50
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Principal extends Application {

    public Stage escenaMenuPrincipal;
    public final String PAQUETE_VISTA = "../views/";
    
    public static void main(String[] args) {
        launch(args);
    }
    
   /* @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../views/PantallaPrincipal.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("The boys xd");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.escenaMenuPrincipal = primaryStage;
        escenaMenuPrincipal.setTitle("The boys xd");
        escenaMenuPrincipal.setResizable(false);
        escenaMenuPrincipal.show();
        mostrarPantallaPrincipal();
    }    
    
    
    public Initializable cambiarPantalla(String vista, int ancho, int alto) throws IOException{
        FXMLLoader cargarFXML = new FXMLLoader(getClass().getResource(PAQUETE_VISTA + vista));
        Scene scene = new Scene((AnchorPane) cargarFXML.load(), ancho, alto);
        this.escenaMenuPrincipal.setScene(scene);
        this.escenaMenuPrincipal.centerOnScreen();
        this.escenaMenuPrincipal.show();
        return (Initializable) cargarFXML.getController();
    }

    public void mostrarPantallaPrincipal() /*throws IOException*/{
        try{
        PantallaPrincipalController principalController = (PantallaPrincipalController) cambiarPantalla("PantallaPrincipal.fxml",788,571);
        principalController.setEscenarioMenuPrincipal(this);
        }catch(Exception e){
            System.err.print("\nHubo un error en el cambio de mostrarPantallaPrincipal" + e);
        }
    }
    
    public void mostrarEscenaOpciones() throws IOException{
       try{
           OpcionesController opciones = (OpcionesController) cambiarPantalla("OpcionesView.fxml",788,571);
           opciones.setEscenaMenuPrincipal(this);
       }catch(Exception e){
           System.err.print("\nSe produjo un error al intentar mostrar la ventana de Opciones" + e);
           e.printStackTrace();
       } 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
