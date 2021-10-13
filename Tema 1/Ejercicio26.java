import java.util.Scanner;

public class Ejercicio26 {
    
    public static void main(String args[]){
    
        int numero, resultado = 1,i = 0;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        numero = entradaTeclado.nextInt();
        entradaTeclado.close();

        while ( i != 10){
             
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }
    }       
}