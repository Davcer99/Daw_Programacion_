import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args){
        int tamaño = 0;
        String[] cadenas = new String[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner;
        miScanner = new Scanner(System.in);
        miScanner.close();
        
        for (int i = 0; i < cadenas.length; i++){
            cadenas[i] = miScanner.next();
        }

        for (int i = 0; i < cadenas.length; i++){
           if ( tamaño > cadenas[i].length()) {
                tamaño = cadenas[i].length();
            }
        }

        System.out.println();
    }
}
