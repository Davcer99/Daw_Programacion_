import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class Agenda {
    private final String nombreFicheroTexto = "agende.dat";
    private final String nombreFicherosObjetos = "agnedaObjetos.dat";

   private Scanner  lector;

   private FileWriter ficheroTexto;
   private PrintWriter escritorTexto;

   private FileOutputStream ficheroObjetos;
   private ObjectOutputStream escritorObjetos;

   public Agenda(){
       this.lector = new Scanner(System.in);
       try{
           this.ficheroTexto = new FileWriter(nombreFicheroTexto, true);
           escritorTexto = new PrintWriter(this.ficheroTexto);
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            this.ficheroObjetos = new FileOutputStream(nombreFicherosObjetos, true);
            this.escritorObjetos = new ObjectOutputStream(this.ficheroObjetos);
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
   
    public Usuario pedirUsuario(){
        Usuario nuevUsuario= new Usuario();
        
        System.out.println("Introducir el nombre");
        nuevUsuario.setNombre(lector.nextLine());
        System.out.println("Introducir los apellidos");
        nuevUsuario.setApellidos(lector.nextLine());
        System.out.println("Introducir el email");
        nuevUsuario.setEmail(lector.nextLine());
        System.out.println("Introducir el telefono");
        nuevUsuario.setTelefono(lector.nextLine());
        lector.close();

        this.escritorTexto.println(nuevUsuario);

        try {
            this.escritorObjetos.writeUnshared(nuevUsuario);
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        return nuevUsuario;
    
    }


    public void imprimirListadoTexto() throws IOException{
        BufferedReader lectorTexto = new BufferedReader(new FileReader(this.nombreFicheroTexto));

        String linea = lectorTexto.readLine();

        while (linea != null){
            String[] elementos = linea.split("\t");

            System.out.println(elementos[0] + "," +
                                elementos[1] + "," + 
                                elementos[2] + "," +
                                elementos[3]);
            linea = lectorTexto.readLine();
        }
        lectorTexto.close();
    }

    
    public void imprimirObjetos() throws FileNotFoundException, IOException{
        ObjectInputStream lectorObjetos = new ObjectInputStream(new FileInputStream(this.nombreFicherosObjetos));

        while(true){
            try {
                Usuario usuario = (Usuario) lectorObjetos.readObject();

                System.out.println(usuario.getNombre() + "-" +
                                usuario.getApellidos() + "-" + 
                                usuario.getTelefono() + "-" +
                                usuario.getEmail());

            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (EOFException e) {
                lectorObjetos.close();
            }
        }
    }

    public void terminar(){
        try {
            this.escritorObjetos.close();
            this.ficheroObjetos.close();
            this.ficheroTexto.close();
            this.ficheroObjetos.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }  
}
