import java.util.*;
class Ejercicio4
{
    
    public static void main(String args[])
    {
	    Scanner entrada = new Scanner(System.in);
        
        System.out.println("Enter the side: ");
        
        int lado= entrada.nextInt();
	    
        int resultado = lado*lado;

	    System.out.print(resultado);
    }
}