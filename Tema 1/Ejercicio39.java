import java.util.Scanner;

public class Ejercicio39 {
    public static void main (String[]args){
        Scanner lector = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un numero natural: ");
        numero = lector.nextInt();
        lector.close();

        for (int i = 1; i <= numero; i++){
            if ((numero % i) == 0){
                System.out.print( i + "   ");
            }
        }  
    }
}