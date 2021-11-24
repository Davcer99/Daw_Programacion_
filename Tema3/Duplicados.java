public class Duplicados {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,2,3};
        int [] numeros_duplicados =new int [4];

        for (int i = 0; i < numeros.length; i++) {
            int j= i + 1;
            int cont = 0;
            while (true){
                if (j >= numeros.length){
                    break;
                }
                if (i == j){
                    j++;
                }
                if (numeros[i] == numeros[j]){
                    numeros_duplicados[cont] = numeros[j];
                    cont++;
                }
                j++;
            }
            j = 0;
        }
        System.out.print("Los numeros duplicados son los siguientes: ");
        for (int i = 0; i < numeros_duplicados.length; i++) {
            System.out.print(numeros_duplicados [i] + ", "); 
        }
        
    }  
}