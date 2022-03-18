import Character.Job.Assassin;
import Character.Race.Human;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strenght;
import Character.Character;

public class Test {
    public static void main(String[] args) {
        
        Character pj1 = new Character("marco", new Human(),new Assassin(),new Dexterity(3),new Strenght(2), new Constitution(4), new Intelligence(2));
        
        System.out.println(pj1.toString());

        System.out.println(pj1.health());
        pj1.recivesDamage(30);
        pj1.heals(3);
        System.out.println(pj1.health());
        
    }
}
