public class Remplazar {
    public static String concatenar (String s1, String s2, String s3){
        
        return s1.replace(s2, s3);
    }
    public static void main(String[] args) {
        String s0,s1, s2;
        s0 = "Hola que tal ";
        s1 = "a";
        s2 = "o";

        System.out.println(concatenar(s0, s1, s2));
    } 
}