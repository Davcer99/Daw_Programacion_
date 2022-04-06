import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mezclar2 {
    public static void main(String[] args) throws IOException {
        
        FileReader fr1 = new FileReader("./archivos/f1.txt");
        BufferedReader bf1 = new BufferedReader(fr1); 
        
        FileReader fr2 = new FileReader("./archivos/f2.txt");
        BufferedReader bf2 = new BufferedReader(fr2);

        FileWriter f_out = new FileWriter("./archivos/f3.txt");

        String c = bf1.readLine();
        String d = bf2.readLine();
        

        while (c != null || d != null) {
            if (c != null){
               f_out.write(c);
               c = "\n";
               f_out.write(c);
               c = bf1.readLine();
            }
            if (d != null){
                f_out.write(d);
                d = "\n";
                f_out.write(d);
                d = bf2.readLine();   
            }
        }
        bf1.close();
        bf2.close();
        f_out.close();
    }  
}


