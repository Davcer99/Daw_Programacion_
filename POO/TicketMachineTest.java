public class TicketMachineTest {
    public static void main(String[] args) {
        
        TicketMachine m1, m2;
        m1 = new TicketMachine(200);
        m2 = new TicketMachine();

        m1.prompt();
        m1.insertMoney(100);
        m1.printTicket();
        System.out.println(m1.getTotal());
        m1.showPrice();
        m1.empty();
        m1.showPrice();

        m2.insertMoney(50);
        m2.printTicket();
        m2.empty();
        System.out.println(m2.getTotal());


    }
}
