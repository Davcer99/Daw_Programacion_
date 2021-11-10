import java.util.Scanner;

public class EsPrimo {

    public static boolean esPrimo(int numero) {
       
        int contador = 0;

        for(int i = 1; i <= numero; i++){
            if((numero % i) == 0){
                contador++;
            } 
        }
        
        return (contador <= 2);
    }
    
    public static void main(String[] args) {
        int numero;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        numero = entradaTeclado.nextInt();
        entradaTeclado.close(); 

        System.out.println(esPrimo(numero));
    }
}
