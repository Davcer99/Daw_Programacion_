public class Ejercicio41 {
    public static void main(String[] args) {
        double n1 = 1, n2 = 1;
        double i = 3, t;

        System.out.print("1, 1");

        while ( i <= 40){
            t = n1 + n2;
            
            
            n1 = n2;
            n2 = t;
            System.out.print( " " + n2 / n1 );
            i += +1;
        } 
    }
}