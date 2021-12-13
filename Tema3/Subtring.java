public class Subtring {
    public static String s_string (String s1){
        

        return s1.substring(5, 8);
    }
    public static void main(String[] args) {
        String s0;
        s0 = "Hola que tal ";
        
        System.out.println(s_string(s0));
    }
}