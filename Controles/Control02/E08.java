package Control02;

import java.util.Scanner;

public class E08 {
    public static void main (String []args){


        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.print("Ingrese numero: ");
        double numero = entradaTeclado.nextDouble();

        entradaTeclado.close();

        long entera = (long) numero;
        double decimal = numero - entera;

        System.out.println(decimal);
    }
}