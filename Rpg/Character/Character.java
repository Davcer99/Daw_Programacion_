package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strenght;

public class Character {
    
    private String name;
    private Race race;
    private Job job;
    private Dexterity dexterity;
    private Strenght strenght;
    private Constitution constitution;
    private Intelligence itnelligence;

    public Character(String name, Race race, Job job, Dexterity dexterity, Strenght strenght, Constitution constitution,
            Intelligence itnelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.dexterity = dexterity;
        this.strenght = strenght;
        this.constitution = constitution;
        this.itnelligence = itnelligence;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    public double velocity(){
        return (this.dexterity.getValue() + this.race.modifier(dexterity)+ this.job.modifier(dexterity))*2;
    }
    
    

    

}
