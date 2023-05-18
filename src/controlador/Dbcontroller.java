package controlador;
import java.sql.*;

public class Dbcontroller {
    //modificar argumento para pedir una ruta en el futuro
    private Connection conexion;

    public Dbcontroller(){
        //la conexion a la db se hace al momento de crear el controlador
        try {
            Class.forName("org.sqlite.JDBC");
            //investigar más sobre rutas relativas lpm
            conexion = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Miky\\Desktop\\boliche\\sw\\asistencia\\database\\asist.db");
            System.out.println("conectado y listo para usar");
        } catch (Exception e) {
            System.out.println("está cagada la conexion xD");
            System.out.println("Dbcontroller.Dbcontroller()");
            System.out.println(e);
        }
    }

    public void registrarPersonal(){

        
    }

    public void marcar(){

    }

    public Connection getConexion(){
        return conexion;
    }
}