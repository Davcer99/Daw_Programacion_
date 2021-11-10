import java.util.Scanner;

public class Mayor {

    public static void mayorEdad (int edad){
        if ( edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
    
    public static void main(String[] args) {

        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        mayorEdad(entradaTeclado.nextInt());
        entradaTeclado.close();
    }
}