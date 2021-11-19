import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        int binario, resto, decimal=0, i=0;

        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el numero binario: ");
        binario = lector.nextInt();
        lector.close();

        while (binario != 0){
            resto = binario % 10;
            decimal = decimal + (resto * (int) Math.pow(2, i));
            i++;
            binario = binario / 10;
        }
        System.out.println(decimal);
    }
}