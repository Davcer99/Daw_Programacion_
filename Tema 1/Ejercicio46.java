import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int numero;
        int max = 100, min = 1;
    // Producir nuevo int aleatorio entre max y min    
    int aleatorio = (int) (Math.random() * (max - min + 1) + min);

        System.out.println("Bienvenido al juego de adivinar el numero.");

        while (true){
            System.out.println("Introducen un numero");
            numero = entradaTeclado.nextInt();

            if(numero == -1){
                break;
            }else if (numero < aleatorio){
                System.out.println("No has adivinado el numero :(, Pista: el numero es mayor al que has introducido");
            }else if (numero > aleatorio){
                System.out.println("No has adivinado el numero :(, Pista: el numero es menor al que has introducido");
            }else if (numero == aleatorio){
                System.out.println("Enhorabuena, Has ganado.");
                break;
            }
        }
        entradaTeclado.close();
    }
}