public class ArgumentosSuma {
    public static void main (String args[]){

        double suma = 0;

        for (int index = 0; index < args.length; index++) {
           
            System.out.println(args[index]);
            System.out.println("Argumentos " + index);

            double numero = Double.parseDouble(args[index]);
            suma += numero;
        }
        
        System.out.println(suma);
    }
}