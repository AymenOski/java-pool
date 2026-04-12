import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    private static List<Character> allCharacters = new ArrayList<>();

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
        allCharacters.add(this);
    }

    public static String printStatus() {
        StringBuilder result = new StringBuilder();
        if (allCharacters.size() == 0) {
            result.append("------------------------------------------\n");
            result.append("Nobody's fighting right now !\n");
            result.append("------------------------------------------\n");
            return result.toString();
        }
        result.append("------------------------------------------\n");
        result.append("Characters currently fighting :\n");
        for (Character ch : allCharacters){
            result.append(String.format(" - %s\n", ch.toString()));
        }
        result.append("------------------------------------------\n");
        return result.toString();
    }

    public static Character fight(Character ch1, Character ch2) {
            for (;;){
                ch1.attack(ch2);
                if (ch2.getCurrentHealth() == 0){
                    return ch1; // winner
                }
                ch2.attack(ch1);
                if (ch1.getCurrentHealth() == 0){
                    return ch2; // winner
                }
            }
    }

    @Override
    public String toString() {
        if (this.currentHealth <= 0) {
            return String.format("%s : KO", this.name);
        }
        return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    public void takeDamage(int hit) {
        if (this.currentHealth - hit <= 0) {
            this.currentHealth = 0;
            return;
        }
        this.currentHealth -= hit;
    }

    public void attack(Character ch) {
        ch.takeDamage(9);
    }

}
