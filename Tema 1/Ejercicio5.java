import java.util.*;

class Ejercicio5 {
  
    public static void main(String args[]) {
     
        float x;
        float y;
        float suma;
        float resta;
        float multiplicacion;
        float division;
	      
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero ");
        
        x = entradaTeclado.nextFloat();

        System.out.println("Introduce el segundo numero ");

        y = entradaTeclado.nextFloat(); 

        entradaTeclado.close();
	    
        suma = x + y;
        resta = x - y;
        multiplicacion = x * y;
        division = x / y;

	    System.out.println("suma = "+ suma +  
                           "\nresta = " + resta + 
                           "\nmultiplicacion = " + multiplicacion +
                           "\ndivision = " + division );  
    }
    
}
