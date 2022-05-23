import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ConsultaBases
 */
public class ConsultaBases {

    public static void main(String[] av) {

        try {
    
          // Dependiendo de a qué tipo de SGBD queramos conectar cargaremos un controlador u otro
    
          // Intentar cargar el driver de MySQL
    
          Class<?> c = Class.forName("com.mysql.jdbc.Driver");
    
          System.out.println("Cargado " + c.getName());
    
          //Definir la url de conexión y los parámetros de usuario y contraseña
    
          String host = "jdbc:mysql://192.168.204.181/phpmyadmin";
    
          String username = "phpmyadmin";
    
          String password = "phpmyadmin";
    
          Connection con = DriverManager.getConnection(host, username, password);
    
          System.out.println("Conexión completada");
    
          con.close();
    
        } catch (ClassNotFoundException cnfe) {
    
          System.out.println(cnfe.getMessage());
    
        } catch (SQLException ex) {
    
          System.out.println("Se ha producido un error al conectar: " + ex.getMessage());
    
        }
    
      }
}