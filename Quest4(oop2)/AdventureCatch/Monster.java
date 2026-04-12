public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() <= 0) {
            return String.format("%s is a monster and is dead. He has the weapon %s", this.getName(), this.getWeapon().toString());
        }
        return String.format("%s is a monster with %d HP. He has the weapon %s", this.getName(), this.getCurrentHealth(), this.getWeapon().toString());
    }

    @Override
    public void takeDamage(int hit) throws DeadCharacterException{
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
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
    public void attack(Character ch) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if (this.getWeapon() != null) {
            ch.takeDamage(this.getWeapon().getDamage());
            return;
        }
        ch.takeDamage(7);
    }
}
