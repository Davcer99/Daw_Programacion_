package CutreCloud;

import java.util.ArrayList;

public class Media {

    private int id;
    private String nombre;
    private String contenido;
    private String tipo;
    private int usuario_id;
    private static ArrayList<Media> listadoMedia = new ArrayList<Media>();
    private static ArrayList<String> listadoNombres = new ArrayList<String>();
    private static ArrayList<Integer> listadoId = new ArrayList<Integer>();
    
    public Media(int id, String nombre, String contenido, String tipo, Usuario usuario_id) {
        this.id = comprobarId(id);
        this.nombre = comprobarNombre(nombre);
        this.contenido = contenido;
        this.tipo = comprobarTipo(tipo);
        this.usuario_id = usuario_id.getId();
        listadoMedia.add(this);
        listadoNombres.add(nombre);
    }

    private String comprobarTipo (String tipo){
        if( tipo.equalsIgnoreCase("video")||tipo.equalsIgnoreCase("audio")||tipo.equalsIgnoreCase("imagen")){
            return tipo;
        }else{
            return"El tipo no es correcto";
        }
    }

    private int comprobarId(int id){
        if(listadoId.contains(id)){
            return 000;
        }else{
            return id;
        }
    }

    private String comprobarNombre(String nombre){
        if(listadoNombres.contains(nombre)){
            return "El nombre ya existe";
        }else{
            return nombre;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public static ArrayList<String> getListadoNombres() {
        return listadoNombres;
    }

    public static void setListadoNombres(ArrayList<String> listadoNombres) {
        Media.listadoNombres = listadoNombres;
    }

    @Override
    public String toString() {
        return "Media [contenido=" + contenido + ", id=" + id + ", nombre=" + nombre + ", tipo=" + tipo
                + ", usuario_id=" + usuario_id + "]";
    }
    
    
}