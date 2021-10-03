import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]) {
        double edad;
          
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce tu edad ");

        edad = entradaTeclado.nextFloat();

        entradaTeclado.close();

        if (edad >= 18){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
    }
}