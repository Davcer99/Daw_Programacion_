public class LastIndexOf {
    public static int letrasQueContiene (String s1, String s2){
        
        return s1.indexOf(s2);
    }
    public static void main(String[] args) {
        String s0,s1;
        s0 = "Hola que tal ";
        s1 = "e";
        

        System.out.println(letrasQueContiene(s0, s1));
    } 
}
