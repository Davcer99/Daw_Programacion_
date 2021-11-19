import java.util.Scanner;

public class Ejercicio42 {
    
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int x,y;

        System.out.print("Enter number 1:");
        x = lector.nextInt();

        System.out.print("Enter number 2:");
        y = lector.nextInt();
        lector.close(); 

        int mult = x;
        int i = 1;

        while (i < y){
            mult += x;
            i ++;
        }

        System.out.println("result = " + mult);
    } 
}