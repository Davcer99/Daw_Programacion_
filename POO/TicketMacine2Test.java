public class TicketMacine2Test {
    public static void main(String[] args) {
        TicketMachine2 m1;

        m1 = new TicketMachine2(30);
        m1.insertMoney(50);
        m1.printTicket();
        System.out.println(m1.refundBalance()); 

    }
}
