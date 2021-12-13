public class Longitud {
    public static void main(String[] args) {
        String[] palabras;
        String cadenaDePalabras = "Hola que tal estas";

        palabras = Utilidades.dividirEnPalabras(cadenaDePalabras);

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i] + " Tiene " + palabras[i].length() + " caracteres");
        }
    }
}
