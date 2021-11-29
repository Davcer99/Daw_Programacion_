public class Igualdad {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};
        int[] copia = numeros.clone();
        

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == copia[i] ){

            }else{
                System.out.println("No son iguales");
            }
        }
    }
}
