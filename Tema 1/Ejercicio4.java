import java.util.*;

class Ejercicio4
{
    
    public static void main(String args[])
    {
        float x;
        float resultado;
	      
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        x = entradaTeclado.nextFloat();

        entradaTeclado.close();
	    
        resultado = x*x;

	    System.out.println(resultado);
    }
}