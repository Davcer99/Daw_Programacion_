package SimulacroExamen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.Writer;
import java.util.ArrayList;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import org.w3c.dom.*;

import com.google.gson.*;


public class Cliente extends Persona{
    //atributo
    private int id = 0;
    private String email;
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    //constructor
    public Cliente(String nif, String nombre, String apellidos, String email) {
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

    public static ArrayList<Cliente> getClientes() {
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
                nif.appendChild(doc.createTextNode(cli.getNif()));
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
        f.close();
    }

    public void transformJson() throws IOException{
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        Writer w_json = new FileWriter("./archivos/empleados.json");

        for (Cliente cliente : clientes) {
            String prettyPrinting = prettyGson.toJson(cliente);
            w_json.write(prettyPrinting);
        }
        w_json.close();

    }

    public void readJson() throws IOException{
        Gson gson = new Gson();

        InputStream f = new FileInputStream("./archivos/Ejemplo.json");

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f));

        GeoResponse g = gson.fromJson(bufferedReader, GeoResponse.class);

        for (GeoResponse.Result r: g.results ) {

            System.out.println(r.formatted_address);

        }

        bufferedReader.close();
    }

    
}
    

    

