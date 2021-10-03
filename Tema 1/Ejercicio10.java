import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]) {
        double numero;
          
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero ");

        numero = entradaTeclado.nextFloat();

        entradaTeclado.close();

        if (numero >=0){
            System.out.println("El numero es positivo ");
        }else {
            System.out.println("El numero es negativo ");
        }

    }
}