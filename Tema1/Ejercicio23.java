import java.util.Scanner;

public class Ejercicio23 {
    
    public static void main(String args[]){
    
        double numero;
        int numeros_positivos = 0, numeros_negativos = 0;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
         
        while ( true ) {
            System.out.println("Introduce un numero ");
            numero = entradaTeclado.nextDouble();

            if(numero > 0) {
                numeros_positivos ++;
            }else if (numero < 0) {
                numeros_negativos ++;
            }
            if (numero == 0) {
                break;
            }
        }
        
        entradaTeclado.close();
        
        System.out.println("Has introducido " + numeros_positivos + " numeros positivos y " + numeros_negativos + " numeros negativos");

  

    }
        
}