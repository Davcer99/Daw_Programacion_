public class Ej1 {
    public static boolean esDivisible (int n , int m ){
        if (n % m == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main (String args[] ){
        boolean div = esDivisible(7, 1);
        
        System.out.println(div);
    }
}
