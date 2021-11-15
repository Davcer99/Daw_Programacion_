import java.util.Scanner;

public class Ejercicio43 {
    
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        int dividend,divisor;

        System.out.print("Enter dividend 1: ");
        dividend = lector.nextInt();

        System.out.print("Enter divisor 2: ");
        divisor = lector.nextInt();
        lector.close(); 

        while (dividend >= divisor){
            dividend -= divisor;
        }

        System.out.println("rest = " + dividend);
    } 
}