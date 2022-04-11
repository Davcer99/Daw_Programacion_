import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("./archivos/prueba.txt");
        BufferedReader bf1 = new BufferedReader(fr1); 

        Scanner sc = new Scanner(System.in);
        System.out.println("Que palabra deseas contar?");
        String palabra = sc.nextLine();
        sc.close();

        String linea = bf1.readLine();
        int vecesRepetida = 0;

        while (linea != null) {
            vecesRepetida += contarRepeticiones(linea, palabra);
            linea = bf1.readLine();
        }

        System.out.println("La palabra " + palabra + " se repite " + vecesRepetida + " veces en el texto.");
        bf1.close();
        fr1.close();
    }

    public static int contarRepeticiones(String cadena, String palabra) {
        int cnt = 0;
        String[] palabras = cadena.split("\\s+");
        for (String word : palabras) {
            if (palabra.equals(word)){
                cnt++;
            }
        }
        return cnt;
    }
}
