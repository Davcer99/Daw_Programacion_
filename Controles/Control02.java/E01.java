package Control02;

import java.util.Scanner;

public class E01 {
    public static void main (String []args){

        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = entradaTeclado.nextLine();

        entradaTeclado.close();
       
        System.out.println("Hola, " + nombre );  
    }
}
