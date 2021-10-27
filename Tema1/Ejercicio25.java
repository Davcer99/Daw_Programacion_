import java.util.Scanner;

public class Ejercicio25 {
    
    public static void main(String args[]){
    
        double numero, resultado = 1;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        numero = entradaTeclado.nextDouble();
        entradaTeclado.close();

        while (numero != 0){
             
            resultado = resultado * numero;
            numero--;
        }
        
        System.out.println("El resultado del factorial es: " + resultado);
  

    }
        
}