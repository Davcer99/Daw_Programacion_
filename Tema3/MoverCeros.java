public class MoverCeros {
    public static void main(String[] args) {
       int[] numeros = {0,0,0,2,0,3,0,4};

       //Recorremos el array para buscar los ceros 
       for (int i = 0; i < numeros.length; i++) {

           if (numeros[i] == 0){
               //Con la utilidad elemento hecha anteriormente borramos el cero y lo ponemos al final del array
                Utilidades.eliminarElemento(numeros, i);
            }
        }
        //Imprimimos el array resultante
        Utilidades.mostrarArray(numeros);
    } 
}
