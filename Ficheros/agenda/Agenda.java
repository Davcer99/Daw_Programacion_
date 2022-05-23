import java.io.FileWriter;
import java.io.IOException;

public class Agenda extends Usuario {
    public Agenda() {
        super();
    }

    public void pedirUsuarios(){
        for (Usuario usuario : super.getListadoUsuarios()) {
           System.out.println(usuario.toString());  
        }
    }

    public void imprimirAgenda() throws IOException{
        FileWriter ficheroSalida = new FileWriter("./archivos/agenda.dat");
        for (Usuario usuario : super.getListadoUsuarios()) {
            ficheroSalida.write(usuario.toString());  
        }
        ficheroSalida.close();
    }

    public void imprimirListadoTexto(){

    }
    public void imprimirObjetos(){
        
    }

    
    
}
