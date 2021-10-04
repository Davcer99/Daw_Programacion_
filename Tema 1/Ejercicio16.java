import java.util.*;

class Ejercicio16 {
  
    public static void main(String args[]) {
     
        double valor1, valor2;
        char operacion;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el valor  ");
        valor1 = entradaTeclado.nextFloat();

        System.out.println("Introduce la operacion que desea realizar + - *  /");
        operacion = entradaTeclado.next();
        
        System.out.println("Introduce el valor ");
        valor2 = entradaTeclado.nextFloat(); 

        entradaTeclado.close();

	    System.out.println("El valor mayor es: ");  
    }
    
}