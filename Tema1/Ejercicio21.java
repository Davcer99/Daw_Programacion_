import java.util.Scanner;

public class Ejercicio21 {
    
    public static void main(String args[]){
    
        double año;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce el año ");
        año = entradaTeclado.nextDouble();

        entradaTeclado.close();

        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
            System.out.println("El año es bisiesto");

        }else {
            System.out.println("El año no es bisiesto");
        }
  

    }
        
}