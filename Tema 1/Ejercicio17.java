import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String args[]) {
        byte horas, minutos, segundos;
          
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce la hora en formato hh ");
        horas = entradaTeclado.nextByte();

        System.out.println("Introduce los minutos en formato mm ");
        minutos = entradaTeclado.nextByte();

        System.out.println("Introduce los segundos en formato ss ");
        segundos = entradaTeclado.nextByte();

        entradaTeclado.close();

        if(horas > 24){

        }
        if(minutos > 60){

        }
        segundos ++;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        
        
    }
}