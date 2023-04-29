package org.in5bm.albertolemus.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 10 may. 2022
 * @time 7:02:21
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class TableViewController implements Initializable{
    
    
    ObservableList<UserController> lista = FXCollections.observableArrayList(
            new UserController("Moises", "Lemus", 17),
            new UserController("Steven", "Grant", 18),
            new UserController("Marc", "Spector", 19),
            new UserController("Jake", "Lockley", 20),
            new UserController("Gadiel","Lemus",12)
    );
    
    @Override
    public void initialize(URL location, ResourceBundle resources ){   
        inicioTabla();
    }

     private void inicioTabla(){
         tblRegistro.setEditable(true);
         
         colNombre.setCellValueFactory(new PropertyValueFactory<UserController, String>("nombre"));
         colApellido.setCellValueFactory(new PropertyValueFactory<UserController, String>("apellido"));
         colEdad.setCellValueFactory(new PropertyValueFactory<UserController, Integer>("edad"));
         
         tblRegistro.setItems(lista);
         
     }
    
    @FXML
    private TableView <UserController>tblRegistro;
    
    @FXML
    private TableColumn <UserController, String>colNombre;
    
    @FXML
    private TableColumn <UserController, String>colApellido;
    
    @FXML
    private TableColumn<UserController, Integer> colEdad;
    
    
}
