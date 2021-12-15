public class Longitud3 {
    public static String[] dividirPalabras (String cadenaDePalabras){
        String[] palabras;
        palabras = Utilidades.dividirEnPalabras(cadenaDePalabras);
        return palabras;
    }

    public static void main(String[] args) {
        String[] palabras;
        String cadenaDePalabras = "Hola que tal estas erni tybr";
        int longitudDeseada = 5, palabra = 0;

        palabras = dividirPalabras(cadenaDePalabras);

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() < longitudDeseada){
                palabra++;
            }
        }

        if (palabra == (palabras.length -1)){
            System.out.println("Todas las palabras son cortas");
        }else{
            System.out.println("Hay alguna palabra larga ");
        }
    }
}