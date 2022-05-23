import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

  private String nombre;
  private String apellidos;
  private String email;
  private int telefono;
  private static ArrayList <Usuario> listadoUsuarios = new ArrayList<>();

  public Usuario() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introducir el nombre");
    this.nombre = sc.nextLine();
    System.out.println("Introducir los apellidos");
    this.apellidos = sc.nextLine();
    System.out.println("Introducir el email");
    this.email = sc.nextLine();
    System.out.println("Introducir el telefono");
    this.telefono = sc.nextInt();
    sc.close();
    Usuario.listadoUsuarios.add(this);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public static ArrayList<Usuario> getListadoUsuarios() {
    return listadoUsuarios;
  }

  public static void setListadoUsuarios(ArrayList<Usuario> listadoUsuarios) {
    Usuario.listadoUsuarios = listadoUsuarios;
  }
  
  @Override
  public String toString() {
      return this.getNombre() + "\t" + this.getApellidos() + "\t" + this.getEmail() + "\t" + this.getTelefono();
  }
  
}