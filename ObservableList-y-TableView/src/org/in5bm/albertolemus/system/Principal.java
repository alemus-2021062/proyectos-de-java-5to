package org.in5bm.albertolemus.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 10 may. 2022
 * @time 12:58:34
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage primaryStage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../views/TableView.fxml"));
        primaryStage.setTitle("Registro");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
