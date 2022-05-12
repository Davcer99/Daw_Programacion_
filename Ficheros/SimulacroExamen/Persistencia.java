package SimulacroExamen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Persistencia extends Cliente{
    private static final String nombreFichero = "clientes.dat";
    //constructor
    public Persistencia(String nif, String nombre, String apellidos, String email) {
        super(nif, nombre, apellidos, email, email);
    }
    
    //escribir clientes 
    public void writeObjects (ArrayList<Cliente> clientes) throws IOException{
        try {
            FileWriter salidaFichero = new FileWriter("./SimulacroExamen/clientes.dat");

            for (Cliente cliente : clientes) {
                salidaFichero.write(cliente.getId()+"," + cliente.getNif() + "," + cliente.getNombre() + "," + cliente.getApellidos() + "," + cliente.getEmail());
            }
            salidaFichero.close();  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    //Serializar
    public void serializar (ArrayList<Cliente> clientes) throws IOException{
        ObjectOutputStream salidaFichero = new ObjectOutputStream(new FileOutputStream("./objetosSerializados.dat"));

        for (Cliente cliente : clientes) {
            salidaFichero.writeObject(cliente);
        }
        salidaFichero.close();
    }

    public ArrayList<Cliente> read(){

        ArrayList<Cliente> resultado = new ArrayList<>();

        FileReader ficheroLectura;
        BufferedReader lector;
        try {
            ficheroLectura = new FileReader(nombreFichero);
            lector = new BufferedReader(ficheroLectura);

            String linea;

            while ((linea = lector.readLine()) != null){
                String [] trozos = linea.split(",");
                Cliente cliente = new Cliente(trozos[1], trozos[2], trozos[3], trozos[0], trozos[4]);
                resultado.add(cliente);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultado;
    }
}

    
