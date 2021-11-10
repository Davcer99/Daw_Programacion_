import java.util.Scanner;

public class LetraDni {

    public static void letraDni (int numero) {
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int operacion;
        
        operacion = numero % 23;

        System.out.println("Tu dni conmpleto sera:" + numero + letras[operacion]);  
    }

    public static void main(String[] args) {
       
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce los numeros de tu DNI");
        letraDni(entradaTeclado.nextInt());
        entradaTeclado.close();
    }
    
}
 