public class Invertida {
   public static String[] palabras (String frase) {
        return Utilidades.dividirEnPalabras(frase);
   }
   public static String invertir (String[] palabras) {
       String resultado ="";
       for (int i = (palabras.length - 1); i >= 0; i--) {
           resultado += (palabras[i]+ " ");
       }
       return resultado;
    }
    public static void main(String[] args) {
        String frase = "Esto es una frase";
        String[] palabras;

        palabras = palabras(frase);

        System.out.println(invertir(palabras));
    }
}
