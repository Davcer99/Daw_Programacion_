public class EjercicioRepasoArrays {
    //Crea un programa en el que creas un array de 1000 enteros en las posiciones pares han de aparecer los multiplos de tres y en las impares los multiplos de 7 empezando por cada uno despues de rellenarlo debemos imprimir el contenido del array cuyas posicionees que son multiplo de 13
    
    public static void main(String[] args) {
        int[] numeros = new int [1000];

        int multiplo3 =3;
        for (int i = 0; i< numeros.length; i = i + 2){
            numeros[i]= multiplo3 + 3;
        }

        int multiplo7 = 7;
        for (int i = 1; i< numeros.length; i = i + 2){
            numeros[i]= multiplo7 + 7;
        }

        for (int i = 13; i < numeros.length; i += 13) {
           System.out.println(numeros[i]); 
        }
    }
}
