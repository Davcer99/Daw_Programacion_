import java.util.Scanner;

public class Ejercicio34 {
    
    public static void main(String args[]){
    
        int numero, operacion;
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce los numeros de tu DNI");
        numero = entradaTeclado.nextInt();
        entradaTeclado.close();

        operacion = numero % 23;

        System.out.println("Tu dni conmpleto sera:" + numero + letras[operacion]);  
    }     
}
