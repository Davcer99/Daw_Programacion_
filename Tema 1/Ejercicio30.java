import java.util.Scanner;

public class Ejercicio30 {
    
    public static void main(String args[]){
    
        int tamaño, mitad;
        String palabra;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce la palabra: ");
        palabra = entradaTeclado.next();
        entradaTeclado.close();

        tamaño = palabra.length();
        mitad = tamaño / 2;
        
        for (int i = 0;i >= mitad; i++){
            char char1 = palabra.charAt(i);
            char char2 = palabra.charAt(i + mitad);
            if (char1 == char2){
                
            }
        }
    }     
}