package Control02;

import java.util.Scanner;

public class E04 {
    public static void main (String []args){

        double resultado;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.print("Ingrese longitud: ");
        double medida = entradaTeclado.nextDouble();

        entradaTeclado.close();
       
        resultado = medida / 2.54f;

        System.out.println(medida + "cm = " + resultado + "in" );  
    }
}
