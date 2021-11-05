package Control02;

import java.util.Scanner;

public class E03 {
    public static void main (String []args){

        double media;
        double nota1, nota2, nota3, nota4;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.print("Primera nota: ");
        nota1 = entradaTeclado.nextDouble();

        System.out.print("Seguda nota: ");
        nota2 = entradaTeclado.nextDouble();

        System.out.print("Tercera nota: ");
        nota3 = entradaTeclado.nextDouble();

        System.out.print("Cuarta nota: ");
        nota4 = entradaTeclado.nextDouble();

        entradaTeclado.close();
       
        media = (nota1 + nota2 + nota3 + nota4 ) / 4;
       
        System.out.println("El promedio es: " + media);  
    } 
}
