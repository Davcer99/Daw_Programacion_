public class ClockTest {

    public static void main(String[] args) {
        ClockDisplay c1 ;
        c1 = new ClockDisplay(23,60, 59);
        System.out.println(c1.getTime()); 
        c1.timeTick();
        System.out.println(c1.getTime());

    }
    
}
