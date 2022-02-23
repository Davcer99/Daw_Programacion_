package CutreCloud;

import java.util.ArrayList;

public class Usuario {
    //Usuario id, email, password
    //Media id, nombre, contenido, tipo, usuario_id
    //El tipo debe ser de video audio o imagen 
    
    private int id;
    private String email;
    private String password;
    private static ArrayList<Usuario> listadoUsuarios = new ArrayList<Usuario>();
    private static int idGenerator= 0;
    
    public Usuario( String email, String password) {
        this.id = idGenerator++;
        this.password = password;
        
        if (this.isAviable(email)){
            this.email = email;
            listadoUsuarios.add(this);
        }else{
            this.email= "Correo duplicado " + email;
        }
    }

    private boolean isAviable(String email){
        boolean resultado = true;
        for (Usuario usuario : listadoUsuarios) {
            if (email.equalsIgnoreCase(usuario.getEmail())){
                resultado = false;
                break;
            }
        }
        return resultado;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static void setListadoUsuarios(ArrayList<Usuario> listadoUsuarios) {
        Usuario.listadoUsuarios = listadoUsuarios;
    }
    
    @Override
    public String toString() {
        return "id: "+ this.id + " email: "+ this.email + " password: " + this.password;
    }
}
