public class Encriptar {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Introduce el texto que deseas encriptar");
        int n = Utilidades.leerEntero("Introduce la n");
        String resultado = "";
        
        for (int i = 0; i < cadena.length(); i++) {
            char letra;
            letra =cadena.charAt(i);
            letra += n; 
            resultado += letra;
        }

        System.out.println(resultado);
    }
}