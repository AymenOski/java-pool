public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(CleanExtract.extract("The|. quick brown. | what do you ..| .fox .|. Jumps over the lazy dog. ."));
        System.out.println(CleanExtract.extract("  | Who am .I  | .love coding,  |  |.  Coding is fun . | ...  "));
    }
}

// $ javac *.java -d build
// $ java -cp build ExerciseRunner
// The quick brown fox Jumps over the lazy dog.
// I love coding, Coding is fun .
// $
