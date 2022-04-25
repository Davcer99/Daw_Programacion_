import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mezclar2 {
    public static void main(String[] args) throws IOException {
        
        FileReader fr1 = new FileReader("./archivos/f1.txt");
        BufferedReader lectorPrimerFichero = new BufferedReader(fr1); 
        
        FileReader fr2 = new FileReader("./archivos/f2.txt");
        BufferedReader lectorSegundoFichero = new BufferedReader(fr2);

        FileWriter ficheroMezcla = new FileWriter("./archivos/f3.txt");

        String lineaPrimerFichero = lectorPrimerFichero.readLine();
        String lineaSegundoFichero = lectorSegundoFichero.readLine();
        

        while (lineaPrimerFichero != null || lineaSegundoFichero != null) {
            if (lineaPrimerFichero != null){
               ficheroMezcla.write(lineaPrimerFichero);
               lineaPrimerFichero = "\n";
               ficheroMezcla.write(lineaPrimerFichero);
               lineaPrimerFichero = lectorPrimerFichero.readLine();
            }
            if (lineaSegundoFichero != null){
                ficheroMezcla.write(lineaSegundoFichero);
                lineaSegundoFichero = "\n";
                ficheroMezcla.write(lineaSegundoFichero);
                lineaSegundoFichero = lectorSegundoFichero.readLine();   
            }
        }
        lectorPrimerFichero.close();
        lectorSegundoFichero.close();
        ficheroMezcla.close();
    }  
}


