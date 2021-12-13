public class CompararIgnorecase {
    public static int comparar (String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Hola que tal";
        s2 = "Buenas tardes como estas";

        int comparacion = comparar(s1, s2);

        if (comparacion == 0){
            System.out.println("Las cadenas son iguales");
        }else if (comparacion > 0){
            System.out.println(s1 +" es mayor que " + s2);
        }else{
            System.out.println(s2 +" es mayor que " + s1);
        } 
    }
}
