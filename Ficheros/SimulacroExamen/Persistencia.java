package SimulacroExamen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

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

    public void transformXML() throws TransformerFactoryConfigurationError, FileNotFoundException, IOException, ParserConfigurationException, TransformerException{
        ObjectInputStream f = new ObjectInputStream(new FileInputStream("./objetosSerializados.dat"));
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("clientes");
        doc.appendChild(root);

        Cliente cli;
        try {
            while (true) {
                cli = (Cliente) f.readObject();
                Element cliente = doc.createElement("cliente");
                cliente.setAttribute("id", Integer.toString(cli.getId()));

                Element nif = doc.createElement("NIF");
                nif.appendChild(doc.createTextNode(Integer.toString(cli.getNif())));
                cliente.appendChild(nif);

                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(cli.getNombre()));
                cliente.appendChild(nombre);

                Element apellidos = doc.createElement("apellidos");
                apellidos.appendChild(doc.createTextNode(cli.getApellidos()));
                cliente.appendChild(apellidos);

                Element email = doc.createElement("email");
                email.appendChild(doc.createTextNode(cli.getEmail()));
                cliente.appendChild(email);

                root.appendChild(cliente);
            }
        } catch (Exception e) {
            f.close();
        }
        Transformer trans = TransformerFactory.newInstance().newTransformer();
        
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream("./Empleados.xml"));

        trans.transform(source, result);
    }

    //leer ficheros y crear 
}
