import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String args[]) {
        int nota;
          
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce tu nota ");

        nota = entradaTeclado.nextInt();

        entradaTeclado.close();

        if (nota >= 0 && nota < 3){
            System.out.println("Nota muy deficiente");
        }else if(nota >= 3 && nota < 5){
            System.out.println("Nota insuficiente");
        }else if(nota >= 5 && nota < 6){
            System.out.println("Nota suficiente");
        }else if(nota >= 6 && nota < 7){
            System.out.println("Nota bien");
        }else if(nota >= 7 && nota < 9){
            System.out.println("Nota notable");
        }else if(nota >= 9 && nota <= 10){
            System.out.println("Nota sobresaliente");
        }
    }
}