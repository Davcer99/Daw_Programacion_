package SimulacroExamen;

import java.io.Serializable;

public class Persona implements Serializable{
    // atributos
    private String nif;
    private String nombre;
    private String apellidos;

    //constructor
    public Persona(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //getters y setters
    protected String getNif() {
        return nif;
    }
    protected void setNif(String nif) {
        this.nif = nif;
    }
    public String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected String getApellidos() {
        return apellidos;
    }
    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //to string
    @Override
    public String toString() {
        
        return "Persona: \nNif:\t" + getNif() + "\nNombre:\t" + getNombre() + "\nApellidos:\t" + getApellidos();
    }

    
}
