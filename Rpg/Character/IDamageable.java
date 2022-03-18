package Character;

public interface IDamageable {
    double maxHealth();
    double health();
    boolean isDeath(double damage);
    void recivesDamage(double amount);
    void heals(double amount);

}
