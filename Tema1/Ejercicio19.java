import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String args[]){
        
        double precio_hora, horas_trabajadas, horas_extras, salario_bruto, precio_horas_extras;
        double salario_neto, i25, i45, r25, r45, impuestos ;
        
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        System.out.println("Introduce las horas trabajadas ");
        horas_trabajadas = entradaTeclado.nextInt();

        System.out.println("Introduce el precio hora ");
        precio_hora = entradaTeclado.nextInt();

        entradaTeclado.close();

        //calculo salario bruto

        horas_extras = horas_trabajadas - 35;
        horas_trabajadas = horas_trabajadas - horas_extras;
        precio_horas_extras = (precio_hora * 1.5);
        salario_bruto = (horas_trabajadas * precio_hora) + (horas_extras * precio_horas_extras);

        //calculo salario neto

        i25 = (salario_bruto - 500);
        
        i45 = i25 -400;

        if (i25 > 0) {
            r25 = i25 * 25 / 100;
        }else {
            r25 = 0;
        }
        if (i45 > 0) {
            r45 = i45 * 45 / 100;
        }else {
            r45 = 0;
        }
        salario_neto = salario_bruto - r25 -r45;

        //Calculo de impuestos 

        impuestos = r25 +r45;

        //imprimimos resultados 
        
        System.out.println("Con los datos proporcionados se ha calculado los siguientes datos:\n" + 
                            "Salario bruto = " + salario_bruto + 
                            "\nSalario neto = " + salario_neto +
                            "\n impuestos a pagar = " + impuestos);
    }
}