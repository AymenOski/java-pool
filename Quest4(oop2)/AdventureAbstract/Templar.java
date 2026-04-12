public class Templar extends Character implements Healer, Tank{
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield){
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    // must implement 
    // from the Healer interface
    public int getHealCapacity() {
        return this.healCapacity;
    }
    public void heal(Character ch){
        if (ch.getCurrentHealth() + this.healCapacity >= ch.getMaxHealth()){
            ch.setCurrentHealth(ch.getMaxHealth());
            return;
        }
        ch.setCurrentHealth(ch.getCurrentHealth() + this.healCapacity);
    }
    // from the Tank interface
    public int getShield(){
        return this.shield;
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() <= 0) {
            return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.", this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1),this.shield, this.healCapacity);
        }
        return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1),this.getCurrentHealth(),this.healCapacity, this.shield);
    }

    @Override
    public void takeDamage(int hit) {
        int newHealth = this.getCurrentHealth() - (hit - this.shield) ;

        if (newHealth <= 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(newHealth);
        }
    }

    @Override
    public void attack(Character ch) {
        this.heal(this);
        ch.takeDamage(6);
    }

}
