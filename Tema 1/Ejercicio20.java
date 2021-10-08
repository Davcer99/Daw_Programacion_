import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String args[]){
    
        double precio, descuento5, descuento10;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce el precio del producto ");
        precio = entradaTeclado.nextByte();

        entradaTeclado.close();

        if ( precio >= 6 && precio < 60) {
            descuento5 = precio * 5 / 100;
            System.out.println("Se aplicara un descuento del 5% \nEl precio final del producto es = " + (precio - descuento5));
        }else if (precio >=60) {
            descuento10 = precio * 10 /100;
            System.out.println("Se aplicara un descuento del 10% \nEl precio final del producto es = " + (precio - descuento10));
        }else {
            System.out.println("No se aplicara ningun descuento");
        }

    }
        
}
