import java.util.Scanner;

public class Ejercicio32 {
    
    public static void main(String args[]){
    
        int entrada;
        int[] dias;

        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce la palabra: ");
        
        for (int i = 0; )
        entrada = entradaTeclado.nextInt();
        
        entradaTeclado.close();
        
        dias = new int[7];
        
        dias[0] = 5;
        dias[1] = 3;

        for (int i = 0; i < 7; i++){
            System.out.println(dias[i]);
        }
        
    }     
}