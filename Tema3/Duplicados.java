public class Duplicados {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,2,3};
        int [] numeros_duplicados =new int [4];
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {
                
                if (numeros[i] == numeros[j]){
                    numeros_duplicados[cont] = numeros[j];
                    cont++;
                } 
            }
        }
        System.out.print("Los numeros duplicados son los siguientes: ");
        for (int i = 0; i < numeros_duplicados.length; i++) {
            System.out.print(numeros_duplicados [i] + ", "); 
        }
        
    }  
}