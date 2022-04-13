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
        boolean comentario= false;

        while (linea != null) {

            // comprobar si es un comentario multilinea 
            if (linea.contains("/*")) {
                comentario = true;
            }

            //comprobar si hay un comentario en la linea y si es asi aislarlo y no imprimirlo
            if (linea.contains("//") && comentario == false) {
                String[]cadenas = linea.split("//");
                linea = cadenas[0];
                comentario = false;
            }

            //comprobar si es una linea en blanco y no imprimirla
            if (esUnaLineaEnBlanco(linea)) {
                comentario = true;
            }
        
            if (comentario == false) {
                // eliminar todos los espacios de las lineas antes de imprimir
                linea = linea.replaceAll("  ","");
                //imprimir las lineas si no son comentarios 
                f_out.write(linea);
                linea = "\n";
                f_out.write(linea); 
            }

            //resetear el booleano de comentario para que siga imprimiendo
            if (esUnaLineaEnBlanco(linea)) {
                comentario = false;
            }

            // comprobar a ver si ya se ha acabado el comentario multilinea
            if (linea.contains("*/")) {
                comentario = false;
            }

            // actualizar la linea leida
            linea = bf1.readLine();
        }
        
        //cerrar los lectores de archivos
        fr1.close();
        bf1.close();
        f_out.close();
    }

    //este método nos permite comprobar si una linea esta en blanco de la siguiente manera:
    public static boolean esUnaLineaEnBlanco(String str){

        /* primero se eliminan todos los espacios en blanco de la linea con trim()
         y luego comprobamos si la linea esta vacia con el método isEmpty()*/
        if (str.trim().isEmpty()){
            return true;
        }else{
            return false;
        }
    } 
}