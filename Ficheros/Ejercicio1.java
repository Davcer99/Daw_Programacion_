import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
   
   private static void imprimirDirectorio(File f) throws IOException {

       if (f.exists()) {

           if (f.isDirectory()) {

               System.out.println("Lista de ficheros y directorios del directorio: " + f.getCanonicalPath());

               System.out.println("---------------------------------------------------");
               if (f.getParent() != null) {
                    System.out.println("0.- Directorio padre"); 
               }
               DateFormat formatter;

                
               formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
               

               int num = 1;
                for (File e : f.listFiles()){
                   
                    if (!e.isHidden()) {

                        if (e.isFile()) {
                            
                            System.out.println(num + ".-\t"+ generatePermisos(e) +"\t"+ String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());
                            num++; 
                        }
            
                        if (e.isDirectory()){
                            
                            System.out.println(num + ".-\t"+ generatePermisos(e) +"\t"+ String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.getName());
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

private static String generatePermisos(File f) {
    String permisos= "";
       
    if (f.isDirectory()){
        permisos+= "d";
    }else{
        permisos+="-";
    }
    if (f.canRead()){
        permisos+= "r";
    }else{
        permisos+= "-";
    }
    if (f.canWrite()){
        permisos += "w";
    }else{
        permisos += "-";
    }
    if (f.canExecute()){
        permisos += "x";
    }else{
        permisos += "-";
    }
    return permisos;
        
}
    
   private static int leerOpcion(){
        Scanner sc = new Scanner(System.in);
        String entradaUsuario = "";
        int resultado = 0;

        System.out.println("Introduce una opción (-1 para finalizar)");
        entradaUsuario= sc.nextLine();
        resultado= Integer.parseInt(entradaUsuario);
        return resultado;
   }

   public static void main(String[] args) throws IOException {

        File actualFile = File.listRoots()[0];
        int opcion;
        
        do {
            imprimirDirectorio(actualFile);
            opcion = leerOpcion();
            if (opcion >= 1 && opcion <= actualFile.listFiles().length) {
                if (actualFile.listFiles()[opcion-1].isDirectory()&& actualFile.listFiles()[opcion-1].canRead()){
                    actualFile = actualFile.listFiles()[opcion-1];
                }
                
            }else if (actualFile.getParent() != null && opcion == 0){
                actualFile = actualFile.getParentFile();
            }
        } while (opcion != -1);
       
    }
}
