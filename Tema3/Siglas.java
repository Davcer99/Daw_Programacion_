public class Siglas {
    public static String[] palabras (String frase) {
        return Utilidades.dividirEnPalabras(frase);
   }
   public static String siglas (String[] palabras) {
       String resultado ="";

        for (int i = 0; i < palabras.length; i++) {
            if (Character.isUpperCase(palabras[i].charAt(0))){
                resultado += (palabras[i].charAt(0));
            } 
        }
        
        return resultado;
    }
    public static void main(String[] args) {
        String frase = "Educacion de Secundaria e Obligatoria ";
        String[] palabras;

        palabras = palabras(frase);

        System.out.println(siglas(palabras));
    }
}
