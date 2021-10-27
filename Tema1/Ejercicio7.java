import java.util.*;

class Ejercicio7 {
  
    public static void main(String args[]) {
     
        double pi, pf;
        double descuento;
       
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el precio inicial ");
        pi = entradaTeclado.nextDouble();

        System.out.println("Introduce el precio final ");
        pf = entradaTeclado.nextDouble(); 

        entradaTeclado.close();

        descuento = (pi - pf) / pi * 100;

	    System.out.println("el descuento es de = " + descuento + "%" );  
    }
    
}