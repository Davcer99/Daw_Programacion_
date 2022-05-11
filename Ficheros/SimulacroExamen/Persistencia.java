package SimulacroExamen;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Persistencia extends Cliente{
    //constructor
    public Persistencia(int nif, String nombre, String apellidos, String email) {
        super(nif, nombre, apellidos, email);
    }
    
    //escribir clientes 
    public void writeObjects (ArrayList<Cliente> clientes) throws IOException{
        FileWriter salidaFichero = new FileWriter("./SimulacroExamen/clientes.dat");

        for (Cliente cliente : clientes) {
            salidaFichero.write(cliente.getId()+"," + cliente.getNif() + "," + cliente.getNombre() + "," + cliente.getApellidos() + "," + cliente.getEmail());
        }
        salidaFichero.close();
    }
    //Serializar
    public void serializar (ArrayList<Cliente> clientes) throws IOException{
        ObjectOutputStream salidaFichero = new ObjectOutputStream(new FileOutputStream("./objetosSerializados.dat"));

        for (Cliente cliente : clientes) {
            salidaFichero.writeObject(cliente);
        }
        salidaFichero.close();
    }
}

    
