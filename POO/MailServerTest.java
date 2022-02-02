public class MailServerTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();
        MailClient paco = new MailClient(server, "Paco");

        System.out.println(server.howManyMailItems("Paco"));

        paco.sendMailItem("Paco", "dudas", "no hay dudas");
        paco.sendMailItem("Paco", "recibo", "bla bla bla");

        System.out.println(server.howManyMailItems("Paco"));
    }
}
