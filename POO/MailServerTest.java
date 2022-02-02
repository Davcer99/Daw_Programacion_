public class MailServerTest {
    public static void main(String[] args) {
        MailServer server = new MailServer();
        MailClient paco = new MailClient(server, "Paco");
        MailClient javier = new MailClient(server, "Javier");

        System.out.println(server.howManyMailItems("Paco"));
        System.out.println(server.howManyMailItems("Javier"));

        paco.sendMailItem("Paco;Javier", "dudas", "no hay dudas");
        paco.sendMailItem("Paco", "recibo", "bla bla bla");
        javier.sendMailItem("Paco;Javier", "ja", "jajajjajaj");

        System.out.println(server.howManyMailItems("Paco"));
        System.out.println(server.howManyMailItems("Javier"));
    }
}
