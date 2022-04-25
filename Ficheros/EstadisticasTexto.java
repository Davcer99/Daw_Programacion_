import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Crea un programa que analize un fichero de texto plano y que muestre las siguientes Estadisticas numero de letras numero de palabras
numero de lineas porcentaje de vocales y porcentaje de consonantes
i porcentaje de espacios y porcentaje de tabuladores*/
public class EstadisticasTexto {

    public static void main(String[] args) throws IOException {
        
        FileReader f_in = new FileReader("./archivos/");
        BufferedReader bf_1 = new BufferedReader(f_in);

        int contadorLineas = 0;
    
        String lineaFichero = bf_1.readLine();

        while (lineaFichero != null) {
            
        }



    }
    
}
