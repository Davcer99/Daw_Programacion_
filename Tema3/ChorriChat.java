import java.util.Random;

public class ChorriChat {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(4); 
        
        System.out.println("__________Chorry Chat__________");
        String palabra = Utilidades.leerCadena("");
        palabra = palabra.toLowerCase();

        if ( palabra.equals("hola") || palabra.equals("chao")){
            System.out.println("Hola, soy chorry, tu asistente");
        }else{
            System.out.println("Eres una persona maleducada");
        }

        while (true){
            palabra = Utilidades.leerCadena("");
            palabra = palabra.toLowerCase();
            rand = random.nextInt(4);
            switch (rand) {
                case 1:
                    System.out.println("Mmm, es un tema interesante");
                    break;
                case 2:
                    System.out.println("No he entendido lo que dices");
                    break;
                case 3:
                    System.out.println("Noo habloo tu idioma");
               
            }
            if (palabra.equals("chao") || palabra.equals("adios") ) {
                System.out.println("Ha sido un placer");
                break;
            }
        }
    }
}