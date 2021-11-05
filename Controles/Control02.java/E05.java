package Control02;

import java.util.Scanner;

public class E05 {
    public static void main (String []args){
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.print("Ingrese numero: ");
        String numero = entradaTeclado.next();

        entradaTeclado.close();
       
        for ( int i = 2; i != -1; i--){
            System.out.print(numero.charAt(i));
        } 
    }  
    
}
