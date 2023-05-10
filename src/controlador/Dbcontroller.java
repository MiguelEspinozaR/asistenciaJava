package controlador;
import java.sql.*;

public class Dbcontroller {
    //modificar argumento para pedir una ruta en el futuro
    Connection conexion;

    public Dbcontroller(){
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:..\\database\\asist.db");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}