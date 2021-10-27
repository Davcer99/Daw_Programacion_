import java.util.Scanner;

public class Ejercicio22 {
    
    public static void main(String args[]){
    
        double numero;
        int i = 0, numeros_positivos = 0, numeros_negativos = 0;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
         
        while ( i < 10 ) {
            System.out.println("Introduce un numero ");
            numero = entradaTeclado.nextDouble();

            if(numero >= 0) {
                numeros_positivos ++;
            }else {
                numeros_negativos ++;
            }
            i ++;
        }
        entradaTeclado.close();
        System.out.println("Has introducido " + numeros_positivos + " numeros positivos y " + numeros_negativos + " numeros negativos");

  

    }
        
}