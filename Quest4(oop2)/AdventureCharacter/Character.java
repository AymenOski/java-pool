public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public int getMaxHealth() {
        return this.maxHealth;
    }
    public int getCurrentHealth() {
        return this.currentHealth;
    }
    public String getName() {
        return this.name;
    }

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    @Override
    public String toString() {
        if (this.currentHealth == 0){
            return String.format("%s : KO", this.name);
        }
        return String.format("%s : %d/%d",this.name ,this.currentHealth, this.maxHealth);
    }

    public void takeDamage(int hit) {
        if (this.currentHealth - hit <= 0){
            this.currentHealth = 0;
            return;
        }
        this.currentHealth -= hit;
    }
    public void attack(Character ch) {
        ch.takeDamage(9);
    }

}
