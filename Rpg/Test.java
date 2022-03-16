import Character.Race.Human;
import Character.Stat.Dexterity;

public class Test {
    public static void main(String[] args) {
        Dexterity d1 = new Dexterity(5);

        Human h1 = new Human();
        System.out.println(d1.getValue()); 
        System.out.println(h1.modifier(d1));
        System.out.println(d1.getValue());
    }
}
