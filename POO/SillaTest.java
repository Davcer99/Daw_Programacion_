
public class SillaTest {
    public static void main(String[] args) {

        Silla []sillas = new Silla[100];
        
        for (int i = 0; i < 100; i++) {
            Silla silla = new Silla();
            System.out.println( "Silla " + i + "\n");
            silla.imprimirValores();
            sillas [i] = silla;
        }  
    }
}