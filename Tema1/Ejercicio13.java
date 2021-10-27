import java.util.*;

class Ejercicio13 {
  
    public static void main(String args[]) {
     
        double valor1;
        double valor2;
        double orden;
        double mayor;
        double menor;
        
        
       
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.println("Introduce el valor  ");
        
        valor1 = entradaTeclado.nextFloat();

        System.out.println("Introduce el valor ");

        valor2 = entradaTeclado.nextFloat(); 

        System.out.println("Ordenar en valor ascendente (1) o descendente(2)");

        orden = entradaTeclado.nextInt();

        entradaTeclado.close();

        if (orden == 1){
            if (valor1 > valor2){
                mayor = valor1;
                menor = valor2;
           }else{
               mayor = valor2;
               menor = valor1;
           }
        }else{
            if (valor1 > valor2){
                mayor = valor2;
                menor = valor1;
           }else{
               mayor = valor1;
               menor = valor2;
           }
       }

        

        

	    System.out.println("El orden es el siguiente: " + menor + " " + mayor);  
    }
}