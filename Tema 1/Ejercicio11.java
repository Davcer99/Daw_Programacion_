import java.util.*;

class Ejercicio11 {
  
    public static void main(String args[]) {
     
        float valor1;
        float valor2;
        float mayor_valor;
        
        
       
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el valor  ");
        
        valor1 = entradaTeclado.nextFloat();

        System.out.println("Introduce el valor ");

        valor2 = entradaTeclado.nextFloat(); 

        entradaTeclado.close();

        if (valor1 > valor2){
             mayor_valor = valor1;
        }else{
            mayor_valor = valor2;
        }

	    System.out.println("El valor mayor es: "+ mayor_valor);  
    }
    
}
