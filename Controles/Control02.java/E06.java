package Control02;

import java.util.Scanner;

public class E06 {
    public static void main (String []args){

        double resultado;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.print("Ingrese cateto a: ");
        double medida = entradaTeclado.nextDouble();

        entradaTeclado.close();
       
        resultado = medida / 2.54f;

        System.out.println(medida + "cm = " + resultado + "in" );  
    }
}
