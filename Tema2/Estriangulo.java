public class Estriangulo {
    public static boolean estriangulo (int n1, int n2, int n3){
        if (n1 > n2 + n3){
            return false;
        }else if ( n2 > n1 + n3){
            return false;
        }else if (n3 > n1 + n2){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        boolean tri = estriangulo(12, 10, 10);
        System.out.println(tri);
    }
}