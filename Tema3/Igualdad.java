public class Igualdad {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4};
        int[] copia = numeros.clone();
        boolean iguales = false;

        if (numeros.length != copia.length){
            System.out.println("No son iguales");
        }else{
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == copia[i] ){
                    iguales = true;
                }else{
                    iguales = false;
                    break;
                }
            }
        }
  
        if (iguales == true){
            System.out.println("Los dos vectores son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
}