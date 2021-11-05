package Control02;

import java.util.Scanner;

public class E06 {
    public static void main (String []args){

        double cateto_a , cateto_b, resultado;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.print("Ingrese cateto a: ");
        cateto_a = entradaTeclado.nextDouble();

        System.out.print("Ingrese cateto b: ");
        cateto_b = entradaTeclado.nextDouble();

        entradaTeclado.close();
       
        resultado = Math.hypot(cateto_a, cateto_b);

        System.out.println("La hipotenusa es " + resultado);  
    }
}
