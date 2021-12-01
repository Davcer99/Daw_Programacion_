public class Igualdad {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};
        int[] copia = numeros.clone();
        boolean iguales = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == copia[i] ){
                iguales = true;
            }else{
                iguales = false;
                System.out.println("No son iguales");
                break;
            }
        }
        if (iguales == true){
            System.out.println("Los dos vectores son iguales");
        }
    }
}