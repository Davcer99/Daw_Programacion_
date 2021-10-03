import java.util.*;

class Ejercicio11 {
  
    public static void main(String args[]) {
     
        float valor1;
        float valor2;
        float mayor;
        float menor;
        
       
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el valor  ");
        
        valor1 = entradaTeclado.nextFloat();

        System.out.println("Introduce el valor ");

        valor2 = entradaTeclado.nextFloat(); 

        entradaTeclado.close();

        if (valor1 > valor2){
             mayor = valor1;
             menor = valor2;
        }else{
            mayor = valor2;
            menor = valor1;
        }

	    System.out.println("El orden de los numeros en orden de valor ascendente es el siguiente: " + menor + "  " + mayor );  
    }
    
}
