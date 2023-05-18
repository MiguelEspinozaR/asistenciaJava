package controlador;
import java.sql.*;

import javax.xml.stream.events.StartElement;

import modelo.Personal;

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
            System.out.println(e);
        }
    }

    public void registrarPersonal(String nombre){
        try {
            String insert = "insert into personal(nombre_completo, hora_llegada) values(?, ?);";
            PreparedStatement statement = conexion.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            //statement.setNull(1, Types.INTEGER);
            statement.setString(1, nombre);
            statement.setNull(2, Types.DATE);

            int filas = statement.executeUpdate();
            System.out.println(filas);
            statement.close();
            System.out.println(nombre + " registrado");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("todo mal prri :T");
        }
    }

    public void marcar(){

    }

    public Connection getConexion(){
        return conexion;
    }
}