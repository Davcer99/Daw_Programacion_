package Control02;

import java.util.Scanner;

public class E02 {
    public static void main (String []args){

        double area, perimetro;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        int radio = entradaTeclado.nextInt();

        entradaTeclado.close();
       
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * (radio * radio);

        System.out.println("Perimetro: " + perimetro + "\nÁrea: " + area);  
    } 
}