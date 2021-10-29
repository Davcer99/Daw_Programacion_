import java.util.Scanner;

public class Entrada {

    public static int getInteger (){
        
        int numero;
        Scanner entradaTeclado;
       
        entradaTeclado = new Scanner(System.in);
        while (true){
            
            System.out.println("Introduce un valor");
            
           if (entradaTeclado.hasNextInt()){
                numero = entradaTeclado.nextInt();
                break;
            }else{
                entradaTeclado.nextLine();
            }
        }
        entradaTeclado.close();
         
        return numero;
    }

    public static double getDouble (){
        
        double numero;
        Scanner entradaTeclado;
       
        entradaTeclado = new Scanner(System.in);
        while (true){
            
            System.out.println("Introduce un valor");
            
           if (entradaTeclado.hasNextDouble()){
                numero = entradaTeclado.nextDouble();
                break;
            }else{
                entradaTeclado.nextLine();
            }
        }
        entradaTeclado.close();
         
        return numero;
    }  

    public static void main (String args[]){
      
      getInteger();

      getDouble();
      
    }

}