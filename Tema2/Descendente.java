import java.util.Scanner;

public class Descendente {
    public static void ascendente (int n1, int n2){
        if ( n1 > n2){
            System.out.println("El orden de los valores ascendente es: " + n2 + " " + n1);
        }else {
            System.out.println("El orden de los valores ascendente es: " + n1 + " " + n2);
        } 
    }

    public static void main(String[] args) {
        int n1, n2;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        n1 = entradaTeclado.nextInt();

        System.out.println("Introduce un numero");
        n2 = entradaTeclado.nextInt();

        entradaTeclado.close();

        ascendente(n1, n2);
    }
}