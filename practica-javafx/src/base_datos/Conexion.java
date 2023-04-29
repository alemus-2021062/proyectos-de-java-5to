package base_datos;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;

/**
 *
 * @author Alberto Moisés Gerardo Lemus Alvarado
 * @date 12 jul. 2022
 * @time 20:42:20
 * @Carne: 2021062
 * @Codigo Tecnico: IN5BM
 */
public class Conexion {
    
    /*public static void main(String[] args) {
        getInstance();
    }*/
    
    private final String URL;
    private final String IP_SERVER = "127.0.0.1";
    private final String PORT = "3306";
    private final String DB = "practica_javafx";
    private final String USER ="kinal";
    private final String PASSWORD="admin";
    
    private Connection conexion;
    
    private static Conexion instancia;
    
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    
    private Conexion(){
        URL = "jdbc:mysql://" + IP_SERVER + ":" + PORT + "/" + DB;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("DESPEGUE EXITOSO");
            
            DatabaseMetaData dma= conexion.getMetaData();
            System.out.println("\nConnected to: " + dma.getURL());
            System.out.println("Driver: " + dma.getDriverName());
            System.out.println("Version: " + dma.getDriverVersion() + "\n");            
        }catch(ClassNotFoundException e){
            System.err.println("No se encuentra ninguna definicion para la clase");
            e.printStackTrace();
        }catch(CommunicationsException e){
            System.err.println("No esta levantado el servidor o servicio sql");
            e.printStackTrace();
        }catch(SQLException e){
            System.err.println("Exepcion tipo SQLException");
            System.out.println("SQLSate: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
            System.out.println("\n");            
            e.printStackTrace();            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public Connection getConexion(){
        return conexion;
    }
}
