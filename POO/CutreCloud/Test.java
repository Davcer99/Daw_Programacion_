package CutreCloud;

public class Test {
    public static void main(String[] args) {
        Usuario u1, u2;
        u1 = new Usuario("13@gmail.com", "12345678");
        u2 = new Usuario("10@gmail.com", "123");

        System.out.println(u1.toString()); 
        System.out.println(u2.toString());

        Media m1, m2;
        m1 = new Media( "media1", "hola", MediaType.AUDIO, u1);
        m2 = new Media( "media3", "jajaj", MediaType.VIDEO, u2);

        System.out.println(m1.toString());
        System.out.println(m2.toString());

        System.out.println(Usuario.getListadoUsuarios());
        System.out.println(Media.getListadoMedia()); 

        Media.eliminarMedia("media3");
        Media.eliminarTipoMedia(MediaType.AUDIO);
        Usuario.eliminarUsuario("10@gmail.com"); 
    }
}
