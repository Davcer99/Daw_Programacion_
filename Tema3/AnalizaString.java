public class AnalizaString {

    public static void main(String[] args) {
        String cadena =Utilidades.leerCadena("Introduce una cadena de texto");
        int digitos = 0, letras = 0, otros = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (Character.isDigit(cadena.charAt(i))){
                digitos ++;
            }else if (Character.isLetter(cadena.charAt(i))){
                letras ++;
            }else {
                otros ++;
            }
        }

        System.out.println("En la cadena introducida hay "+ digitos + " digitos");
        System.out.println("En la cadena introducida hay "+ letras + " letras");
        System.out.println("En la cadena introducida hay "+ otros + " tipos distintos de caracteres");
    }   
}