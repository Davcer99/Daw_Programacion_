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
    private String id;
    private String email;

    //constructor
    public Cliente(String nif, String nombre, String apellidos, String email, String id) {
        super(nif, nombre, apellidos);
        this.email = email;
        this.id = id;
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

    public String getId() {
        return id;
    }

    //to string
    @Override
    public String toString() {
        return "nif:\t" + nif +
                "nombre:\t" + nombre +
                "apellidos:\t" + apellidos +
                "id:\t" + id +
                "email:\t" + email;
    }    
}
    

    

