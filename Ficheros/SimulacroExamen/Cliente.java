package SimulacroExamen;

import java.util.ArrayList;

public class Cliente extends Persona{
    //atributo
    private int id = 0;
    private String email;
    private ArrayList<Cliente> clientes = new ArrayList<>();

    //constructor
    public Cliente(int nif, String nombre, String apellidos, String email) {
        super(nif, nombre, apellidos);
        this.email = email;
        this.id = generarId();
        clientes.add(this);
    }
    // generar id automatico
    private int generarId() {
        return id++;
    }

    //getters y setters
    protected String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public int getId() {
        return id;
    }

    //to string
    @Override
    public String toString() {
        return  super.toString() + "\nEmail:\t" + getEmail();
    }

    
    

    
}
