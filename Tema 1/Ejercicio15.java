import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String args[]) {
        int numero;
          
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero del 1 al 10 ");

        numero = entradaTeclado.nextInt();

        entradaTeclado.close();

        if (numero == 1){
            System.out.println("Valor introducido: uno ");
        }else if(numero == 2){
            System.out.println("Valor introducido: dos");
        }else if(numero == 3){
            System.out.println("Valor introducido: tres");
        }else if(numero == 4){
            System.out.println("NValor introducido: cuatro");
        }else if(numero == 5){
            System.out.println("Valor introducido: cinco");
        }else if(numero == 6){
            System.out.println("Valor introducido: seis");
        }else if(numero == 7){
            System.out.println("Valor introducido: siete");
        }else if(numero == 8){
            System.out.println("Valor introducido: ocho");
        }else if(numero == 9){
            System.out.println("Valor introducido: nueve");
        }else if(numero == 10){
            System.out.println("Valor introducido: diez");
        }else {
            System.out.println("Debes introducir un valor del 1 al 10 ");
        }
    }
}

