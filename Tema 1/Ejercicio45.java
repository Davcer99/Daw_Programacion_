import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        int numero, i = 0, digito;
        double binario = 0;
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.print("Introduce un numero : ");                                                
        numero = entradaTeclado.nextInt();
        entradaTeclado.close();

    
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, i);                                                   
                i++;
                numero = numero/2;
        }
        System.out.printf("Binario: " + binario);
    }
}