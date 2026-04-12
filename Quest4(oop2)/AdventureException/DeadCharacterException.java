public class DeadCharacterException extends Exception {
    private Character ch;

    public DeadCharacterException(Character ch) {
        this.ch = ch;
    }

    public String getMessage() {
        try {
            String type = "";
            if (this.ch instanceof Monster) {
                type = "monster";
            } else if (this.ch instanceof Sorcerer) {
                type = "sorcerer";
            } else if (this.ch instanceof Templar) {
                type = "templar";
            }
            return String.format("The %s %s is dead.", type, this.ch.getName());
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
