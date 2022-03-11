package CutreCloud;

import java.util.Scanner;

public class UsuarioInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Introduce un 1 para crear un nuevo usuario o introduce un 2 para terminar");
            int value = sc.nextInt();
            if ( value == 1) {
                System.out.print("Introduce el correo: ");
                String email = sc.nextLine();
                System.out.println("");
                System.out.print("Introduce la contraseña: ");
                String password = sc.nextLine();
                int i =0;
                Usuario iUsuario = new Usuario(email, password);
                i++;
                System.out.println(iUsuario);
                System.out.println(i);
            }else{
                sc.close();
                break;
            }
        }
        
    }
}
