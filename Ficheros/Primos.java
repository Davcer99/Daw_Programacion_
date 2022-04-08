
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Primos {
     public static void main(String[] args) throws IOException {

        FileWriter f_out = new FileWriter("./archivos/primos.txt");
        String primos = primos(2,500);
        f_out.write(primos);
        f_out.close();
    }
    public static String primos (int n1, int n2){
        ArrayList <Integer>  list = new ArrayList<>();
        String result= "";
        for (int i= n1;i<n2; i++ ){
            if (esPrimo(i)){
                list.add(i);
            }
        } 

        for (Integer i : list) {
            
            result += i;
            result += "\n";
        }
        return result;
    }
    public static boolean esPrimo(int numero) {
       
        int contador = 0;

        for(int i = 1; i <= numero; i++){
            if((numero % i) == 0){
                contador++;
            } 
        }
        
        return (contador <= 2);
    }
}
