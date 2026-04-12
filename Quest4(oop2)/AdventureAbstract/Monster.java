public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() <= 0) {
            return String.format("%s is a monster and is dead", this.getName());
        }
        return String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth());
    }

    @Override
    public void takeDamage(int hit) {
        // flooring already happened automatically (java performs INTEGER DIVISION)
        int reducedDamage = hit * 80 / 100;

        int newHealth = this.getCurrentHealth() - reducedDamage;

        if (newHealth <= 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(newHealth);
        }
    }

    @Override
    public void attack(Character ch) {
        ch.takeDamage(7);
    }
}
