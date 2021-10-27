import java.util.Scanner;

public class Ejercicio18 {
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
        segundos ++;

        if (horas < 24 | minutos < 60 | segundos < 60){
            if (horas >= 24){
                horas = 00;
            }
            if (minutos >= 59) {
                minutos = 00;
                horas ++;
            }
            if (segundos >= 59){
                segundos = 00;
                minutos ++;
            }
        }else{
            System.out.println("El formato de la hora introducido no es valido ");
        }
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        
        
    }
}