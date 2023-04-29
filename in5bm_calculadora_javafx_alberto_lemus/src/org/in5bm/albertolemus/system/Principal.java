package org.in5bm.albertolemus.system;

import org.in5bm.albertolemus.bean.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

/**
 *
 * @author Alberto Moises Gerardo Lemus Alvarado
 * @date 17/03/2022
 * @Carne 2021062
 * @CodigoTecnico IN5BM
 */
public class Principal extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLCalculadoraView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Calculadora Moises Lemus");
        stage.show();
    }
}
