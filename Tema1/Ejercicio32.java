import java.util.Scanner;

public class Ejercicio32 {
    
    public static void main(String args[]){
    
        int entrada;
        int[] numeros;

        numeros = new int[10];

        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        for (int i = 0;i < 10; i++ ){
            System.out.println("Introduce un numero: ");  
            entrada = entradaTeclado.nextInt();
            numeros [i] = entrada;
        }
        
        entradaTeclado.close();
        
        System.out.println("Los numeros introducidos en el orden inverso es el siguiente: ");
        
        for (int x = 9; x <= 10 || x == 0; x--){

            System.out.println(numeros[x]);
        } 
    }     
}