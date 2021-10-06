import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String args[]) {
        byte precio_hora, horas_trabajadas;
          
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Precio por hora ");
        precio_hora = entradaTeclado.nextByte();

        System.out.println("Horas trabajadas ");
        horas_trabajadas = entradaTeclado.nextByte();

        

        entradaTeclado.close();

        segundos ++;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        
        
    }
}
