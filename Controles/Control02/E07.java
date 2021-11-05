package Control02;

import java.util.Scanner;

public class E07 {
    public static void main (String []args){

        int hora , incremento, hora_sumada;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);

        System.out.print("Hora actual: ");
        hora = entradaTeclado.nextInt();

        System.out.print("Cantidad de horas: ");
        incremento = entradaTeclado.nextInt();

        entradaTeclado.close();
       
        hora_sumada = hora + incremento;

        while (true){
        if (hora_sumada > 24){
            hora_sumada -= 24;
        }else {
            break;
        }
       }
        
        System.out.println("En " + incremento + " horas, el reloj marcara las " + hora_sumada);  
    }
}
