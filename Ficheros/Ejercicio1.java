import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
   
   private static void imprimirDirectorio(File f) throws IOException {

       if (f.exists()) {

           if (f.isDirectory()) {

               System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());

               System.out.println("---------------------------------------------------");
               System.out.println("0.- Directorio padre");

               int num = 1;
                for (File e : f.listFiles()){
                   
                    if (!e.isHidden()) {

                        if (e.isFile()) {
            
                            System.out.println(num + ".- " + e.getName() + " " + e.length());
                            num++; 
                        }
            
                        if (e.isDirectory()){
            
                            System.out.println(num + ".- " +e.getName() + " <Directorio>");
                            num++;
                        }
            
                    }
                }

           } else {

               System.out.println("No es un directorio");

           }

       } else {

           System.out.println("No existe el directorio");

       }

   }

   public static void main(String[] args) throws IOException {

       File f = File.listRoots()[0];
        ArrayList <String> l1 = new ArrayList<String>();
        for (String string : f.list()) {
            l1.add(string);
        }

        Scanner sc = new Scanner(System.in);
        int value;
        while (true) {
            try {

                imprimirDirectorio(f);
     
            } catch(IOException e) {
     
                System.out.println("No existe el directorio");
     
            } 
            System.out.println("Introduce una opción (-1 para finalizar)");
            value = sc.nextInt();
        }
    }
}