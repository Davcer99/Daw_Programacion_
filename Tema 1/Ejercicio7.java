import java.util.*;

class Ejercicio7 {
  
    public static void main(String args[]) {
     
        int pi;
        int pf;
        int descuento;
       
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el precio inicial ");
        
        pi = entradaTeclado.nextInt();

        System.out.println("Introduce el precio final ");

        pf = entradaTeclado.nextInt(); 

        entradaTeclado.close();

        descuento = (pi - pf) / pi * 100;

	    System.out.println("el descuento es de = " + descuento + "%" );  
    }
    
}