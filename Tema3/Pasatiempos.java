public class Pasatiempos {

    public static boolean isVocal (char caracter){
        String vocales = "aeiou";
        if (vocales.charAt(0)== caracter|| vocales.charAt(1)== caracter || vocales.charAt(2)== caracter || vocales.charAt(3)== caracter || vocales.charAt(4)== caracter){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        String cadena = Utilidades.leerCadena("Introduce una cadena de texto");
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (isVocal(cadena.charAt(i))){
                resultado += ".";
            }else{
                resultado += cadena.charAt(i);
            }
        }
        System.out.println(resultado);
    }
}