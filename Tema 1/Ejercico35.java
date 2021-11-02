import java.util.Scanner;
public class Ejercico35 {

    public static void main (String args[]){
        
        int nota, media = 0, total_notas= 1, numero_notas = 0;
        boolean fin = false, sobersaliente = false;
        int[] notas = {0} ;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner (System.in);
        
        
       for (int i = 0; fin == false; i++) {
            System.out.println("Introduce tu nota, si quieres terminar introduce -1");
            nota = entradaTeclado.nextInt();

            notas[i] = nota;
            total_notas += nota;
            numero_notas = i;
            if (notas[i] == -1){
                fin = true;
            } 
        }
        for (int l = 0; l < notas.length; l++){

            if (notas[l] == 10){
                sobersaliente = true;
            }
        }
             
        entradaTeclado.close();
        media = total_notas / numero_notas;
        System.out.println("la nota media es: " + media);

        if (sobersaliente = true){
            System.out.println("Has sacado un sobresaliente" + sobersaliente);
        }
    }  
}
