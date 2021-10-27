import java.util.Scanner;

public class Ejercicio24 {
    
    public static void main(String args[]){
    
        boolean wasTen = false;
        double sum = 0;
        double i = 0;
        double grade = 0;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        while(true){
            if (grade != -1){
                System.out.println("Introduce la nota");
                grade = entradaTeclado.nextDouble();
                
                if (grade != -1){
                    sum = sum + grade;
                    i = i + 1;
                    if (grade == 10){
                        wasTen = true;
                    }
                }
            }else {
                System.out.println("Average: " + (sum / i));
                if (wasTen){
                    System.out.println("There was a 10");
                } else {
                    System.out.println("There was not a 10");
                }
                break;
            }
        }
        entradaTeclado.close();
    } 
}