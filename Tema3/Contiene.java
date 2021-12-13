public class Contiene {
    public static boolean contiene (String s1, String s2){
        return s1.contains(s2);
    }
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Hola que tal";
        s2 = "Hola";

        boolean contiene = contiene(s1, s2);
        System.out.println(contiene);
         
    }
}