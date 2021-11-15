public class Potencia {
    
    
  public static double potencia (double x, double n) {
    if (n == 0){
      return 1;
    }else{
      return (x *potencia(x, n-1));
    }
  }
    
    public static void main(String[] args) {
       double potencia = potencia(3, 6);
       System.out.println(potencia);
    }
    
}
