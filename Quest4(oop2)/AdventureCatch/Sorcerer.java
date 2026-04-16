public class Sorcerer extends Character implements Healer{
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity ,Weapon weapon){
        super(name, maxHealth ,weapon);
        this.healCapacity = healCapacity;
    }

    // must implement 
    public int getHealCapacity(){
        return this.healCapacity;
    }
    public void heal(Character ch)throws DeadCharacterException{
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }

        if (ch.getCurrentHealth() + this.healCapacity >= ch.getMaxHealth()){
            ch.setCurrentHealth(ch.getMaxHealth());
            return;
        }
        ch.setCurrentHealth(ch.getCurrentHealth() + this.healCapacity);
    }

    @Override
    public String toString() {
        if (this.getCurrentHealth() <= 0) {
            return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. He has the weapon %s", this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1),this.getHealCapacity(), this.getWeapon().toString(), this.getWeapon().toString());
        }
        return String.format("%s is a sorcerer with %d HP. It can heal %d HP. He has the weapon %s", this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1), this.getCurrentHealth(), this.getHealCapacity(), this.getWeapon().toString());
    }

    @Override
    public void takeDamage(int hit) throws DeadCharacterException{
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        int newHealth = this.getCurrentHealth() - hit;

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
        try{
            this.heal(this);
        }catch(DeadCharacterException e){
            throw new DeadCharacterException(this);
        }
        ch.takeDamage(10);
    }
}
