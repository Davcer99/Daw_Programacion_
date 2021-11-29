public class Comunes {
    public static void main(String[] args) {
        int [] n1= {1,2,3,4};
        int [] n2= {5,6,3,2};
        int [] numeros_duplicados = {0,0,0};
        int cont = 0, j;
        
        for (int i = 0; i < n1.length; i++) {

            for (j = 0; j < n1.length; j++) {
                
                if (n1[i] == n2[j]){
                    numeros_duplicados[cont] = n2[j];
                    cont++;
                } 
            }
            j= 0;
        }
        //imprimimos el array con los numeros duplicados
        Utilidades.mostrarArray(numeros_duplicados);
    }
}
