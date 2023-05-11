package controlador;
import java.sql.*;

public class Dbcontroller {
    //modificar argumento para pedir una ruta en el futuro
    private Connection conexion;

    public Dbcontroller(){
        //la conexion a la db se hace al momento de crear el controlador
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:..\\database\\asist.db");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void registrarPersonal(){

        
    }

    public Connection getConexion(){
        return conexion;
    }
}