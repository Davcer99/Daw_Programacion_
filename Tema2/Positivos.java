import java.util.Scanner;

public class Positivos {
    
   
   public static int positivos (int[] numeros){

       int positivos = 0;

       for (int i = 0; i < numeros.length; i++) {
           if (numeros[i] >= 0 ){
               positivos += 1;
           }
        }
        return positivos;

    }
   
    public static void main(String[] args) {
       
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

        System.out.println("Hay " + positivos(numeros)+ " numeros positivos");
    }
}
