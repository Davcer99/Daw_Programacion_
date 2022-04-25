import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarComentarios {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("./archivos/prueba.java");
        BufferedReader lectorFichero = new BufferedReader(fr1);
        FileWriter archivoSalida = new FileWriter("./archivos/pruebaSinComentarios.java");

        String lineaFichero = lectorFichero.readLine();
        boolean esUnComentario= false;

        while (lineaFichero != null) {

            // comprobar si es un comentario multilinea 
            if (lineaFichero.contains("/*")) {
                esUnComentario = true;
            }

            //comprobar si hay un comentario en la linea y si es asi aislarlo y no imprimirlo
            if (lineaFichero.contains("//") && esUnComentario == false) {
                String[]cadenas = lineaFichero.split("//");
                lineaFichero = cadenas[0];
                esUnComentario = false;
            }

            //comprobar si es una linea en blanco y que no la imprima
            if (esUnaLineaEnBlanco(lineaFichero)) {
                esUnComentario = true;
            }
        
            if (esUnComentario == false) {
                // eliminar todos los espacios de las lineas antes de imprimir
                lineaFichero = lineaFichero.replaceAll("  ","");
                //imprimir las lineas si no son comentarios 
                archivoSalida.write(lineaFichero);
                lineaFichero = "\n";
                archivoSalida.write(lineaFichero); 
            }

            //resetear el booleano de comentario para que siga imprimiendo
            if (esUnaLineaEnBlanco(lineaFichero)) {
                esUnComentario = false;
            }

            // comprobar a ver si ya se ha acabado el comentario multilinea
            if (lineaFichero.contains("*/")) {
                esUnComentario = false;
            }

            // actualizar la linea leida
            lineaFichero = lectorFichero.readLine();
        }
        
        //cerrar los lectores de archivos
        fr1.close();
        lectorFichero.close();
        archivoSalida.close();
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