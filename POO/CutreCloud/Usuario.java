package CutreCloud;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

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

    public String generateXml(){
        String resultado= "";
        resultado += "<Usuario>\n";
        resultado += " <id>"+ this.id + "</id>\n";
        resultado += " <email>"+ this.email + "</email>\n";
        resultado += " <password>"+ this.password + "</password>\n";
        resultado += "</Usuario>";
        return resultado;
    }

    public void writeXml(){
        String filename = "./POO/CutreCloud/archivos/"+ this.id + ".xml";
        File file = new File(filename);
        try{
            file.createNewFile();
            FileWriter salida = new FileWriter(file);
            salida.write(generateXml());
            salida.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadXML(){
        File folder = new File("./POO/CutreCloud/archivos");

        listadoUsuarios.clear();
        
        for (File xmlFile : folder.listFiles()) {
            getLoadSingleXML(xmlFile);
            //listadoUsuarios.add(getLoadSingleXML(xmlFile));
        }
    }

    private static Usuario getLoadSingleXML(File xmlFile) {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        Document doc;
        Usuario newUser = null;

        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(xmlFile);
            String email = doc.getElementsByTagName("email").item(0).getTextContent();
            String password = doc.getElementsByTagName("password").item(0).getTextContent();
            newUser = new Usuario(email, password);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {  
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        return newUser;
    }
}
