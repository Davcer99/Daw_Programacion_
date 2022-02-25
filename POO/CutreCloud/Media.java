package CutreCloud;

import java.util.ArrayList;

public class Media {

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

    @Override
    public String toString() {
        return "Media [contenido=" + contenido + ", id=" + id + ", nombre=" + nombre + ", tipo=" + tipo
                + ", usuario_id=" + usuario_id + "]";
    }
    
    
}