public class Ends {
    public static boolean termina (String s1, String s2){
        return s1.endsWith(s2);
    }
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Hola que tal";
        s2 = "l";

        boolean contiene = termina(s1, s2);
        System.out.println(contiene);
         
    }
}
