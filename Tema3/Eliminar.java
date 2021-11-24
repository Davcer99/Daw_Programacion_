class Eliminar {
    
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int valor;

        while(true){

            valor = Utilidades.leerEntero("introduce el valor que deseas eliminar");
            
            if (valor > numeros.length){
                System.out.println("El valor introducido es mayor al tamaño del array");
            }else{
                break;
            }
        }   
        if (valor < numeros.length){
            numeros[valor] = 0;
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + ", ");
            }
        }
    }
}