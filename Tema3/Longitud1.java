public class Longitud1 {
    public static String[] dividirPalabras (String cadenaDePalabras){
        String[] palabras;
        palabras = Utilidades.dividirEnPalabras(cadenaDePalabras);
        return palabras;
    }
    public static void main(String[] args) {
        String[] palabras;
        String cadenaDePalabras = "Hola que tal estas erni tybr";
        int longitudDeseada = 4, palabra = 0;

        palabras = dividirPalabras(cadenaDePalabras);

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == longitudDeseada){
                palabra++;
            }
        }
        System.out.printf("En la frase hay %d palabras con una longitud de %d caracteres", palabra , longitudDeseada);
        System.out.println("");
    }
}