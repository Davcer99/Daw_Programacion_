package CutreCloud;
    
public class Test {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Julio@cutrecloud.com", "hacker");
        Usuario u2 = new Usuario("Pepe@cutrecloud.com", "123456");
        Usuario u3 = new Usuario("marca@cutrecloud.com", "abc");
        Usuario u4 = new Usuario("astuto@cutrecloud.com", "abc");

        //Media m1 = new Media(3, "song.mp3", "blablabal", MediaType.AUDIO, u1);
        //System.out.println(u1.getEmail());
        
        u1.writeXml();
        u2.writeXml();
        u3.writeXml();
        u4.writeXml();

        Usuario.loadXML();
    }
}