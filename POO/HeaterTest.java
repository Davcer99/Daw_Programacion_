public class HeaterTest {
    public static void main(String[] args) {
        Heater c1 ;
        c1 = new Heater(11, 26);

        c1.setIncrement(4);
        c1.warmer();
        c1.warmer();
        c1.warmer();
        c1.cooler();
        c1.cooler();
        c1.cooler();
        c1.cooler();
    }
}
