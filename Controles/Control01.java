import java.util.Scanner;

class Control01 {
    
    public static void main(String args[]){
    
        int lados;
        double longitud;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Dime el numero de lados del poligono: ");
        lados = entradaTeclado.nextInt();

        if (lados == 3 || lados ==4){
            System.out.println("Dime la longitud del lado del poligono: ");
            longitud = entradaTeclado.nextDouble();
            
            if (lados == 3){
                System.out.println("El perimetro del triangulo es: " + longitud * 3);
            }else{
                System.out.println("El perimetro del cuadrado es: " + longitud * 4);
            }
        }
        entradaTeclado.close();
    }       
}