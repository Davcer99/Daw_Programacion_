import java.util.Scanner;

class Eliminar {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        int valor;
        Scanner es = new Scanner(System.in);

        System.out.println("Introduce el valor del array que quieres eliminar valor del 0 al 9");
        valor = es.nextInt();
        es.close();

        if (valor > numeros.length){
            System.out.println("El valor introducido es mayor al tamaño del array");
        }else{
            numeros[valor] = 0;
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + ", ");
            }
        }
    }
}