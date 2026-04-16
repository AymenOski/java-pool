import java.util.Set;

public class ExerciseRunner {

    public static void main(String[] args) {
        System.out.println(Wedding.createCouple(Set.of("Pikachu", "Dracaufeu", "Tortank"), Set.of("Legolas", "Aragorn", "Gimli")));
    }
}

// $ javac *.java -d build
// $ java -cp build ExerciseRunner
// {Pikachu=Legolas, Tortank=Gimli, Dracaufeu=Aragorn}
// $
// 
