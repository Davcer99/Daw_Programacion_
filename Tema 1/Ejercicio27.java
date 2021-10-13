import java.util.Scanner;

public class Ejercicio27 {
    
    public static void main(String args[]){
    
        int numero, i = 1;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        numero = entradaTeclado.nextInt();
        entradaTeclado.close();

        while (numero != (i - 1)){
            System.out.print(i + ", ");
            i ++;
        }
    }     
}