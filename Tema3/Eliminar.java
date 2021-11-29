class Eliminar {
    
    public static void main(String[] args) {
        //int [] numeros = new int[10];
        int valor;
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        //Utilidades.rellenaArray(numeros, 1, 20);
        //Pide el valor por pantalla y comprueba que sea correcto 
        do{

            valor = Utilidades.leerEntero("introduce el valor que deseas eliminar");
             
        }while (valor < 0 || (valor > (numeros.length -1)));
        
        // Desplazamos todos los valores del array un valor menos (mover los numeros hacia la izquierda) 
        for (int i = valor + 1; i < numeros.length; i++) {
            numeros[i-1] = numeros[i];
        }
        // Ponemos un cero al elemento final del array
        numeros[numeros.length -1] = 0;
        //imprimimos el array
        Utilidades.mostrarArray(numeros);
    }
}