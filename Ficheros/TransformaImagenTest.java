import java.io.File;
import java.io.IOException;

public class TransformaImagenTest {
    public static void main(String[] args) {
        File image = new File("./penyagolosa.bmp");
        TransformaImagen ti = new TransformaImagen(image);
        try {
            ti.transformaNegativo();
            ti.transformaNegroBlanco();
            ti.transformaOscuro();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}