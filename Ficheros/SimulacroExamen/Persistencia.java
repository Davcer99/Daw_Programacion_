package SimulacroExamen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Persistencia{
    private static final String nombreFichero = "clientes.dat";
        
    //escribir clientes 
    public void write(ArrayList<Cliente> clientes){

        FileWriter ficheroEscritura;
        BufferedWriter escritor;

        try {
            ficheroEscritura = new FileWriter(nombreFichero);
            escritor = new BufferedWriter(ficheroEscritura);

            for (Cliente cliente : clientes) {
                String linea = cliente.getId() + "," +
                                cliente.getNif() + "," +
                                cliente.getNombre() + "," +
                                cliente.getApellidos() + "," +
                                cliente.getEmail() + "\n";
                escritor.write(linea);
            }

            escritor.close();

        } catch (IOException e) {
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
                Cliente cliente = new Cliente(trozos[1], trozos[2], trozos[3], trozos[0]);
                resultado.add(cliente);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultado;
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

    
