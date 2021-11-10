public class Potencia {
    
    
    public static double potencia (double n1, double n2) {
      double resultado = Math.pow(n1, n2);
      return resultado;
    }
    
    public static void main(String[] args) {
       double potencia = potencia(3, 6);
       System.out.println(potencia);
    }
    
}
