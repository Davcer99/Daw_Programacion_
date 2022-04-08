import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LeerPrimos {
     public static void main(String[] args) throws IOException {

        FileReader f_in = new FileReader("./archivos/primos.txt");
        BufferedReader bf_1 = new BufferedReader(f_in);
        
        String c = bf_1.readLine();
        
        while (c != null) {
          System.out.println(c); 
          c = bf_1.readLine(); 
        }
        f_in.close();
    }
    
}


