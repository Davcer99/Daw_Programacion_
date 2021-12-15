public class Longitud {
    public static String[] dividirPalabras (String cadenaDePalabras){
        String[] palabras;
        palabras = Utilidades.dividirEnPalabras(cadenaDePalabras);
        return palabras;
    }
    public static void main(String[] args) {
        String[] palabras;
        String cadenaDePalabras = "Hola que tal estas";

        palabras = dividirPalabras(cadenaDePalabras);

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i] + " Tiene " + palabras[i].length() + " caracteres");
        }
    }
}
