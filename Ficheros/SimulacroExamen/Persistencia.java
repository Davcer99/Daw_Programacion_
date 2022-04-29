package SimulacroExamen;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia extends Cliente{
    //constructor
    public Persistencia(int nif, String nombre, String apellidos, String email) {
        super(nif, nombre, apellidos, email);
    }
    
    //escribir clientes 
    public void write (ArrayList<Cliente> clientes) throws IOException{
        FileWriter salidaFichero = new FileWriter("./clientes.dat");

        for (Cliente cliente : clientes) {
            salidaFichero.write(cliente.getId()+"," + cliente.getNif() + "," + cliente.getNombre() + "," + cliente.getApellidos() + "," + cliente.getEmail());
        }
        salidaFichero.close();
    }

    //leer ficheros y crear 
}
