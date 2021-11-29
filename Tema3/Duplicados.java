public class Duplicados {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,2,3};

        System.out.print("Los numeros duplicados son los siguientes: ");
        
        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {
                
                if (numeros[i] == numeros[j]){
                    System.out.println(numeros[j]);
                } 
            }
        }
    }  
}