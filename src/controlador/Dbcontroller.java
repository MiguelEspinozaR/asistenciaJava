package controlador;
import java.sql.DriverManager;
import java.sql.Connection;
//import java.sql.Driver;

public class Dbcontroller {
    //modificar argumento para pedir una ruta en el futuro
    String ruta = "jdbc:sqlite:database\\asist.db";
    Connection conexion;

    public Dbcontroller(){
        try {
             conexion = DriverManager.getConnection(ruta);
             if(conexion.isValid(1)){
                System.out.println("conectado");
             } else {
                System.out.println("error al conectar");
             }

        } catch (Exception e) {
            
        }

    }
}