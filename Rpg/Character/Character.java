package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strenght;
import Item.IConsumable;

public class Character implements IDamageable {
    
    private String name;
    private Race race;
    private Job job;
    private Dexterity dexterity;
    private Strenght strenght;
    private Constitution constitution;
    private Intelligence intelligence;
    private double health;

    //Constructor
    public Character(String name, Race race, Job job, Dexterity dexterity, Strenght strenght, Constitution constitution, Intelligence itnelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.dexterity = dexterity;
        this.strenght = strenght;
        this.constitution = constitution;
        this.intelligence = itnelligence;
        this.health = maxHealth();
    }

    //getters
    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    //se calcula el valor de la habilidad power
    public double velocity(){
        return (this.dexterity.getValue() + this.race.modifier(dexterity)+ this.job.modifier(dexterity))*2;
    }
    
    // se calcula el valor de la habilidad power
    public double power(){
        return (this.strenght.getValue() + this.race.modifier(strenght) + this.job.modifier(strenght))*2;
    }

    // se calcula el valor de la habilidad magia 
    public double magic(){
        return (this.intelligence.getValue() + this.race.modifier(intelligence) + this.job.modifier(intelligence))*2;
    }

    @Override
    public String toString() {
        return "My name is " + this.name + ". I'm an " + race.toString() + " " + job.toString() + " My stats are: Strenght: " + strenght.getValue() + " Dexterity: " + dexterity.getValue() + " Constitution: " + constitution.getValue() + " Intelligence: " + intelligence.getValue() + " Velocity: " + velocity() + " Power: " + power() + " Magic: " + magic() + " Health: " + health;
    }

    // Da la vida máxima del personaje
    @Override
    public double maxHealth() {
        return (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution))*25;
    }

    //devuelve la vida actual
    @Override
    public double health() {
        return this.health;
    }

    // Método para comprobar si el personaje estara muerto con el siguiente ataque 
    @Override
    public boolean isDeath(double damage) {
        if (damage > this.health){
            return true;
        }else{
            return false;
        }
    }

    // Restar vida
    @Override
    public void recivesDamage(double amount) {
        
        this.health -= amount;

        System.out.println(this.name + " recived " + amount + " damage. Health: " + health + " / " + maxHealth());
    }

    // Increnta la vida del personaje
    @Override
    public void heals(double amount) {
        this.health += amount; 
        System.out.println(this.name + " healed " + amount + " life. Health: " + health + " / " + maxHealth()); 
    }

    //Método para consumir objetos consumibles
    public void consumes(IConsumable consumible){
        consumible.consumedBy(this);
        System.out.println(this.name + " consumed: " + consumible.getClass().getSimpleName());
    }
}
