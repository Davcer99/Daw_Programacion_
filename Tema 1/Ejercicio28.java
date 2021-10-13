import java.util.Scanner;

public class Ejercicio28 {
    
    public static void main(String args[]){
    
        int contador = 0, I, numero;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        numero = entradaTeclado.nextInt();
        entradaTeclado.close();
 
        for(I = 1; I <= numero; I++){
            if((numero % I) == 0){
                contador++;
            }
            
        }
        if(contador <= 2){
            System.out.println("El numero es primo");
         }else{
             System.out.println("El numero no es primo");
        }
    }     
}