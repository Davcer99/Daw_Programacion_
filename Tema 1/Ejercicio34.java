import java.util.Scanner;

public class Ejercicio34 {
    
    public static void main(String args[]){
    
        int operacion, numero_calculo = 0;
        String numero, numero_print, X, Y, Z;
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letra;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce los numeros de tu DNI");
        numero = entradaTeclado.next();
        entradaTeclado.close();

        numero_print = numero;
        
        letra = numero.charAt(0);
       
        if (letra == 'X'){
            X = numero.replaceAll("X", "0");
            numero_calculo = Integer.valueOf(X);
        }else if (letra == 'Y'){
            Y = numero.replaceAll("Y", "1");
            numero_calculo = Integer.valueOf(Y);
        }else if (letra == 'Z'){
            Z = numero.replaceAll("Z", "2");
            numero_calculo = Integer.valueOf(Z);
        }

       operacion = numero_calculo % 23;

       System.out.println("Tu dni conmpleto sera:" + numero_print + letras[operacion]);  
    }     
}