package CutreCloud;

public class Test {
    public static void main(String[] args) {
        Usuario u1, u2;
        u1 = new Usuario("13@gmail.com", "12345678");
        u2 = new Usuario("13@gmail.com", "123");

        System.out.println(u1.toString()); 
        System.out.println(u2.toString());

        Media m1, m2;
        m1 = new Media(1, "media1", "hola", "video", u1);
        m2 = new Media(2, "media1", "jajaj", "algo", u2);

        System.out.println(m1.toString());
        System.out.println(m2.toString());

        System.out.println(Usuario.getListadoUsuarios());
        System.out.println(Media.getListadoMedia()); 
    }
}
