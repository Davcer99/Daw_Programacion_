package Control02;

import java.util.Scanner;

public class E08 {
    public static void main (String []args){


        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.print("Ingrese numero: ");
        double numero = entradaTeclado.nextDouble();

        entradaTeclado.close();

        long iPart = (long) numero;
        double fPart = numero - iPart;

        System.out.println(fPart);
    }
}