import java.io.IOException;
import java.util.stream.Stream;

public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        System.out.println(StreamMap.sumOfStringLength(Stream.of("Bonjour", "le", "monde !")));
        System.out.println(StreamMap.upperCaseAllString(Stream.of("IL", "Fait", "beaU !!")));
        System.out.println(StreamMap.uniqIntValuesGreaterThan42(Stream.of(23.439, 42.34, 39194.4)));
    }
}

// $ javac *.java -d build
// $ java -cp build ExerciseRunner 
// 16
// [IL, FAIT, BEAU !!]
// [42, 39194]
// $ 
