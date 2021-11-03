import java.util.Scanner;

public class Ejercicio38 {
    public static void main (String[]args){
        Scanner lector = new Scanner(System.in);
        String palabra;
        int vocales = 0;

        System.out.println("Introduce una palabra: ");
        palabra = lector.next();
        lector.close();

        for (int i = 0; i < palabra.length(); i++){
            if (palabra.charAt(i) == 'a'| palabra.charAt(i) == 'e' | palabra.charAt(i) == 'i' | palabra.charAt(i) == 'o' | palabra.charAt(i) == 'u' ){
                vocales += 1;
            }
        }

        System.out.println("Hay " + vocales + " vocales en la palabra introducida");
    }
}
