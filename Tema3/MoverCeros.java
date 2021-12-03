public class MoverCeros {
    public static void main(String[] args) {
       int[] numeros = {0,0,0,2,0,3,0,4};

       //Recorremos el array para buscar los ceros 
       for (int i = numeros.length -1; i >= 0; i--) {
           if (numeros[i] == 0){
            moverCeroDerecha (numeros, i);
           }
            
        }
        //Imprimimos el array resultante
        Utilidades.mostrarArray(numeros);
    }

    public static void moverCeroDerecha(int[] numeros, int pos) {
        //Recorre el array desplazando los valores hacia la izquierda 
        for (int i = pos; i < numeros.length; i++) {
            numeros[i] = numeros [i + 1];
            numeros [i + 1] = 0;
        }
    } 
}