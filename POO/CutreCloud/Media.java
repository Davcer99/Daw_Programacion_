package CutreCloud;
/*
Crear una interfaz que se llame ParseXML debe haber un método en las clases que la implementen llamado generateXML()
En este método se debe impirmir por consola el xml correspondiente a los atributos de cada clase con un string
*/


import java.util.ArrayList;
import java.util.Iterator;

public class Media implements Xml {

    private int id;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private int usuario_id;
    private static ArrayList<Media> listadoMedia = new ArrayList<Media>();
    private static int idGenerator = 0;

    
    public Media (String nombre, String contenido, MediaType tipo, Usuario usuario_id) {
        this.id = idGenerator++;
        this.nombre = comprobarNombre(nombre);
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario_id = usuario_id.getId();
        listadoMedia.add(this);
    }

    private String comprobarNombre(String nombre){

        for (Media media : listadoMedia) {

            if (media.getNombre().equals(nombre)){
                return "El nombre ya existe";
            }
        }
        return nombre;
    }

    //método para eliminar un media por su nombre

    public static void eliminarMedia (String nombre){
        Iterator<Media> it = listadoMedia.iterator();
        while (it.hasNext()){
            Media media = it.next();
            if (media.getNombre().equals(nombre)){
                it.remove();;
            }
        }
    }

    //método para borrar un media por su tipo

    public static void eliminarTipoMedia (MediaType tipo){
        Iterator<Media> it= listadoMedia.iterator();
        while(it.hasNext()){
            Media actual = it.next();
            if (actual.getTipo().equals(tipo)){
                it.remove();
            }
        }
    }
    
    //método para eliminar por id

    public static void eliminarMediaId(int id){
        Iterator<Media> it = listadoMedia.iterator();

        while (it.hasNext()) {
            Media media = it.next();
            if (media.getUsuario_id()== id){
                it.remove();
            }
        }
    }

    public static ArrayList<Media> getListadoMedia() {
        return listadoMedia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public static void setListadoMedia(ArrayList<Media> listadoMedia) {
        Media.listadoMedia = listadoMedia;
    }

    public MediaType getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Media [contenido=" + contenido + ", id=" + id + ", nombre=" + nombre + ", tipo=" + tipo
                + ", usuario_id=" + usuario_id + "]";
    }

    
    public String generateXML() {
        String resultado= "";
        resultado += "<Media>\n";
        resultado += " <id>"+ this.id + "</id>\n";
        resultado += " <nombre>"+ this.nombre + "</nombre>\n";
        resultado += " <contenido>"+ this.contenido + "</contenido>\n";
        resultado += " <tipo>"+ this.tipo + "</tipo>\n";
        resultado += " <usuario_id>"+ this.usuario_id + "</usuario_id>\n";
        resultado += "</Media>";
        return resultado;
    }
    
    
}