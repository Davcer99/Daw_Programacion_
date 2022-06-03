import java.sql.*;
import java.util.Scanner;

/**
 * TestDB
 */
public class ConsultaBases {

    public static void main(String[] args) {
        String consulta = "INSERT INTO Cliente (nombre,apellidos,email,nif) VALUES (?,?,?,?)";
        String connectionUrl = "jdbc:mysql://10.0.2.4/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Insertar nombre");
        String nombre = sc.nextLine();
        System.out.println("Insertar apellidos");
        String apellidos = sc.nextLine();
        System.out.println("Insertar email");
        String email = sc.nextLine();
        System.out.println("Insertar nif");
        String nif = sc.nextLine();
        sc.close();
    
        try  {
            Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
            PreparedStatement ps = conn.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, email);
            ps.setString(4, nif);
            ps.executeUpdate();
            System.out.println("Insert realizado con exito");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}