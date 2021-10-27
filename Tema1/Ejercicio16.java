import java.util.*;

class Ejercicio16 {
  
    public static void main(String args[]) {
     
        int valor1, valor2;
        String operacion;
        int resultado = 0;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el valor  ");
        valor1 = entradaTeclado.nextInt();

        System.out.println("Introduce la operacion que desea realizar + - *  /");
        operacion = entradaTeclado.next();
        
        System.out.println("Introduce el valor ");
        valor2 = entradaTeclado.nextInt(); 

        entradaTeclado.close();

        if (operacion.equals("+")){
            resultado = valor1 + valor2;
        }else if (operacion.equals("-")) {
            resultado = valor1 - valor2;
        }else if (operacion.equals("*")) {
            resultado = valor1 * valor2;
        }else if (operacion.equals("/")) {
            resultado = valor1 / valor2;
        }

	    System.out.println("El resultado de la operacion introducida es: " + valor1 +" "+ operacion +" "+ valor2 + " = " + resultado );  
    }
    
}