import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {
        float radio;
        float longitud;
        float area;
        final float PI = (float)3.14159;
        
	      
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        radio = entradaTeclado.nextFloat();

        entradaTeclado.close();

        longitud = 2 * PI * radio;
        
	    area = PI * radio * radio;
        

	    System.out.println("Longitud = " + longitud +
                           "\narea = " + area);
    } 
}
