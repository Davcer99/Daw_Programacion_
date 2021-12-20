public class Alfabetica {

    public static boolean esAlfabetica (String palabra) {
        
        for (int i = 1; i < palabra.length(); i++) {
            if(palabra.charAt(i-1) < palabra.charAt(i)){

            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if (esAlfabetica("chino")){
            System.out.println("La palabra es Alfabetica");
        }else{
            System.out.println("La palabra no es alfabetica");
        }

        
    }
}