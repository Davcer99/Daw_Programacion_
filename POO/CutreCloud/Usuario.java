package CutreCloud;

import java.util.ArrayList;

import java.util.Iterator;

public class Usuario implements Xml {
    /*
    Usuario id, email, password
    Media id, nombre, contenido, tipo, usuario_id
    El tipo debe ser de video audio o imagen 
    Implementar la eliminación de un archivo de media de la aplicación por nombre de fichero
    eliminar todos los media de un tipo concreto
    eliminar un usuario por email y eliminar sus media
    eliminar usuarios de un dominio
    */
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

    // método para eliminar un usuario por email

    public static void eliminarUsuario(String email){
        Iterator<Usuario> it = listadoUsuarios.iterator();
        while (it.hasNext()) {
            Usuario user = it.next();
            if (user.getEmail().equals(email)){
                Media.eliminarMediaId(user.id);
                it.remove();
            }
        }
    }

    //método para eliminar un usuario mediante un dominio

    public static void eliminarDominio(String dominio){
        Iterator<Usuario> it = listadoUsuarios.iterator();
        while(it.hasNext()) {
            Usuario user = it.next();
            if (user.email.endsWith(dominio)){
                it.remove();
            }
            
        }
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

    public String generateXML(){
        String resultado= "";
        resultado += "<Usuario>\n";
        resultado += " <id>"+ this.id + "</id>\n";
        resultado += " <email>"+ this.email + "</email>\n";
        resultado += " <password>"+ this.password + "</password>\n";
        resultado += "</Usuario>";
        return resultado;
    }

}
