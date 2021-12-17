public class Siglas {
    public static String[] extraerPalabras (String frase) {
        return Utilidades.dividirEnPalabras(frase);
   }
   public static String extraerSiglas (String[] palabras) {
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

        palabras = extraerPalabras(frase);

        System.out.println(extraerSiglas(palabras));
    }
}
