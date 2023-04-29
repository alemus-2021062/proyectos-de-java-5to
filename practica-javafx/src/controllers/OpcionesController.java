package controllers;

import base_datos.Conexion;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import system.Principal;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import models.Opciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.collections.FXCollections;
import java.sql.SQLException;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 11 jul. 2022
 * @time 22:35:52
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class OpcionesController implements Initializable {

    @FXML
    private TableView<Opciones> tblPersonajes;

    @FXML
    private TableColumn<Opciones, Integer> clmId;

    @FXML
    private TableColumn<Opciones, String> clmNombre;

    @FXML
    private TableColumn<Opciones, String> clmPoder;

    @FXML
    private TableColumn<Opciones, Integer> clmNivelPoder;

    @FXML
    private TableColumn<Opciones, String> clmEtico;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtId;
    
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPoder;

    @FXML
    private TextField txtNivelPoder;

    @FXML
    private TextField txtEtico;    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getDatos();
    }
    
    private ObservableList <Opciones> listaOpciones;
    
    public Principal escenaMenuPrincipal;
    
    public Principal getEscenaMenuPrincipal(){
        return escenaMenuPrincipal;
    }
    
    public void setEscenaMenuPrincipal(Principal escenaMenuPrincipal){
        this.escenaMenuPrincipal = escenaMenuPrincipal;
    }
    
    public boolean existeElementoSeleccionado(){
        if(tblPersonajes.getSelectionModel().getSelectedItem() != null){
            return true;
        }else{
            return false;
        }
    }
    
    @FXML
    public void seleccionarElemento(){
        if(existeElementoSeleccionado()){
            txtId.setText(String.valueOf(((Opciones) tblPersonajes.getSelectionModel().getSelectedItem()).getLlave()));
            txtNombre.setText(((Opciones)tblPersonajes.getSelectionModel().getSelectedItem()).getNombre());
            txtPoder.setText(((Opciones) tblPersonajes.getSelectionModel().getSelectedItem()).getPoder());
            txtNivelPoder.setText(String.valueOf(((Opciones) tblPersonajes.getSelectionModel().getSelectedItem()).getNivelPoder()));
            txtEtico.setText(((Opciones) tblPersonajes.getSelectionModel().getSelectedItem()).getEtico());
        }
    }
    
    public void getDatos(){
        tblPersonajes.setItems(getPersonajes());
        clmId.setCellValueFactory(new PropertyValueFactory<>("llave"));
        clmNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clmPoder.setCellValueFactory(new PropertyValueFactory<>("poder"));
        clmNivelPoder.setCellValueFactory(new PropertyValueFactory<>("nivelPoder"));
        clmEtico.setCellValueFactory(new PropertyValueFactory<>("etico"));        
    }

    public ObservableList getPersonajes(){
        
        ArrayList<Opciones> lista = new ArrayList<>();    
        PreparedStatement pstmt = null;
        ResultSet rs = null;        
        try{
            pstmt = Conexion.getInstance().getConexion().prepareCall("{CALL sp_personajes_read()}");
            rs=pstmt.executeQuery();
            
        while(rs.next()){
            Opciones opciones = new Opciones();
            opciones.setLlave(rs.getInt(1));
            opciones.setNombre(rs.getString(2));
            opciones.setPoder(rs.getString(3));
            opciones.setNivelPoder(rs.getInt(4));
            opciones.setEtico(rs.getString(5));
            lista.add(opciones);
            System.out.println(lista.toString());
        }
        
        listaOpciones = FXCollections.observableArrayList(lista);
        
        }catch(SQLException e){
            System.err.println("\nHubo un error en el metodo getPersonajes...SOLUCIONALO");
            e.printStackTrace();
        }catch (Exception ex)
        {
            ex.printStackTrace();
        } finally
        {

            try
            {
                if (rs != null)
                {
                    rs.close();
                }
                if (pstmt != null)
                {
                    pstmt.close();
                }

            } catch (Exception e)
            {

            }
        }
        return listaOpciones;
    }

    @FXML
    public void btnAgregar(ActionEvent event){
        agregarPersonaje();
        limpiarCampos();
        getDatos();
    }
    
    public boolean agregarPersonaje() {
             Opciones opciones = new Opciones();
             opciones.setNombre(txtNombre.getText());
             opciones.setPoder(txtPoder.getText());
             opciones.setNivelPoder(Integer.parseInt(txtNivelPoder.getText()));
             opciones.setEtico(txtEtico.getText());
             PreparedStatement pstmt = null;
        try{
                pstmt = Conexion.getInstance().getConexion().prepareCall("{CALL sp_personajes_create(?,?,?,?)}");
                pstmt.setString(1, opciones.getNombre());
                pstmt.setString(2, opciones.getPoder());
                pstmt.setInt(3, opciones.getNivelPoder());
                pstmt.setString(4, opciones.getEtico());
                System.out.println(pstmt.toString());
                
                pstmt.executeQuery();
                
                listaOpciones.add(opciones);
                
                return true;
                        
        }catch(SQLException e){
            System.err.println("\nHubo un error en el metodo btnAgregar...SOLUCIONALOOO");
            e.printStackTrace();
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }finally{
            try{
                if(pstmt != null){
                    pstmt.close();
                }                    
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    
    public boolean eliminarPersonaje(){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            pstmt = Conexion.getInstance().getConexion().prepareCall("{CALL sp_personajes_delete(?)}");
            while(rs.next()){
                Opciones opciones = new Opciones();
                opciones.setLlave(Integer.parseInt(rs.getString(1)));
            }
            
            return true;
        }catch(Exception e){
            System.out.println("\nError en eliminarPersonaje pero no se que es xd solo se esto: ");
            e.printStackTrace();
        }
        return false;
    }

    @FXML
    void btnEliminar(ActionEvent event) {

    }    
    
    @FXML
    void clicRegresar(MouseEvent event) {
       escenaMenuPrincipal.mostrarPantallaPrincipal();
    }

    public void limpiarCampos(){
        txtNombre.clear();
        txtPoder.clear();
        txtNivelPoder.clear();
        txtEtico.clear();
    }
    
    
}
