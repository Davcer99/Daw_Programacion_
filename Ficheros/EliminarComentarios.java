import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarComentarios {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("./archivos/prueba.java");
        BufferedReader bf1 = new BufferedReader(fr1);
        FileWriter f_out = new FileWriter("./archivos/pruebaSinComentarios.java");

        String linea = bf1.readLine();

        while (linea != null) {
            if (linea.contains("//")) {
                String[]cadenas = linea.split("//");
                linea = cadenas[0];
            }
            
            f_out.write(linea);
            linea = "\n";
            f_out.write(linea);
            linea = bf1.readLine();
        }

        fr1.close();
        bf1.close();
        f_out.close();
    }
}