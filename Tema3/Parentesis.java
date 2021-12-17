public class Parentesis {
    public static void main(String[] args) {
        String cadena = "Hola(que tal)";
        int contador = 0;
        boolean parentesisMal= false;

        for(int i = 0; i < cadena.length(); i++){

            if (contador == 0 && cadena.charAt(i)== ')'){
                parentesisMal = true;
                break;
            }

			if (cadena.charAt(i)== '('){
				contador++;
			}else if (cadena.charAt(i) == ')'){
                contador--;
            }
		}

        if(contador == 0){
            System.out.println("Los parentesisi están bien puestos");
        }else if (contador != 0 || parentesisMal == true){
            System.out.println("Los parentesis están bien puestos");
        }

    }
}