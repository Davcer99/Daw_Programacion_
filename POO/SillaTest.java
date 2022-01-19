import java.util.Random;
import java.awt.Point;

public class SillaTest {
    public static void main(String[] args) {

        Random ran = new Random();
        String [] material = {"madera", "alumninio", "plastico", "inoxidable"};
        String [] color = {"Rojo", "Amarillo", "Verde", "Morado", "Marron", "Azul "};
        
        for (int i = 0; i < 100; i++) {

            System.out.println("\nSilla numero " + i + "\n");
            boolean respaldo = false;
            Point ubicacion = new Point (ran.nextInt(100-0+1)+0, ran.nextInt(100-0+1)+0);

            if (ran.nextInt(1-0+1)+0 == 1){
                respaldo = true;
            }else {
                respaldo = false;
            }

            Silla iSilla = new Silla(color[ran.nextInt(5-0+1)+0], 4, respaldo, ran.nextInt(10-0+1)+0, material[ran.nextInt(3-0+1)+0], ubicacion);
        
            iSilla.imprimirValores(); 
        }  
    }
}