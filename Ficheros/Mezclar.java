import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mezclar {
    public static void main(String[] args) throws IOException {
        FileInputStream f_in1 = new FileInputStream("./archivos/f1.txt");
        FileInputStream f_in2 = new FileInputStream("./archivos/f2.txt");
        FileOutputStream f_out = new FileOutputStream("./archivos/f3.txt");

        byte[] buffer1 = new byte[6];
        byte[] buffer2 = new byte[6];
        int c = f_in1.read(buffer1);
        int d = f_in2.read(buffer2);

        

        while (c != -1 || d != -1) {
            
            if (c != -1){
                f_out.write(buffer1);
                c = f_in1.read(buffer1);
            }
            if (d != -1){
                f_out.write(buffer2);
                d = f_in2.read(buffer2);
            }
        }
        f_in1.close();
        f_in2.close();
        f_out.close();
    }
}