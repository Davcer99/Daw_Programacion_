import java.util.Scanner;

public class Ejercicio36 {

    public static void main (String []args){

        double[] numeros = new double [10];
        double maximo = numeros [0];
        Scanner lector = new Scanner (System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dame un numero");
            numeros[i] = lector.nextDouble();
            System.out.println("");
        }

        lector.close();

        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] < maximo){
                maximo = numeros[i];
            }
        }
        System.out.println("El numero máximo es " + maximo);
    } 
}
