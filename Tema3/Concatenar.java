public class Concatenar {
    public static String concatenar (String s1, String s2, String s3){
        String con =s1.concat(s2);

        return con.concat(s3);
    }
    public static void main(String[] args) {
        String s0,s1, s2;
        s0 = "Soy david ";
        s1 = "Hola que tal";
        s2 = "Buenas tardes como estas";

        System.out.println(concatenar(s0, s1, s2));

        
    }
}
