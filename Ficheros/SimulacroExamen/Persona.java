package SimulacroExamen;

public class Persona {
    // atributos
    private int nif;
    private String nombre;
    private String apellidos;

    //constructor
    public Persona(int nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //getters y setters
    protected int getNif() {
        return nif;
    }
    protected void setNif(int nif) {
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
