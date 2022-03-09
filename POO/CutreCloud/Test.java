package CutreCloud;

public class Test {
    public static void main(String[] args) {
        Usuario u1, u2;
        u1 = new Usuario("13@gmail.com", "12345678");
        u2 = new Usuario("10@gmail.com", "123");

        u1.writeXml();
        u2.writeXml();
    }
}
