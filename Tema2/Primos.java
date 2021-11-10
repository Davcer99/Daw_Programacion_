public class Primos {

    public static void imprimirPrimosHasta (int numeros_comprobar){

      for (int i= 0;i<numeros_comprobar; i++ ){
            if (EsPrimo.esPrimo(i)){
                System.out.println(i);
            }
      } 
    }
    
    public static void main(String[] args) {
       imprimirPrimosHasta(300); 
    }
}