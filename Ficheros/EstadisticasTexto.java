import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Crea un programa que analize un fichero de texto plano y que muestre las siguientes Estadisticas numero de letras numero de palabras
numero de lineas porcentaje de vocales y porcentaje de consonantes
i porcentaje de espacios y porcentaje de tabuladores */
public class EstadisticasTexto {

    public static void main(String[] args) throws IOException {
        
        FileReader f_in = new FileReader("./archivos/textoPrueba.txt");
        BufferedReader bf_1 = new BufferedReader(f_in);

    
        String lineaFichero = bf_1.readLine(); 
        String [] palabras;
        int numPalabras = 0;
        int numLetras = 0;
        int numLineas = 0;
        int vocales = 0;
        int consonantes = 0;
        int tabuladores = 0;
        int espacios = 0;
        int totalCaracteres = 0;

        
        while (lineaFichero != null) {
        
            for (int x = 0; x < lineaFichero.length(); x++) {
                char letraActual = lineaFichero.charAt(x);
                if (Character.isLetter(letraActual)){
                    numLetras++;
                }
                if (letraActual == '\t'){
                    tabuladores++;
                }
                if (letraActual == ' '){
                    espacios ++;
                }
                if (esVocal(letraActual)){
                    vocales++;
                } else {
                    consonantes ++;
                }
                totalCaracteres++;
            }
            palabras = lineaFichero.split(" ");
            numPalabras += palabras.length;
            numLineas ++;
            lineaFichero = bf_1.readLine();
        }

        int porcentajeVocales = (vocales*100)/numLetras;
        int porcentajeConsonantes = (consonantes*100)/numLetras;
        int porcentajeTabuladores = (tabuladores * 100)/totalCaracteres;
        int porcentajeEspacios = (espacios* 100)/totalCaracteres;

        System.out.printf("En el archivo de texto hay %d letras, %d palabras, %d lineas, porcentaje de vocales: %d , porcentaje de consonantes: %d , porcentaje tabuladores %d , porcentaje espacios: %d", numLetras, numPalabras, numLineas, porcentajeVocales,porcentajeConsonantes, porcentajeTabuladores, porcentajeEspacios);
        
        bf_1.close();
        
    }

    private static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }
    
}
